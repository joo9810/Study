import sys

N = int(sys.stdin.readline().rstrip())

x_list = []
y_list = []

for i in range(N):
    x, y = map(int, sys.stdin.readline().split())
    x_list.append(x)
    y_list.append(y)

x_list.sort()
y_list.sort()

sys.stdout.write(str(2*(x_list[-1] - x_list[0]) + 2*(y_list[-1] - y_list[0])))