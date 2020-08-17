# recursive slow solution !!
def CWA(n,k,members,dc = dict()):
    if n <= 0:
        return 0
    index = -1
    for j,i in enumerate(members):
        dc[i] = dc.get(i,0) + 1
        if dc[i] > 1:
            index = j
            break
    if index == -1:
        return k
    op1 = k + CWA(n-j,k,members[j::],dict())
    if dc[members[j]] > 2:
        tp = 1
    else:
        tp = 2
    op2 = CWA(n-j,k,members[j+1::],dc) + tp
    return min(op1,op2)
    
t = int(input())
for tt in range(t):
    l1 = list(map(int,input().split()))
    n = l1[0]
    k = l1[1]
    members = list(map(int,input().split()))
    print(CWA(n,k,members,dict()))

    # different approach:
    dc = dict()
    extra = 0
    answer = 0
    j = 0
    while j < len(members):
        dc[members[j]] = dc.get(members[j],0) + 1
        if dc[members[j]] > 1:
            if dc[members[j]] == 2:
                extra += 2
            else:
                extra += 1
        if extra > k or j == len(members) - 1:
            #extra += len(dc2.keys())
            answer += (k + extra - 1)
            extra = 0
            dc2 = dict()
            dc = dict()
        j += 1
    print(answer+1)