'''
filename = dict.py
딕셔너리(=객체)사용법
'''

info = {}

#이름입력받고
info["name"] = input("이름입력:")
#나이입력받고 
info["age"] = input("나이입력:")
#주소입력받아서 info에 저장할 거
info["addr"] = input("주소입력:")

for key in info :
    print(f"\n{key}\t{info[key]}")



#주소삭제
# del info["addr"]

# print(info)


