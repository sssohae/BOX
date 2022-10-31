'''
filename : break.py
'''
users = [{'userno':100, 'username':'user1', 'salary':2000},
         {'userno':101, 'username':'user2', 'salary':1000},
         {'userno':102, 'username':'user3', 'salary':1500}]

while True:
    print("1.추가 2.삭제 3.조회 4.전체조회 5.종료")
    no = int(input("메뉴선택:"))
    
    if no == 1 :
        print("추가")
        info={}

        info['userno']= int(input("userno"))
        info['username']= input("username")
        info['salary']= int(input("salary"))


        # info['userno'],info['usename'],info['salary'] = input().split(" ")
        users.append(info)
        print(users)

    elif no == 2 :
        print("삭제")
        userno = int(input("삭제할 번호 입력:"))
        idx = 0 
        for obj in users :
            if userno == obj["userno"] :
                del users[idx]
                break
            idx += 1 
        print(users)

    elif no == 3 :
        print("조회")
        userno = int(input("조회할 번호 입력:"))
        for i in users :
            if userno == i["userno"] :
                print(f'{i["username"]}\t{i["salary"]}')
        #번호를 입력받고
        #해당 번호의 이름과 급여 출력
    elif no == 4 :
        print("전체조회")
        for i in users :
            print(f'{i["username"]}\t{i["salary"]}')
            #유저네임, 급여 
    elif no == 5 :
        print("종료")
        break

print("the end")