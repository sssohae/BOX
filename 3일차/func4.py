'''
filename = func4.py
가변매개변수(*)
tuple: () list와 동일하고 요소 변경 불가
list : []
'''

'''
설명 : 합계계산 
매개변수 : 정수형 여러개 
리턴값 : 정수형 합계
작성자:
작성일자:
수정내용:
'''
def mysum(*nums):
    total = 0
    for num in nums :
        total += num
    return total
    # print(type(nums))
 
t = mysum(10,20)
print(t)
print(mysum(10,20,30))
print(mysum(10,20,3,5,46,7,8,9,7,8))

