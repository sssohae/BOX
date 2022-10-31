'''
리스트 다루기
'''

list = []

for i in range(3):
    info = {}

    #이름입력받고
    info["name"] = input("이름입력:")
    #나이입력받고 
    info["age"] = input("나이입력:")
    #주소입력받아서 info에 저장할 거
    info["addr"] = input("주소입력:")
    #list에 추가
    list.append(info)

print(list)

#이름만 전체 출력 
for mem in list :
    print(f'{mem["name"]}\t{mem["age"]}')