x = int(input())
y = range(x)
ans = 1

def prime_check(x):
    if x == 2:
        return True
    for i in range( 2,int(x/2) + 1):
        if x % i == 0:
            return False
    return True

def total_prime(x):
    a = 0
    for i in range(2,x+1):
        if prime_check(i):
            #print("This number is",i)
            a += 1
    return a

def fact(x):
    a = 1
    for i in range(1,x+1):
        a *= i
    return a

com = x - total_prime(x)
ans = (fact(total_prime(x)) * fact(com)) %(10**9 + 7)
print(ans)