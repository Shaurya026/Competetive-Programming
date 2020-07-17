t = int(input())
for temp in range(t):
    n = int(input())
    arr = list(map(int,input().split()))
    i = 0
    j = n-1
    var = 0
    ans = 0
    while j>0 and arr[j] <= arr[j-1]:
        j -= 1
    while j>0 and arr[j] >= arr[j-1]:
        j -= 1
    print(j) 


# TLE : 
# t = int(input())
# for temp in range(t):
#     n = int(input())
#     arr = list(map(int,input().split()))
#     i = 0
#     j = n-1
#     var = -1
#     ans = 0
#     while i <= j:
#         if arr[i] >= var and arr[j] >= var:
#             if arr[i] <= arr[j]:
#                 var = arr[i]
#                 i += 1
#             elif arr[i] >= arr[j]:
#                 var = arr[j]
#                 j -= 1
#         elif arr[i] < var or arr[j] < var:
#             ans += 1
#             i = ans
#             #j = n-1
#             var = -1
#     print(ans)