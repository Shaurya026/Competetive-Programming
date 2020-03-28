# cook your dish here
t = int(input())

def answer(sum):
    # values go upto 2048 i.e. 2^10
    lst = []
    while sum != 0: 
        for i in range(11,-1,-1):
            if sum < 2**i : continue
            elif sum >= 2**i :
                sum -= 2**i
                break
        lst.append(2**i)
    #print(lst)
    return len(lst)

while t > 0 :
    t -= 1 
    x = int(input())
    print(answer(x))