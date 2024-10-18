import pandas as pd
from sklearn.preprocessing import MinMaxScaler, LabelEncoder

df = pd.read_csv('Mental health.csv')
# print(df)
# print(df.info())

# 1.
mean_age = df['Age'].mean()
# print(mean_age)
df['Age'] = df['Age'].fillna(mean_age)
# print(df['Age'])

scaler = MinMaxScaler()
df['Age'] = scaler.fit_transform(df[['Age']])

print(len(df[df['Age'] >= 0.7]))



# 2.
hour_list = []
for i in df['Timestamp']:
    hour_list.append(i.split()[1])

AMPM_list = []
for i in hour_list:
    if int(i.split(':')[0]) >= 12:
        AMPM_list.append('PM')
    else:
        AMPM_list.append('AM')

df['AM/PM'] = AMPM_list
# print(df)

AM_df = df[df['AM/PM'] == 'AM']
# print(AM_df)
print(len(AM_df[AM_df['specialist for a treatment'] == 'No']))

# 3.
convert_dict = {'Yes' : 1, 'No' : 0}

# print(df)
df['Marital status'] = df['Marital status'].map(convert_dict)
df['Depression'] = df['Depression'].map(convert_dict)
df['Anxiety'] = df['Anxiety'].map(convert_dict)
df['Panic attack'] = df['Panic attack'].map(convert_dict)
df['specialist for a treatment'] = df['specialist for a treatment'].map(convert_dict)
# print(df) # Yes : 1, No : 0

df['Total'] = df['Marital status'] + df['Depression'] + df['Anxiety'] + df['Panic attack'] + df['specialist for a treatment']
# print(df)

sorted_df = df.sort_values('Total', ascending=False).head(10)['current year of Study']
print(sorted_df.mode().values[0])