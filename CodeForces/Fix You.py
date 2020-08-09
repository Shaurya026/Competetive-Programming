t = int(input())
for tt in range(t):
    dim = list(map(int,input().split()))
    m = dim[0]
    n = dim[1]
    chnges = 0
    for j in range(m-1):
        strange = input()
        if strange[-1] == 'R':
            chnges += 1
    strange = input()
    for i,j in enumerate(strange):
        if i == len(strange)-1:
            break
        if j == 'D':
            chnges += 1
    print(chnges)    