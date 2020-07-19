t = int(input())
for i in range(t):
    n = int(input())
    dct = dict()
    flag = True
    string = input()
    if n % 2 == 1:
        print("NO")
        continue
    for j in string:
        dct[j] = dct.get(j,0) + 1
    for v in dct.values():
        if v % 2 == 1:
            print("NO")
            flag = False
            break
    if flag == True:
        print("YES")
            
    