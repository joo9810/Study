import pandas as pd
from scipy.stats import f_oneway

df = pd.read_csv('2-3.csv')
# print(df)

print(df)

# 1.
print(int(df['C'].mean()))

# 2.
A = df['A']
B = df['B']
C = df['C']
statistic, p_value = f_oneway(A, B, C)
print(round(statistic, 4))

# 3.
print(p_value)

# 4.
# 기각