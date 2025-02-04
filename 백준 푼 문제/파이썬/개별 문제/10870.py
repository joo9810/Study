import sys

N = int(sys.stdin.readline().rstrip())

fib = []

fib.append(0)
fib.append(1)

for i in range(2, N+1):
    fib.append(fib[-1] + fib[-2])

print(fib[N])