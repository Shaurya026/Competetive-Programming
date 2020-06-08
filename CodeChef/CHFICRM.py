t = int(input())
denom = {5:0,10:0,15:0}
while t > 0:
    t -= 1
    n = int(input())
    arr = list(map(int,input().split()))
    flag = True
    for i,j in enumerate(arr):
        if i == 0 and j!=5:
            flag = False#print("NO")
            break
        denom[j] += 1
        if j == 10:
            if denom[5] > 0:
                denom[5] -= 1
                continue
            else:
                flag = False
                break
        elif j == 15:
            if denom[10] > 0:
                denom[10] -= 1
                continue
            else:
                flag = False
                break
    if flag == False:
        print('NO')
    else:
        print("YES")
    denom = {5:0,10:0,15:0}


