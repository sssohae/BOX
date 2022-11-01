'''
filename : filewrite.py
'''
users = [{'userno':100, 'username':'user1', 'salary':2000},
         {'userno':101, 'username':'user2', 'salary':1000},
         {'userno':102, 'username':'user3', 'salary':1500}]

#파일 오픈
file = open('basic.txt', 'w')
#쓰기
for el in users :
    file.write(f'{el["userno"]},{el["username"]},{el["salary"]}\n')
    # file.write(f'{users[el]["userno"]}{users[el]["username"]}{users[el]["salary"]}')
#닫기
file.close()