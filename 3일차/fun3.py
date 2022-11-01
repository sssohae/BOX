'''
filename : func3.py
전역변수
'''

total = 0

def mysum():
    global total 
    for i in range(11) : 
        total += i   #지역변수 없으면 전역변수 가져옴 

mysum()
print(total)