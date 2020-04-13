#All consecutive numbers have GCD 1 -_- 
# 1051B
x = list(map(int,input().split()))
r = x[0]
l = x[1]
pairs = r - l + 1 
pairs = pairs//2
print("YES")
i = r
while i <= l: 
    print(i,i+1)
    i += 2