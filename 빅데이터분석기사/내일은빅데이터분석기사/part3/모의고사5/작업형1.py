import pandas as pd
from sklearn.preprocessing import StandardScaler

df = pd.read_csv('diabetes.csv')
print(df.info())
# print(df)

scaler = StandardScaler()
df['BMI'] = scaler.fit_transform(df[['BMI']])
# print(df)

# 1.
BMI = df[df['BMI'] >= 0.5]
# BMI.info()
print(round(BMI['Outcome'].mean(), 3))

# 2.
df = pd.read_csv('diabetes.csv')
outcome1 = df[df['Outcome'] == 1]
outcome0 = df[df['Outcome'] == 0]
print((outcome1.std() - outcome0.std()).sort_values().index[0])

# 3.
df = pd.read_csv('diabetes.csv')
bins = [0, 30, 40, float('inf')]
labels = ['30대 이하', '40대 이하', '50대 이상']

df['AgeGroup'] = pd.cut(df['Age'], bins=bins, labels=labels)
# print(df)
age30 = int(df[df['AgeGroup'] == '30대 이하']['BloodPressure'].mean())
age40 = int(df[df['AgeGroup'] == '40대 이하']['BloodPressure'].mean())
age50 = int(    df[df['AgeGroup'] == '50대 이상']['BloodPressure'].mean())

print(age30, age40, age50)