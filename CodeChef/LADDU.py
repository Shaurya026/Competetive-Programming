# cook your dish here
t = int(input())
while t > 0 :
    t -= 1 
    x = list(map(str,input().split()))
    z = int(x[0])
    k = 0
    if x[1] == "INDIAN":
        k = 200
    else:
        k = 400
    ans = 0
    while z > 0 :
        z -= 1
        a = list(map(str,input().split()))
        if  a[0] == "CONTEST_WON":
            if 20 - int(a[1]) > 0:
                ans += (300 + 20 - int(a[1]))
            else :
                ans += 300
        elif a[0] == "TOP_CONTRIBUTOR":
            ans += 300
        elif a[0] == "BUG_FOUND":
            ans += int(a[1])
        elif a[0] == "CONTEST_HOSTED":
            ans += 50
    print(ans//k)
# Input:
# 2
# 4 INDIAN
# CONTEST_WON 1
# TOP_CONTRIBUTOR
# BUG_FOUND 100
# CONTEST_HOSTED
# 4 NON_INDIAN
# CONTEST_WON 1
# TOP_CONTRIBUTOR
# BUG_FOUND 100
# CONTEST_HOSTED

# Output:
# 3
# 1
# Explanation
# In the first example,

# For winning contest with rank 1, user gets 300 + 20 - 1 = 319 laddus.
# For top contributor, user gets 300 laddus.
# For finding a bug with severity of 100, user gets 100 laddus.
# For hosting a contest, user gets 50 laddus.
# So, overall user gets 319 + 300 + 100 + 50 = 769 laddus. 
# Now, the user is an Indian user, he can redeem only 200 laddus per month. 
# So, for first three months, he will redeem 200 * 3 = 600 laddus. 
# The remaining 169 laddus, he can not redeem as he requires at least 200 
# laddues in a month to redeem. So, answer is 3.

# In the second example, user is a non-Indian user, he can redeem 400 laddues per month. 
# So, in the first month, he will redeem 400 laddus. The remaining 369 laddus, 
# he can not redeem as he requires at least 400 laddues in a month to redeem. 
# So, answer is 1.
