import sys

MBTI = sys.stdin.readline().rstrip()

N = int(sys.stdin.readline())

count = 0

for i in range(N):
    if MBTI == sys.stdin.readline().rstrip():
        count += 1

sys.stdout.write(str(count))