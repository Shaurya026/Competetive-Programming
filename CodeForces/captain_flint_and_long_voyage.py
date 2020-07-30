t = int(input())
for i in range(t):
    n = int(input())
    t8 = 0
    if n % 4 == 0:
        t8 = n//4
        t9 = n - t8
        ans = ""
        for j in range(t9):
            ans += '9'
        for j in range(t8):
            ans += '8'
        print(ans)
        continue
    
    else:
        t8 = n//4 + 1
        t9 = n - t8
        ans = ""
        for j in range(t9):
            ans += '9'
        for j in range(t8):
            ans += '8'
        print(ans)
        continue