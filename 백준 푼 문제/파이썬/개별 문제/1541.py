import sys

string = sys.stdin.readline().rstrip() # "55-50+40"

num_list = []
op_list = []

start_index = 0
end_index = 0
for i in range(len(string)):
    if string[i] == "-" or string[i] == "+":
        end_index = i
        num_list.append(int(string[start_index:end_index]))
        op_list.append(string[i])
        start_index = i+1
    elif i == len(string)-1:
        num_list.append(int(string[start_index:]))

# print(num_list)
# print(op_list)

# 첫 마이너스가 나온 이후로는 무조건 빼면 됨 (괄호를 쳐서 어떻게든 빼게 만들기 가능)
minus_state = False
total = num_list[0]
for i in range(len(op_list)):
    if op_list[i] == "-":
        minus_state = True
    
    if minus_state == False:
        total += num_list[i+1]
    else:
        total -= num_list[i+1]

print(total)