import sys

N, K = map(int, sys.stdin.readline().split())

num_list = list(map(int, sys.stdin.readline().split()))

total = 0
for i in num_list:
    if i % 2 == 0:
        total += i // 2
    else:
        total += i // 2 + 1

if total >= N:
    print("YES")
else:
    print("NO")