t = int(input())
for i in range(t):
    n = int(input())
    ans = dict()
    for i in range(n):
        ans[i+1] = ans.get(i+1,0)
    
    x = list(map(int,input().split()))
    answer = list()
    for i in x:
        if ans[i] == 0:
            answer.append(i)
            ans[i] += 1
        elif ans[i] == 1 : 
            continue
    for i in answer:
        print(i,end = " ")
    print()