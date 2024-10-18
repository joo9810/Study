import pandas as pd
from scipy.stats import kruskal

df = pd.read_csv('5-3.csv')

# print(df)
# df.info() # 결측치 없음

A = df['City_A_Pollution']
B = df['City_B_Pollution']
C = df['City_C_Pollution']

# 1.
s = (A.sum() + B.sum() + C.sum()) / (len(A) + len(B) + len(C))
print(int(s))

# 2.
statistic, p_value = kruskal(A, B, C)
print(round(statistic, 4))

# 3.
print(p_value)

# 4.
print("기각")