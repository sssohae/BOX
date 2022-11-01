'''
제일 큰 수 찾는 함수
매개변수 : 정수형값들
리턴값 : 정수형
'''

def mymax(*nums) :
    max = nums[0]
    for num in nums : 
        if max < num : 
        # if nums[0] < num :  #max자리에 nums[0]을 넣으면 11이 나옴. 왜??
            max = num
    return max
#결과(제일 큰 수)를 저장할 변수에 첫번째 요소로 초기화
#리스트 수만큼 반복하면서 큰 수인지 검사
#리스트 요소의 값이 크다면 변수에 저장
#결과를 리턴 
result = mymax(3,5,10,2,100,0,11)
print(result) 

result = mymax(3,5,10,2)
print(result) 