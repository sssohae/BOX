'''
filename :func1.py
매개변수와 리턴이 없는 함수
'''
#함수선언
def print_3_hello(greeting, n=2):
    for i in range(n) :
        print(greeting, end =" ")


#함수호출
g = "안녕하세요"
n = 5
print_3_hello(g,n)
print()
print_3_hello(n=3, greeting = "Hi")

print('a','b','c', sep= '-')
# input()

