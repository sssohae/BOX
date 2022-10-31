'''
filename : list2.py
리스트 삭제, 조회
'''

members = [
    {"name":"김이","age":10, "addr":"서울"},
    {"name":"이이","age":20, "addr":"대전"},
    {"name":"박삼","age":30, "addr":"대구"},
]

nm = input("검색할 이름 입력:")
for i in members :
    # print(i["name"] ,'\t',i["addr"]) \t넣고 싶으면 중간에 콤마해서 넣으면 됨 
    # if i["age"] >= 30 :
    # if nm in i ["name"]: 
    # if i["name"].find(nm) >=0 :
        # print(f'{i["name"]}\t{i["addr"]}')
    # ag = int(input("검색할 나이 입력"))
    # if i["age"] == age : 
    #     print()
        #삭제
    if nm in i ["name"]:
        print(f'{i["name"]}\t{i["addr"]}')
        del i
    print(members) 

