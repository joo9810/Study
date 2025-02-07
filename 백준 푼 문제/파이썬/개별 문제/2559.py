import sys

N, K = map(int, sys.stdin.readline().split())

temp_list = list(map(int, sys.stdin.readline().split()))

before_temp = sum(temp_list[:K])
max_temp = before_temp

for i in range(1, N-(K-1)):
    current_temp = before_temp + temp_list[i+(K-1)] - temp_list[i-1]
    before_temp = current_temp
    if current_temp > max_temp:
        max_temp = current_temp 

print(max_temp)