'''
1. 1-6까지의 눈을 가진 3개의 주사위 던짐
2. 같은 눈 3개 10000+(같은눈)x1000
3. 같은 눈 2개 
'''

from random import randint

a = randint(1,6)
b = randint(1,6)
c = randint(1,6)

arr = [a,b,c]
print(a,b,c)
max = arr[0]  

x = []
newArr = []
if a==b==c :
    print(10000+a*1000)
elif a!=b and a!=c and b!=c : #Q1. a!=b!=c 로는 왜 안 되는지??
    for i in arr :
        if max < i :
            max = i 
    print(max*100)         
else :
    for i in arr :
        if i not in x :
            x.append(i)
        else :
            if i not in newArr :
                newArr.append(i)
            print(1000+newArr[0]*100) #Q2. 다른 방식.. 모르겠음 
