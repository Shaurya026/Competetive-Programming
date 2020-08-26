t = int(input())
for tt in range(t):
    n = int(input())
    nt = input()
    ans = ""
    for i in range(n):
        ans += nt[i:n+i][i]
    print(ans)