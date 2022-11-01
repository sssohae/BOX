'''
filename : return_test.py
'''

def return_test():
    num = int(input())
    print("A 위치입니다.")
    if(num<10):
        return #if 없이 잘 안 함. 조건있어야O
    print("B 위치입니다.")
    # return    함수 마지막 return은 생략가능

return_test()