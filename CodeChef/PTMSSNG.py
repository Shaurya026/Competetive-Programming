# approach : odd number of elements of a corrdinate number gives the answer
t = int(input())
while t > 0 :
    t -= 1
    num_rec = int(input())
    num_points_x = {}
    num_points_y = {}
    for i in range(4*num_rec - 1) :
        temp = list(map(int,input().split()))
        num_points_x[temp[0]] = num_points_x.get(temp[0],0) + 1
        num_points_y[temp[1]] = num_points_y.get(temp[1],0) + 1
    x = 0
    y = 0
    #print(num_points_x)
    #print(num_points_y)
    for i,j in num_points_x.items():
        if j % 2 == 1:
            x = i
            break
    for i,j in num_points_y.items():
        if j % 2 == 1:
            y = i
            break
    print(x,y)