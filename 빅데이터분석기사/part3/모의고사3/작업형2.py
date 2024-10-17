import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import LabelEncoder, StandardScaler
from sklearn.ensemble import RandomForestRegressor
from sklearn.metrics import r2_score, mean_absolute_error


x_train = pd.read_csv('house_x_train.csv')
x_test = pd.read_csv('house_x_test.csv')
y_train = pd.read_csv('house_y_train.csv')

# 데이터 확인
# print(x_train)
# print(x_train.info()) # 결측치 없음
# print(x_train['ocean_proximity'].value_counts())

# 라벨 인코딩
label_encoder = LabelEncoder()
x_train['ocean_proximity'] = label_encoder.fit_transform(x_train['ocean_proximity'])
x_test['ocean_proximity'] = label_encoder.transform(x_test['ocean_proximity'])
# print(x_train)
# print(x_test)

# 분포 확인
# print(x_train.describe()) # 스케일링 필요

# 훈련, 검증 분리
x_train, x_valid, y_train, y_valid = train_test_split(x_train, y_train,
                                                      test_size = 0.2, random_state = 42)
y_train = y_train['median_house_value']
y_valid = y_valid['median_house_value']

print(f"x_train.shape: {x_train.shape}")
print(f"x_valid.shape: {x_valid.shape}")
print(f"y_trainSR.shape: {y_train.shape}")
print(f"y_validSR.shape: {y_valid.shape}")

# scaler = StandardScaler()
# cols = ['total_rooms', 'total_bedrooms', 'population', 'households']
# x_train[cols] = scaler.fit_transform(x_train[cols])
# x_valid[cols] = scaler.transform(x_valid[cols])
# x_test[cols] = scaler.transform(x_test[cols])
# print(x_train.describe())

model = RandomForestRegressor()
model.fit(x_train, y_train)
y_pred = model.predict(x_valid)

r2 = r2_score(y_valid, y_pred)
mae = mean_absolute_error(y_valid, y_pred)
print(r2, mae)

pd.DataFrame({'prediction' : y_pred}).to_csv('모의고사3.csv', index=False)