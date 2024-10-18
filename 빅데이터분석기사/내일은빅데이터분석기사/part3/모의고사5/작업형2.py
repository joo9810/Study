import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestClassifier
from sklearn.metrics import roc_auc_score, accuracy_score

x_train = pd.read_csv('cancer_x_train.csv')
x_test = pd.read_csv('cancer_x_test.csv')
y_train = pd.read_csv('cancer_y_train.csv')

# 데이터 확인
# x_train.info() # 결측치 없음
# print(y_train)
target_dict = {'M' : 1, 'B' : 0}
y_train['diagnosis'] = y_train['diagnosis'].map(target_dict)
print(y_train)

# 훈련, 검증 분리
x_train, x_valid, y_train, y_valid = train_test_split(x_train, y_train,
                                                      test_size = 0.2,
                                                      random_state = 42)
y_train = y_train['diagnosis']
y_valid = y_valid['diagnosis']

print(f"x_train.shape : {x_train.shape}")
print(f"x_valid.shape : {x_valid.shape}")
print(f"y_train.shape : {y_train.shape}")
print(f"y_valid.shape : {y_valid.shape}")

model = RandomForestClassifier()
model.fit(x_train, y_train)
y_pred_valid = model.predict(x_valid)

roc_auc = roc_auc_score(y_valid, y_pred_valid)
accuracy = accuracy_score(y_valid, y_pred_valid)
print(roc_auc, accuracy)

y_pred_test = model.predict(x_test)
y_pred_test = ['M' if i == 1 else 'B' for i in y_pred_test]
print(y_pred_test)
pd.DataFrame({'prediction' : y_pred_test}).to_csv('모의고사5.csv', index=False)