def sn(num):
    result = num
    for i in str(num):
        result += int(i)
    return result

is_self_num = [True] * 10001

for i in range(1, 10001):
    if is_self_num[i] == True:
        current_num = i
        while True:
            d_num = sn(current_num)
            if sn(current_num) <= 10000:
                is_self_num[d_num] = False
                current_num = d_num
            else:
                break

for i in range(1, 10001):
    if is_self_num[i] == True:
        print(i)