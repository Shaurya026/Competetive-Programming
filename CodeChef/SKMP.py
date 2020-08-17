t = int(input())
for tt in range(t):
    S = input()
    P = input()
    dc = dict()
    for i in S:
        dc[ord(i)] = dc.get(ord(i),0) + 1
    for i in P:
        dc[ord(i)] -= 1
    ans = ""
    ind = 0
    j = 0
    for i in sorted(dc):
        ans += (dc[i] * chr(i))
        j += dc[i]
        if ord(P[0]) >= i:
            ind = j
    flag = True 
    indi = 1
    while P[indi] == P[indi-1]:
        indi += 1
    if P[indi] < P[0]:
        flag = False
    if flag:
        ans = ans[0:ind] + P + ans[ind::]
    else:
        ans = ans[0:ind - dc[ord(P[0])]] + P + dc[ord(P[0])]*P[0] + ans[ind::]
    print(ans)