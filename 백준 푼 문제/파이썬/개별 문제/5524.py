import sys

N = int(sys.stdin.readline().rstrip())

for i in range(N):
    name = sys.stdin.readline().rstrip().lower()
    sys.stdout.write(name + "\n")