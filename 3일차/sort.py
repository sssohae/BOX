'''
filename : sort.py
'''

arr = [1,4,3,10,7]
arr.sort(reverse=True)
print(arr)

users = [{'userno':100, 'username':'user1', 'salary':2000},
         {'userno':101, 'username':'user2', 'salary':1000},
         {'userno':102, 'username':'user3', 'salary':1500}]


users.sort(key=lambda item : item['salary'], reverse=True)
print(users)