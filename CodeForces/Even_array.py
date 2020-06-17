t = int(input())
while t > 0 :
    t -= 1
    terms = int(input())
    lst = list(map(int,input().split()))
    lst1 = list()
    answer1 = 0
    answer2 = 0
    for i,j in enumerate(lst):
        lst1.append(i % 2)
        lst[i] = lst[i] % 2
        if (lst1[i]==1 and lst[i]==0) :
            answer1 += 1  
        elif (lst1[i]==0 and lst[i]==1):
            answer2 += 1
    if answer1 == answer2:
        print(answer1)
    else:
        print(-1)
