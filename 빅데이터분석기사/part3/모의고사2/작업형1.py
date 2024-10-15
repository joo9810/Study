import pandas as pd
from sklearn.preprocessing import LabelEncoder

df = pd.read_csv('Students.csv')
# df.info() # 결측치 없음

# 1.
df['Total'] = df['math score'] + df['reading score'] + df['writing score']
# print(df)
print(df.groupby('race/ethnicity')['Total'].sum().idxmax())

# 2.
high_score = df['math score'].sort_values().quantile(0.9)
low_score = df['math score'].sort_values().quantile(0.1)

high_student = df[df['math score'] >= high_score]['writing score']
low_student = df[df['math score'] <= low_score]['writing score']
print(int(low_student.mean() - high_student.mean()))

# 3.
label_encoder = LabelEncoder()
df['lunch'] = label_encoder.fit_transform(df['lunch'])
print(df['lunch'])
print(df[['lunch', 'Total']].corr())

