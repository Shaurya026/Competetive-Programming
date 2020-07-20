t = int(input())
for i in range(t):
    lst = list(map(int,input().split()))
    
    str1_ = input()
    str1 = []
    for l in str1_:
        str1.append(l)
    
    cost_val_ = input()
    cost_val = []
    for l in cost_val_:
        cost_val.append(int(l))

    str2_ = input()
    str2 = []
    for l in str2_:
        str2.append(l)
    
    cost_dict = dict()
    for j,k in zip(str1,cost_val):
        cost_dict[j] = cost_dict.get(j,100)
        if k < cost_dict[j] :
            cost_dict[j] = k
    
    flag = True
    cost = 0
    for d in str2:
        if not(d in cost_dict.keys()):
            print(-1)
            flag = False
            break
        cost += cost_dict[d]
    
    if flag == True:
        print(cost)
            