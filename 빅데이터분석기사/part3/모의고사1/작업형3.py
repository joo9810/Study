import pandas as pd
from scipy.stats import ttest_rel

df = pd.read_csv('1-3.csv')
df.info()

# 1.
before = df['Before_Weight']
after = df['After_Weight']
difference = after - before
print(round(difference.mean(), 2))

# 2.
statistic, p_value = ttest_rel(after, before, alternative='less')
print(round(statistic, 4))

# 3.
print(p_value)

# 4.
# 기각