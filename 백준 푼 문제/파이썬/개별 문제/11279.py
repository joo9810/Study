import sys
import heapq

queue = []

N = int(sys.stdin.readline().rstrip())

for _ in range(N):
    num = int(sys.stdin.readline().rstrip())
    if num == 0:
        if len(queue) == 0:
            print(0)
        else:
            print(heapq.heappop(queue)[1])
    else:
        heapq.heappush(queue, (-num, num))