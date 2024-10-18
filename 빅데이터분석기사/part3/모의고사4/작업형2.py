import pandas as pd
from sklearn.preprocessing import StandardScaler
from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestClassifier
from sklearn.metrics import accuracy_score

x_train = pd.read_csv('heart_x_train.csv')
x_test = pd.read_csv('heart_x_test.csv')
y_train = pd.read_csv('heart_y_train.csv')

# 데이터 확인
# print(x_train)
# x_train.info() # 결측치 없음
print(x_train.describe()) # 스케일링 필요

# 훈련, 검증 분리
x_train, x_valid, y_train, y_valid = train_test_split(x_train, y_train,
                                                      stratify=y_train,
                                                      random_state=42)
y_train = y_train['DEATH_EVENT']
y_valid = y_valid['DEATH_EVENT']
print(f"x_train.shape : {x_train.shape}")
print(f"x_valid.shape : {x_valid.shape}")
print(f"y_train.shape : {y_train.shape}")
print(f"y_valid.shape : {y_valid.shape}")

scaler = StandardScaler()
x_train_scaled = scaler.fit_transform(x_train)
x_valid_scaled = scaler.transform(x_valid)
x_test_scaled = scaler.transform(x_test)

model = RandomForestClassifier()
model.fit(x_train_scaled, y_train)
y_pred = model.predict(x_valid_scaled)

accuracy = accuracy_score(y_valid, y_pred)
print(accuracy)

y_pred_test = model.predict(x_test_scaled)

pd.DataFrame({'prediction' : y_pred_test}).to_csv('모의고사4.csv', index=False)