# cook your dish here
t = int(input())
while t > 0 :
    t -= 1 
    x = input()
    print("".join(reversed(x)).lstrip('0'))
