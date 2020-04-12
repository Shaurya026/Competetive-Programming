#Problem 987A
gem = {"purple" : "Power" , "green" : "Time" , "blue" : "Space" , "orange" : "Soul" , "red" : "Reality" , "yellow" : "Mind"}
t = int(input())
while t > 0 :
    t-= 1
    x = input()
    if x in gem.keys() :
        del gem[x]
print(len(gem.keys()))
for k,v in gem.items() :
    print(v)
