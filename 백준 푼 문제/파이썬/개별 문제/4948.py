import sys

last_num = 123456*2+1
num_list = [True for _ in range(last_num)] # 0~123456 인덱스까지 False

num_list[0] = False
num_list[1] = False

for i in range(2, last_num):
    if num_list[i] == True: # i가 소수이면
        for j in range(i*2, last_num, i): # i의 배수들은 모두 False
            num_list[j] = False


while True:
    num = int(sys.stdin.readline())
    if num == 0:
        break
    first_index = num+1
    last_index = num*2+1
    new_list = num_list[first_index:last_index]
    sys.stdout.write(str(sum(new_list)) + '\n')