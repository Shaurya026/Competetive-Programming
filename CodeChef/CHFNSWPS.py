t = int(input())
for k in range(t):
    n = int(input())
    flag = True
    A = list(map(int,input().split()))
    B = list(map(int,input().split()))
    A_d = {}
    B_d = {}
    for i in range(len(A)):
        A_d[A[i]] = A_d.get(A[i],0) + 1
        B_d[B[i]] = B_d.get(B[i],0) + 1

    for i,j in B_d.items():
        A_d[i] = A_d.get(i,0) - j
        if A_d[i] % 2 == 1:
            print(-1)
            flag = False
            break
    if flag == False:
        continue
    
    vec1 = list()
    vec2 = list()

    min_val = 1e5
    swaps = {}
    for i,j in A_d.items():
        swaps[i] = swaps.get(i,0) + j
        swaps[i] = swaps[i]//2
        if swaps[i] == 0:
            if swaps[i]<min_val:
                min_val = i
    
    for i,j in swaps.items():
        if j > 0:
            for ctr in range(j):
                vec1.append(i)
        else:
            for ctr in range(abs(j)):
                vec2.append(i)
    
    if len(vec1) != len(vec2):
        print(-1)
        continue
    
    sorted(vec1)
    sorted(vec2)
    cost = 0
    #print(vec1,vec2,min_val)
    for ctr in range(len(vec1)):
        cost += min(2*min_val,min(vec1[0],vec2[-1]))
        if vec1[0] < min_val:
            min_val = vec1[0]
        elif vec2[-1] < min_val:
            min_val = vec2[0]
        vec1.remove(vec1[0])
        vec2.remove(vec2[-1])
    
    print(cost)
    #print(vec1,vec2)
    #print(swaps)