t = int(input())
min_val = 6 + 10 + 14
for i in range(t):
    x = int(input())
    if x <= min_val:
        print("NO")
        continue
    print("YES")
    val = x - min_val
    if val == 6:
        print('5 6 10 15')
        continue
    if val == 10:
        print('14 10 15 1')
        continue
    if val == 14:
        print('6 7 10 21')
        continue
    else:
        print('6 10 14',val)