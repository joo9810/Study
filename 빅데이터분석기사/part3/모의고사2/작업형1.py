import pandas as pd

df = pd.read_csv('Students.csv')
# df.info() # 결측치 없음

# 1.
df['Total'] = df['math score'] + df['reading score'] + df['writing score']
# print(df)
print(df.groupby('race/ethnicity')['Total'].sum().idxmax())

# 2.
