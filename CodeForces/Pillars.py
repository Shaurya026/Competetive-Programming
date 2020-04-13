# 1197B
n = int(input())
x = list(map(int,input().split()))
flag = True
max_val = max(x)
max_pos = x.index(max_val)
for i in range(max_pos + 1):
    if i<max_pos-1 and x[i+1] < x[i]:
        #print("NO")
        flag = False
for i in range(max_pos,n+1):
    if i<n-1 and x[i+1] > x[i]:
        #print("NO")
        flag = False
if flag :
    print("YES")        
else :
    print("NO")