import sys

N = int(sys.stdin.readline())

count = 0
num = 1
while True:
    if num**2 > N:
        break
    else:
        count += 1
        num += 1

sys.stdout.write(str(count) + "\n")

# 1 0 0
# 1 2 3

# 1 0 0 1
# 1 2 3 4

# 1 0 0 1 0
# 1 2 3 4 5

# 1 0 0 1 0 0
# 1 2 3 4 5 6

# 1 0 0 1 0 0 0
# 1 2 3 4 5 6 7

# 1 0 0 1 0 0 0 0
# 1 2 3 4 5 6 7 8

# 1 0 0 1 0 0 0 0 1
# 1 2 3 4 5 6 7 8 9