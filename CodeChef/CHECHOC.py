t = int(input())
for te in range(t):
    lst = list(map(int,input().split()))
    N = lst[0]
    M = lst[1]
    X = lst[2]
    Y = lst[3]
    if N*M > 1:
        x = min([X,Y])
    y = min([2*X,Y])
    a = N*M
    print(x*((a + 1)//2) + (y-x)*(a//2))