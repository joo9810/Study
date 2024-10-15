import pandas as pd
from sklearn.preprocessing import StandardScaler
from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestClassifier
from sklearn.metrics import accuracy_score, f1_score

x_train = pd.read_csv('x_train.csv')
y_train = pd.read_csv('y_train.csv')
x_test = pd.read_csv('x_test.csv')
# x_train.info() # 결측치 존재
# x_test.info() # 결측치 없음

df_mean = x_train.mean()
x_train.fillna(df_mean, inplace=True)
x_train.info() # 결측치 모두 제거됨

print(x_train.describe())

x_train, x_valid, y_train, y_valid = train_test_split(x_train, y_train, test_size=0.2,
                                                      stratify=y_train, random_state=42)

scaler = StandardScaler()

x_train_scaled = scaler.fit_transform(x_train)
x_valid_scaled = scaler.transform(x_valid)
x_test_scaled = scaler.transform(x_test)

model = RandomForestClassifier()
model.fit(x_train_scaled, y_train)
y_pred = model.predict(x_valid_scaled)

accuracy = accuracy_score(y_pred, y_valid)
f1 = f1_score(y_pred, y_valid, average='micro')

print(accuracy)
print(f1)

y_pred_test = model.predict(x_test_scaled)

df = pd.DataFrame({'predictions' : y_pred_test})
df.to_csv('모의고사1.csv', index=False)
