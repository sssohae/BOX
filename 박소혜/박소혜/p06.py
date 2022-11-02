code=[
    {"boo":"A01","seo":"인사"},
    {"boo":"B02","seo":"개발"},
    {"boo":"A02","seo":"총무"}
]

num = input("사원번호입력:")
anw = ""
for i in code :
    if num[2:5] == i["boo"] :
        anw = i["seo"]    
print("부서:",anw)

