import pandas as pd
from sklearn.preprocessing import StandardScaler
from sklearn.ensemble import RandomForestClassifier
from sklearn.metrics import accuracy_score, f1_score
from sklearn.model_selection import train_test_split

x_train = pd.read_csv('card_x_train.csv')
y_train = pd.read_csv('card_y_train.csv')
x_test = pd.read_csv('card_x_test.csv')

# print(y_train.value_counts()) # 불균형 데이터

y_trainSR = y_train['Class']

# x_train.info() # 결측치 없음
# print(x_train.describe()) # 스케일링 필요

x_train, x_valid, y_train, y_valid = train_test_split(x_train, y_trainSR, test_size=0.2,
                                                      stratify=y_trainSR, random_state=42)

print(f"x_train.shape : {x_train.shape}")
print(f"x_valid.shape : {x_valid.shape}")
print(f"y_train.shape : {y_train.shape}")
print(f"y_valid.shape : {y_valid.shape}")

scaler = StandardScaler()
x_train_scaled = scaler.fit_transform(x_train)
x_valid_scaled = scaler.transform(x_valid)
x_test_scaled = scaler.transform(x_test)
# print(pd.DataFrame(x_train_scaled).describe())

model = RandomForestClassifier()
model.fit(x_train_scaled, y_train)
y_pred = model.predict(x_valid_scaled)
accuracy = accuracy_score(y_valid, y_pred)
f1 = f1_score(y_valid, y_pred)
print(accuracy)
print(f1)

y_pred_test = model.predict(x_test_scaled)
result_df = pd.DataFrame({'Class' : y_pred_test})
print(result_df.value_counts())

result_df.to_csv('모의고사2.csv', index=False)