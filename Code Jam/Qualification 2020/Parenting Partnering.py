for T in range(int(input())):
    n=int(input())
    pair=[]
    for i in range(n):
        pair.append(list(map(int,input().split())))
    pairs=pair.copy()
    pairs.sort()
    r=[None]*n
    r[0]=0
    r[1]=1
    xx=1
    for i in range(2,n):
        J=0
        C=0
        for j in range(0,i):
            if((pairs[i][0] not in range(pairs[j][0],pairs[j][1])) and r[j]==0):
                J=J+1
            if((pairs[i][0] not in range(pairs[j][0],pairs[j][1])) and r[j]==1):
                C=C+1
        if(J==(r.count(0))):
            r[i]=0
        elif(C==(r.count(1))):
            r[i]=1
        else:
            xx=1
            break
    if(None in r):
        print("Case #"+str(T+1)+': '+'IMPOSSIBLE')
    else:
        outarr=[0]*n
        for i in range(n):
            pp=pair.index((pairs[i]))
            outarr[pp]=r[i]
        string=""
        for i in range(len(outarr)):
            if(outarr[i]==0):
                string=string+'J'
            elif(outarr[i]==1):
                string=string+'C'
        print("Case #{}: {}".format(T+1,string))
