import pandas as pd
from sklearn.preprocessing import StandardScaler

df = pd.read_csv('diabetes.csv')
print(df.info())
print(df)

scaler = StandardScaler()
df['BMI'] = scaler.fit_transform(df[['BMI']])
print(df)


