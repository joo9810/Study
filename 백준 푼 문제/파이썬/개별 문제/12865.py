import sys

N, K = map(int, sys.stdin.readline().split())

weight = []
value = []

for i in range(N):
    W, V = map(int, sys.stdin.readline().split())
    weight.append(W)
    value.append(V)

dp = []

for i in range(N):
    dp.append([0] * (K+1))

for i in range(N):
    for j in range(K+1):
        if i == 0:
            if j >= weight[i]:
                dp[i][j] = value[i]
        else:
            if j < weight[i]:
                dp[i][j] = dp[i-1][j]
            else:
                dp[i][j] = max(dp[i-1][j-weight[i]] + value[i], dp[i-1][j])

print(dp[N-1][K])