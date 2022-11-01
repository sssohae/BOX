'''
filename : baseball.py
숫자야구게임
'''
#컴퓨터가 난수 3개 

from random import randint
import sys
def cnt_strike(c1,c2,c3,n1,n2,n3):
    s = 0
    if c1 == n1:
        s += 1
    if c2 == n2:
        s += 1
    if c3 == n3:
        s += 1
    return s

def cnt_ball(c1,c2,c3,n1,n2,n3):
    b=0
    if c1 == n2 or c1 == n3 :
        b += 1
    if c2 == n1 or c2 == n3 :
        b += 1
    if c3 == n1 or c3 == n2 :
        b += 1
    return b

def user_input( ):
    n1,n2,n3 = input().split(' ')
    n1 = int(n1)
    n2 = int(n2)
    n3 = int(n3)
    return n1,n2,n3


while True : 
    c1 = randint(1,9)
    while True : 
        c2 = randint(1,9)
        if c1 != c2:
            break
    while True : 
        c3 = randint(1,9)
        if c3 != c1 and c3 != c2 : 
            break
    print(c1,c2,c3)

    #게이머가 입력

    cnt = 0
    s = 0
    # 맞췄거나 시도횟수가 다 되면 빠져 나갈거임 
    while s < 3 and cnt < 5:  #스트라익 3회보다 작고 시도횟수 5회보다 작으면 
        cnt += 1
        n1,n2,n3 = user_input()
        #첫번째 자리 비교
        s = cnt_strike(c1,c2,c3,n1,n2,n3)

        #스트라익이 3면 "축하" 출력 
        #볼 수 계산
        b = cnt_ball(c1,c2,c3,n1,n2,n3)

        print("볼 수는",b)
        print("스트라이크 수는",s)
        

    #스트라익 3이면 "축하"
    #시도횟수 3번 이하면 "천재"
    #시도횟수 4번만에 "우수"
    #아니면 "보통"
    #스트라익이 3이 아니면 "게임 오버"
    if s == 3 :
        print("축하")
        if cnt <=3  :
            print("천재")
        elif cnt == 4 :
            print("우수")
        elif cnt == 5 :
            print("보통")
    
        # sys.exit() # quit() 
        
    print("게임 오버")
    exitYn = input("게임을 계속할까요? Y, N")
    if exitYn in['n','N'] :
        quit()