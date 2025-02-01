import sys

N = int(sys.stdin.readline().rstrip())

paper = []

for _ in range(N):
    paper.append(list(map(int, sys.stdin.readline().split())))

white = 0
blue = 0

def check_color(x, y, size):
    color = paper[x][y]
    for i in range(x, x+size):
        for j in range(y, y+size):
            if paper[i][j] != color:
                return False # 중간에 시작점과 다른 색이 있으면 False
    return True

def divide_paper(x, y, size):
    global blue
    global white
    if check_color(x, y, size):
        if paper[x][y] == 1:
            blue += 1
        else:
            white +=1
    else:
        new_size = int(size/2)
        divide_paper(x, y, new_size)
        divide_paper(x+new_size, y, new_size)
        divide_paper(x, y+new_size, new_size)
        divide_paper(x+new_size, y+new_size, new_size)

# 함수 실행
divide_paper(0, 0, N)

print(white)
print(blue)