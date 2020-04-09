# cook your dish here
x = int(input())
while x > 0:
    x-= 1 
    st = input()
    l = len(st)//2
    #print(l)
    h1 = st[:l]
    if len(st)%2 == 0: 
        h2 = st[l:]
    else:
        h2 = st[l+1:]
    h_1 = dict()
    for i in h1 :
        h_1[i] = h_1.get(i,0) + 1 
    h_2 = dict()
    for j in h2 :
        h_2[j] = h_2.get(j,0) + 1
    h_1_k = sorted(h_1.keys())
    #h_1_v = sorted(h_1.values())
    h_2_k = sorted(h_2.keys())
    #h_2_v = sorted(h_2.values())
    #print(h_1_k,h_1_v)
    #print(h_2_k,h_2_v)
    if h_1_k == h_2_k:
        flag = True
        for i in h_1:
            if h_1[i] == h_2[i]:
                continue
            else:
                print("NO")
                flag = False
                break
        if flag :
            print("YES")
    else:
        print("NO")
