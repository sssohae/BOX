'''
반복문
'''

names =['김','이','박']

print("list=====")
for obj in names :
    print(obj)

print("list range=====")
for idx in range(len(names)) :
    print(names[idx])


dict = {'no':100, 'username':'user1', 'salary':2000}


print("dict =====")
for key in dict : 
    print(key,dict[key])

print("dict items=====")
for key,value in dict.items():
    print(key,value)


users = [{'no':100, 'username':'user1', 'salary':2000},
         {'no':101, 'username':'user2', 'salary':1000},
         {'no':102, 'username':'user3', 'salary':1500}]
print("list dict=====")
for obj in users:
    print(obj["username"])

print("list dict range====")
for idx in range(len(users)) :
    print(users[idx]["username"]) #list(배열)는 인덱스로 접근 dictionary(객체)는 키로 접근 

    #급여 합계 출력 

print("salary total======")
total = 0
# for i in users :
#     total += i["salary"]
# print(total)

for i in range(len(users)) :
    total += users[i]["salary"]
print(total)


#최대, 최소 급여 찾기
print("salary max min======")
maxSal = users[0]["salary"]
minSal = users[0]["salary"]

for i in users:
    if i["salary"] > maxSal :
        maxSal = i["salary"]
    if i["salary"] < minSal :
        minSal = i["salary"]
print('최대',maxSal)
print('최소',minSal)
for i in range(len(users)) :
    if users[i]["salary"] > maxSal :
        maxSal = users[i]["salary"]
    if users[i]["salary"] < minSal :
        minSal = users[i]["salary"]
print('최대',maxSal)
print('최소',minSal)



