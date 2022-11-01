'''
filename : b4101.py
'''

'''
매개변수: 숫자 2개
리턴값: Yes, No, 0 중에서 하나 리턴
'''

#반복문
# 내가 만든 고장난 코드 
# def big(a,b) :
#     if a > b :
#         print("Yes")
#     elif a == b :
#         print("No")
#     elif a < b :
#         print("No")
#         return (result)

# a = int(input())
# b = int(input())
# while a!=0 and b!=0 :
#     #  a,b= int(input()split(" "))
#     #  result = big(a,b)
#      result = big(a,b)
#      print(result)


def test(x,y):
    result = 0
    if x==0 and y ==0 :
        result = 0 
    elif x > y :
        result = "Yes"
    else :
        result = "No"
    return result 
while True:
    x,y=input().split(" ")
    x = int(X)
    y = int(y)
    result = test(x,y) 
    if result ==0 :
        break
    else  :
        print(result)


