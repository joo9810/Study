import sys

N = int(sys.stdin.readline().rstrip())

num_list = sorted(list(map(int, sys.stdin.readline().split())))

good_count = 0

for i in range(N):
    current_num = num_list[i]

    left, right = 0, N-1
    while left < right: # 같은 수를 더하면 안되기 때문에 <=는 안됨

        if left == i:
            left += 1
            continue

        if right == i:
            right -= 1
            continue

        current_sum = num_list[left] + num_list[right]

        if current_num == current_sum:
            good_count += 1
            break
        elif current_num < current_sum:
            right -= 1
        else:
            left += 1

print(good_count)