'''
filename : listadd.py
리스트에 요소 추가 : insert, append 함수
'''

#키보드로부터 숫자 5개를 입력받아서 리스트에 저장

arr=[]

#반복 5번 for문
for i in range(5):
    #키보드입력 input
    a = input()
    #리스트에 추가
    arr.append(a)
print(arr)