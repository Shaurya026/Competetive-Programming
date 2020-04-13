n = int(input())
steps = 0
tmp = int(input())
steps += tmp + 1
for i in range(n-1):
    x = int(input())
    if tmp > x :
        steps += (tmp - x + 2)
        tmp = x
    elif tmp <= x :
        steps += (x-tmp + 2)
        tmp = x 
print(steps)