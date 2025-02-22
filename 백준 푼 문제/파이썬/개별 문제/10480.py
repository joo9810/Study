import sys

N = int(sys.stdin.readline().rstrip())

for i in range(N):
    num = int(sys.stdin.readline().rstrip())
    if (num % 2 == 0):
        sys.stdout.write(str(num) + " is even\n")
    else:
        sys.stdout.write(str(num) + " is odd\n")