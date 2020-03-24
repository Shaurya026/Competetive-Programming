''' Given a string consisting of lower case characters and hashes(#) where each hash represents a back space .
Find the resultant string after removing the backspaces from the given input string.
(Note : there will be no condition where we use backspace on empty string )

Example :

 Input: xy#z
 Output: xz '''

x = input()
i = 0

def valve(x) :
    for m,n in enumerate(x):
        print(m,n)
    
while '#' in x :
    if x[i] == '#':
        #valve(x)
        #print(x[:i-1],x[i+1:])
        x = x[:i-1] + x[i+1:]
        i -= 2
        #print(x)
    i +=1

print(x)