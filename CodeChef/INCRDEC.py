t = int(input())
for i in range(t):
    n = int(input())
    lst = list(map(int,input().split()))
    sw = dict()
    flag = True
    for j in lst:
        sw[j] = sw.get(j,0) + 1
        if sw[j] > 2:
            #print("NO")
            flag = False
            break
    if (sw[max(sw.keys())]) > 1:
        print("NO")
        continue
    if flag == False:
        print("NO")
        continue
    sw_ = dict()
    for d,j in sw.items():
        if j == 2:
            sw_[d] = sw_.get(d,0) + 1
    print("YES")
    for j in sorted(sw.keys()):
        print(j,end = " ")
    for j in sorted(sw_.keys(),reverse = True):
        print(j,end = " ")
    print()
