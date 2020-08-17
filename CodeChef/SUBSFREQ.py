def substr(s):
    if len(s) == 0:
        ans = []
        ans.append("")
        return ans
    j = 0
    p = ""
    for i in s:
        if i == " ":
            break
        j += 1
        p += i
    pew = substr(s[j+1:])
    #print(s[0] + ans[0])
    t = range(len(pew))
    for i in t:
        k = p +" "+ pew[i]
        pew.append(k)
    return pew

t = int(input())
for tt in range(t):
    zzz = int(input())
    arr = input()
    dc = dict()
    for i in range(zzz):
        dc[(i+1) % 1000000007] = dc.get((i+1) % 1000000007,0)
    answer = substr(arr)
    for i in answer[1:]:
        i = list(map(int,i.split()))
        max = -1
        ind = 0
        dct = dict()
        for j in i:
            j = j  % (1000000007)
            dct[j] = dct.get(j,0) + 1
            if dct[j] > max:
                max = dct[j]
                ind = j
        dc[ind % (1000000007)] += 1
        dc[ind % (1000000007)] = (dc[ind % (1000000007)]) % (1000000007)
    for i,j in dc.items():
        print(j,end =" ")
    print()