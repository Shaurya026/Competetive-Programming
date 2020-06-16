t = int(input())
while t > 0 :
    t -= 1
    terms = int(input())
    lst = list(map(int,input().split()))
    lst1 = list()
    answer = 0
    for i,j in enumerate(lst):
        lst1.append(i % 2)
        lst[i] = lst[i] % 2
        if (lst1[i]==1 and lst[i]==0) or (lst1[i]==0 and lst[i]==1):
            answer += 1  
    if answer % 2 == 0:
        print(answer//2)
    else:
        print(-1)
