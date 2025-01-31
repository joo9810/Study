from collections import deque
import sys

N, M, V = map(int, sys.stdin.readline().rstrip().split())

graph = {i : [] for i in range(1, N+1)}

# 1 : [2, 3, 4]
# 2 : [1, 4]
# 3 : [1, 4]
# 4 : [1, 2, 4]

# 양방향 간선 저장
for i in range(M):
    a, b = map(int, sys.stdin.readline().rstrip().split())
    graph[a].append(b)
    graph[b].append(a)

# 정점 번호 작은 것부터 방문하도록 정렬
for key in graph:
    graph[key].sort()

# 방문을 표시할 집합
visited = set()

def dfs(node, visited):
    visited.add(node)
    print(node, end=" ")
    for neighbor in graph[node]:
        if neighbor not in visited:
            dfs(neighbor, visited)

def bfs(node):
    queue = deque()
    visited = set()
    queue.append(node)
    visited.add(node)

    while queue:
        current_node = queue.popleft()
        print(current_node, end=" ")
        for i in graph[current_node]:
            if i not in visited:
                queue.append(i)
                visited.add(i)

dfs(V, visited)
print()
bfs(V)