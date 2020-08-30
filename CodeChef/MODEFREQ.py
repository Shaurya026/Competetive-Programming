t = int(input())
for tt in range(t):
    n = int(input())
    arr = list(map(int,input().split()))
    dct = dict()
    for i in arr:
        dct[i] = dct.get(i,0) + 1
    dct2 = dict()
    for i in dct.values():
        dct2[i] = dct2.get(i,0) + 1
    maxim = -1
    ans = 0
    x = sorted(dct2)
    for i in x:
        if dct2[i] > maxim:
            maxim = dct2[i]
            ans = i
    print(ans)