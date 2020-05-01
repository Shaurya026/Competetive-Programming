# cook your dish here
def split(word): 
    return [char for char in word]  
    
t = int(input())
while t > 0:
    t -= 1 
    lt = list(map(int,input().split()))
    slen = lt[0]
    cq = lt[1]
    x =  split(input())
    ans = dict()
    for i in x :
        ans[i] = ans.get(i,0) + 1
    answer = 0
    while cq > 0 :
        cq -= 1 
        c = int(input())
        for k,v in ans.items() :
            if c-v < 0 :
                answer += (v-c) 
                #print(k)
        print(answer)
        answer = 0
        