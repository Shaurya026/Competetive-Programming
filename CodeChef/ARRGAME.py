t = int(input())
for tt in range(t):
    n = int(input())
    arr = list(map(int,input().split()))
    max_zero = 0
    dct = dict()
    i = 1
    while i <= n-1:
        tmp = 0
        while arr[i] == 0:
            tmp += 1
            i += 1
        if tmp == 0:
            i += 1
            continue
        dct[tmp] = dct.get(tmp,0) + 1
        if tmp > max_zero:
            max_zero = tmp
        i += 1

    x = sorted(dct.keys())
    if len(x) >= 2:
        if max_zero % 2 == 1 and dct[max_zero] == 1 and x[-2] < (max_zero + 1) // 2:
            print("Yes")
        else:
            print("No")
    elif max_zero % 2 == 1 and dct[max_zero] == 1:
        print("Yes")
    else:
        print("No")
