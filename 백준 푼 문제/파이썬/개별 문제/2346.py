import sys
from collections import deque

N = int(sys.stdin.readline())

dq = deque()
baloons = list(map(int, sys.stdin.readline().split()))

for index, move in enumerate(baloons):
    dq.append((index+1, move))

index, move = dq.popleft()
sys.stdout.write(str(index) + " ")
while dq:
    if move > 0:
        dq.rotate(-(move-1))
    else:
        dq.rotate(-(move))
    
    index, move = dq.popleft()
    sys.stdout.write(str(index) + " ")