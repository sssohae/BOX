user = [
    {"code":"A01", "user":"인사" },
    {"code":"B02", "user":"개발" },
    {"code":"A03", "user":"총무" },
]

s = input("사원번호입력: ")
for el in user:
    if el['code'] == s[2:5]:
        print(f'부서 : {el["user"]}')