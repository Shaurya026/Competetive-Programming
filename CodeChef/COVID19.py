# cook your dish here
t = int(input())
while t > 0:
    t-=1 
    n = int(input())
    x = list(map(int,input().split()))
    max = -1
    min = 11
    z = 0
    for i in range(1,n):
        k = x[i] - x[i-1]
        if k <= 2 :
            z += 1
        else:
            if z <= min :
                min = z 
            if z >= max :
                max = z  
            z = 0
    if z <= min :
        min = z 
    if z >= max :
        max = z 
    print(min+1,max+1)