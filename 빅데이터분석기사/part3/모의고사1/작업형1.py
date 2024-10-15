import pandas as pd

df = pd.read_csv('avocado.csv')

# 문제 1
type = df[df['AveragePrice'] <= 1]['type']
type_series = type.value_counts() / len(type)
# print(type_series)
conventional = int(type_series.values[0] * 100)
organic = int(type_series.values[1] * 100)

print(conventional)
print(organic)

# 문제 2
type_conventional_min = df[df['type'] == 'conventional']['Total Volume'].min()
type_organic_max = df[df['type'] == 'organic']['Total Volume'].max()
print(int(type_organic_max - type_conventional_min))

# 문제 3
region_volume = df.groupby('region')[['AveragePrice', 'Total Volume']].mean()
sorted_region = region_volume.sort_values('Total Volume', ascending=False)
# print(sorted_region)
top_5 = sorted_region.head(5)
bottom_5 = sorted_region.tail(5)

mean_top5 = top_5['AveragePrice'].mean()
mean_bottom5 = bottom_5['AveragePrice'].mean()

print(round(mean_top5 - mean_bottom5, 2))


