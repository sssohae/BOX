'''
filename : finc2.py
지역변수
'''

#1~10까지 합계구하는 for문
def mysum(n): 
    total=0
    for i in range(n+1) : ##range 11이면 0~10까지 돌림 반복변수 ijk
        total += i
    return total

# 함수실행(=호출)
num = int(input("입력"))
t1 = mysum(num)
print('합계는', t1)

num = int(input("입력"))
t2 = mysum(num)
print('합계는', t2, '입니다')
