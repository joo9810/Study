import sys

while True:
    stack = []
    string = sys.stdin.readline().rstrip()
    if string == ".":
        break
    string_list = [i for i in string]
    no_state = False
    for i in string_list:
        try:
            if i == "(" or i == "[":
                stack.append(i)
            elif i == ")" and stack[-1] == "(":
                stack.pop(-1)
            elif i == "]" and stack[-1] == "[":
                stack.pop(-1)
            elif i == "]" or i == ")":
                stack.append(i)
        except:
            sys.stdout.write("no\n")
            no_state = True
            break
    
    if no_state == True:
        continue
    elif len(stack) == 0:
        sys.stdout.write("yes\n")
    else:
        sys.stdout.write("no\n")