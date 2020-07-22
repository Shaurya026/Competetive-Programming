t = int(input())
for i in range(t):
    n = int(input())
    vec = [j for j in range(1,(n**2) + 1)]
    flag = True
    rnge = 0
    matrix = [[] for j in range(n)]
    for e,d in enumerate(matrix):
        if flag:
            for k in range(rnge+1,rnge+n+1):
                matrix[e].append(vec[k-1])
                rnge = k
            flag = False

        else:
            flag = True
            if n % 2 == 1 :
                for k in range(rnge+1,rnge+n+1):
                    matrix[e].append(vec[k-1])
                    rnge = k
            else :
                for k in range(rnge+n,rnge,-1):
                    matrix[e].append(vec[k-1])
                rnge = rnge + n 
    for b in matrix:
        for a in b:
            print(a,end = ' ')
        print()
