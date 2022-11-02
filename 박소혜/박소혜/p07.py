


std_info = ["홍길동", "이순신", "김유신"]
# print(get_name(std_info, "홍길동"))
# print(get_name(std_info, "유관순"))



def std(std_info,stdnm) :
    stdnm = input()
    for i in std_info :
        if stdnm == std_info[i]:
            return stdnm
        else :
            return "?"

print(std)