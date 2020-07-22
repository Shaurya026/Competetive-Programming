t = int(input())
for i in range(t):
    n = int(input())
    if n % 2 == 1 and n != 1:
        print(n//2)
        continue
    while n % 2 == 0:
        n = n // 2
    if n == 1:
        print(0)
        continue
    else:
        print(((n-1)//2))