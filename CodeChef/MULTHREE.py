# t = int(input())
# while t > 0 :
#     t-= 1 
#     x = list(map(int,input().split()))
#     sum = x[1] + x[2];
#     l = x[0] - 2 
#     temp = sum 
#     while l > 0 :
#         l -= 1 
#         d = sum % 10
#         if d == 0 :
#             break
#         temp = sum
#         sum += d 
#     if sum % 3 == 0:
#         print("YES")
#     else:
#         print("NO")


for t in range(int(input())):
    K,d0,d1=map(int,input().split())
    s,x=d0+d1,0
    for i in range(K-2):
        x=s%10
        if(x%2==0):
            break
        s+=x
    if(x in [2,4,6,8]):
        s+=(20*((K-2-i)//4))
        for j in range((K-2-i)%4):
            s+=x
            if x>=8:
                x=6
            elif x==6:
                x=2
            elif x==4:
                x=8
            elif x==2:
                x=4
    print("YES" if s%3==0 else "NO")



# Input:
# 3
# 5 3 4
# 13 8 1
# 760399384224 5 1

# Output:
# NO
# YES
# YES

# Explanation
# Example case 1: The whole number N is 34748, which is not divisible by 3,
# so the answer is NO.

# Example case 2: The whole number N is 8198624862486, which is divisible by 3,
# so the answer is YES.
