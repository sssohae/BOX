'''
filename : list2.py
리스트 삭제
'''

members = [
    {"name":"김이","age":10, "addr":"서울"},
    {"name":"이이","age":20, "addr":"대전"},
    {"name":"박삼","age":30, "addr":"대구"}
]

name = input("검색할 이름 입력:")
for i in range(len(members)) :
    if name in members[i]["name"]:
        print(f'{members[i]["name"]}\t{members[i]["addr"]}')
        del members[i]
        # i=i-i
        break

print(members) 

