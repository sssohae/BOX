def get_name(info, name) :
    for i in info :
        if i == name :
            return name
    return "?"

std_info=["홍길동","이순신","김유신"]
print(get_name(std_info, "홍길동"))
print(get_name(std_info, "유관순"))

