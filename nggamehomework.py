'''
1.1-100 무작위번호 1개 설정
2.input 받기
3. 1 ==2 대조
3-1) 대소 알려주기 
4. 맞으면 축하 멈추고 (다시 할 지 물어보기)
5. 틀리면 10번까지 시도. 
6. 다 틀리면 게임 끝내고 (다시 할 지 물어보기 -> while 두번써야함).
7. 게이머가 입력한 input들 밑에 print
8.턴 기록 

1.1-100 무작위 번호 1개 설정
2. input받기
카운트 +=1

    3.1==2 대조 and 10턴 안에 맞출때까지 턴기록
    3-1)맞추면 축하하고 
     끝내고
     다시 할지 물어보기  
    3-2)틀리면 틀림.
      대소 알려주기 반복
    3-3)input들 보여주기
4. 끝나면 다시 할 지 물어보기  -->이것만 하면 끝~~~~~~~~~~~

한번 끝내면 cnt 1되고 1 이상 and input yes 일때까지 돌린다.



'''

from random import randint

ran = randint(1,100)

cnt = 0
arr = []

print("Enter a guess")
while cnt < 10 : 
    cnt += 1

    n = input()
    n = int(n)

    arr.append(n)
    print(arr)
    
    if ran == n :
        print("Congratulations! You got it right\n")
        quit() 
    
    elif n < ran :
        print("Wrong! Last guess was too low!\n")

    elif n > ran :
        print("Wrong! Last guess was too high!\n")

print("!!!GAME OVER!!!")
quit()

# Q1. while cnt <=10 이나 cnt <11로 하면 11번까지 시행됨. 10번까지만 돼야하는게 아닌가?? -> A1. while을 넘어가서 cont돼서 그럼 
# Q2. 사용자input n도 int 꼭 해줘야 하는가? A2. 해줘야함. 교수님도 해줬음 