t = int(input())
for i in range(t):
    lst = list(map(int,input().split()))
    pos = lst[1]
    lst_ = list(map(int,input().split()))
    ans = 100000000000000
    ind = -1
    for j in lst_:
        if pos % j == 0:
            a = pos//j
            if a < ans:
                ans = a
                ind = j
    print(ind)