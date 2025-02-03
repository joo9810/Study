import sys
from collections import deque

N, M = map(int, sys.stdin.readline().split())

queue = deque()
visited = [False] * (N+1)

dct = dict()

for i in range(1, N+1):
    dct[i] = []

for _ in range(M):
    u, v = map(int, sys.stdin.readline().split())
    dct[u].append(v)
    dct[v].append(u)

area = 0

for i in range(1, N+1):
    # 해당 노드를 방문하지 않았다면 BFS 시작
    if visited[i] == False:
        queue.append(i)
        while queue:
            current = queue.popleft()
            for node in dct[current]:
                if visited[node] == False:
                    queue.append(node)
                    visited[node] = True
        
        area += 1

print(area)