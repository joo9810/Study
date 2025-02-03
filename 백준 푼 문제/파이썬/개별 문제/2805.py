import sys

N, M = map(int, sys.stdin.readline().split())

tree_list = list(map(int, sys.stdin.readline().split()))

# 이분 탐색
left = 0
right = max(tree_list)
while left <= right:
    pick = int((left + right) / 2)

    total = 0
    # 절단기로 나무 자른 후 길이 확인
    total = sum(tree - pick for tree in tree_list if tree > pick)
    
    if total >= M:
        result = pick
        left = pick + 1
    else:
        right = pick - 1

print(result)