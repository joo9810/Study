import sys

N, M, B = map(int, sys.stdin.readline().split())

dct = dict()

for _ in range(N):
    input_ground = list(map(int, sys.stdin.readline().split()))
    for ground in input_ground:
        if ground in dct.keys():
            dct[ground] += 1
        else:
            dct[ground] = 1

min_height = min(dct)
max_height = max(dct)

time_dct = dict()

for goal_height in range(min_height, max_height+1):
    inventory = B
    time = 0
    for height in sorted(dct, reverse=True):
        if height >= goal_height:
            time += (height - goal_height)*2*dct[height]
            inventory += (height - goal_height)*dct[height]
        elif height < goal_height:
            inventory -= (goal_height - height)*dct[height]
            if inventory < 0:
                break
            time += (goal_height - height)*dct[height]
    if inventory >= 0:
        if time in time_dct:
            time_dct[time].append(goal_height)
        else:
            time_dct[time] = [goal_height]

min_time = min(time_dct)
print(min_time, max(time_dct[min_time]))