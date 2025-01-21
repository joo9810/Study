from queue import Queue
import sys

N = int(sys.stdin.readline())
q = Queue()
for i in range(1, N+1):
    q.put(i)

while q.qsize() > 1:
    # 맨 위에 카드 버리기
    q.get()

    # 맨 위의 카드를 맨 아래로 옮기기
    temp = q.get()
    q.put(temp)

sys.stdout.write(str(q.get()))