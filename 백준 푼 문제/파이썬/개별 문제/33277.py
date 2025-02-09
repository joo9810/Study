import sys

N, M = map(int, sys.stdin.readline().split())

# N : M = 24*60 : x
# 1440M / N = x

a = 1440*M / N

print(f"{int(a // 60):02}:{int(a % 60):02}")