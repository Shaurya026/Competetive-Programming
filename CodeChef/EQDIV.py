k = int(input())
t = int(input())
for tt in range(t):
    n = int(input())
    lst = []
    for i in range(1,n+1):
        lst.append(i**k)
    x = sorted(lst,reverse = True)
    ans = []
    for i in range(n):
        ans.append(0)
    ix = len(x) - 1
    A = 0
    B = 0
    for i in x:
        if A > B:
            B += i
        else:
            A += i
            ans[ix] = 1
        ix -= 1
    print(abs(A-B))
    for i in ans:
        print(i,end='')
    print()