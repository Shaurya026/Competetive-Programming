t = int(input())
master = 'abcdefghijklmnopqrstuvwxyz'
for i in range(t):
    string = input().split('z')
    #print(string)
    flag = True
    for k in string:
        if not(k in master):
            flag = False
            print("NO")
            break
    if flag == True:
        print("YES")
