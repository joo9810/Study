import sys

T = int(sys.stdin.readline().rstrip())

for i in range(T):
    lst = [] 
    ps_list = [i for i in sys.stdin.readline().rstrip()]
    for ps in ps_list:
        try:
            if ps == "(":
                lst.append(ps)
            elif ps == ")" and lst[-1] == "(":
                lst.pop(-1)
            else:
                lst.append(ps)
        except:
            lst.append(ps)
    
    if len(lst) == 0:
        sys.stdout.write("YES\n")
    else:
        sys.stdout.write("NO\n")