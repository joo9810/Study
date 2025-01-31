import sys

N = int(sys.stdin.readline())
arr1 = map(int, sys.stdin.readline().split())
M = int(sys.stdin.readline())
arr2 = map(int, sys.stdin.readline().split())

dct = dict()
for i in arr1:
    dct[i] = 1

for j in arr2:
    try:
        sys.stdout.writelines(str(dct[j]) + "\n")
    except:
        sys.stdout.writelines("0\n")