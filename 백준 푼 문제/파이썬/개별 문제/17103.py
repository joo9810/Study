import sys

prime_list = [True for _ in range(1000001)]

prime_list[0] = False
prime_list[1] = False

for i in range(2, 1000001):
    if prime_list[i] == True:
        for j in range(i*2, 1000001, i):
            prime_list[j] = False

prime_num = []
for i in range(len(prime_list)):
    if prime_list[i] == True:
        prime_num.append(i)

T = int(sys.stdin.readline())

for i in range(T):
    num = int(sys.stdin.readline())
    count = 0

    for prime in prime_num:
        if prime > num/2:
            break
        if prime_list[num - prime] == True:
            count += 1
    
    sys.stdout.write(str(count) + '\n')