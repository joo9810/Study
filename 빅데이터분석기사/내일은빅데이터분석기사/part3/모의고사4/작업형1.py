import pandas as pd

df = pd.read_csv('Loan_Default.csv')
# print(df)
# df.info()

# 1.
int_rate = df['int_rate']
# print(int_rate)
Q1 = int_rate.quantile(0.25)
# print(Q1)

print(int(int_rate[int_rate <= Q1].mean()))

# 2.
df2 = df[['loan_amnt', 'annual_inc']]
df2.dropna(inplace=True)
loan_amnt = df2['loan_amnt']
# print(loan_amnt)
high10 = loan_amnt.quantile(0.9)
low10 = loan_amnt.quantile(0.1)

high10df = df2[df2['loan_amnt'] >= high10]
low10df = df2[df2['loan_amnt'] <= low10]

print(int(high10df['annual_inc'].mean() - low10df['annual_inc'].mean()))

# 3.
df3 = df[['annual_inc', 'int_rate']]
print(round(df3.corr()['int_rate'][0], 3))






