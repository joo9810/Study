import pandas as pd
from scipy.stats import wilcoxon

df = pd.read_csv('4-3.csv')
print(df)

before = df['BP_before']
after = df['BP_after']

# 1.
diff = before - after
print(round(diff.mean(), 2))

# 2.
statistic, p_value = wilcoxon(before, after, alternative='greater')
print(int(statistic))

# 3.
print(p_value)

# 4.
print("기각")