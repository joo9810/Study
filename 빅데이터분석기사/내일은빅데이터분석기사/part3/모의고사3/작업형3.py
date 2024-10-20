import pandas as pd
from scipy.stats import f_oneway

df = pd.read_csv('3-3.csv')
print(df)

# 1.
groupA = df[df['Method'] == 'A']['Score']
groupB = df[df['Method'] == 'B']['Score']
groupC = df[df['Method'] == 'C']['Score']
print(round(groupA.var(), 2))
print(round(groupB.var(), 2))
print(round(groupC.var(), 2))

# 2.
statistic, p_value = f_oneway(groupA, groupB, groupC)
print(round(statistic, 2))

# 3.
print(p_value)

# 4.
print("기각")