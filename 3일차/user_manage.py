'''
filename : 3일차/user_manage.py
'''
'''=======================
users없는 상태에서 시작. []
회원등록
매개변수: 회원정보 딕셔너리{userno:100, username:, salary..}
리터값 : 없음 
======================='''
'''=======================
메뉴선택
리턴값 : 입력된 메뉴번호
======================='''

from re import A


def menu_select():
    print("1.추가 2.삭제 3.조회 4.전체조회 5.전체삭제 6.종료 7.파일읽기 8.파일저장")
    no = int(input("메뉴선택:"))
    return no

def user_insert():
        print("추가")
        info={}
        info['userno']= int(input("userno"))
        info['username']= input("username")
        info['salary']= int(input("salary"))
        return info

def user_del(userno):
    print("삭제")
    idx = 0 
    for obj in users :
        if userno == obj["userno"] :
            del users[idx]
            break
        idx += 1 

def user_select(userno):
    print("조회")
    for i in users :
        if userno == i["userno"] :
            print(f'{i["username"]}\t{i["salary"]}')

def user_selectA():
    print("전체조회")
    for i in users :
        print(f'{i["username"]}\t{i["salary"]}')

def user_delA() :
    users.clear()

users = [{'userno':100, 'username':'user1', 'salary':2000},
         {'userno':101, 'username':'user2', 'salary':1000},
         {'userno':102, 'username':'user3', 'salary':1500}]

while True:

    #메뉴선택
    no = menu_select()

    if no == 1 :
        info = user_insert()  # info['userno'],info['usename'],info['salary'] = input().split(" ")
        users.append(info)
        print(users)

    elif no == 2 :
        userno = int(input("삭제할 번호 입력:"))
        user_del(userno)
        print(users)

    elif no == 3 :
        userno = int(input("조회할 번호 입력:"))
        user_select(userno)
        #번호를 입력받고
        #해당 번호의 이름과 급여 출력
    elif no == 4 :  #유저네임, 급여 
        user_selectA()

    elif no ==5 :
        user_delA()

    elif no == 6 :
        print("종료")
        break

print("the end")