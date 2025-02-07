import sys

N, M = map(int, sys.stdin.readline().split())

money_list = [int(sys.stdin.readline().rstrip()) for _ in range(N)]

left = max(money_list)
right = sum(money_list)

while left <= right:
    mid = (left + right) // 2
    count = 1
    current_money = mid
    for i in range(len(money_list)-1):
        current_money -= money_list[i]
        if current_money < money_list[i+1]:
            count += 1
            current_money = mid
    
    if count > M:
        left = mid + 1
    else:
        result = mid
        right = mid - 1

print(result)