# clacclass.py
# 클래스 = 데이터 + 함수 다 가지고 있음. 클래스는 변수, 함수를 멤버라 부름
class CalcClass:
    # 멤버변수
    # a=0
    # b=0

    # 생성자함수 : 객체 생성시에 변수 초기화. 초기화함수. 특수기능함수 
    def __init__(self,a,b) :
        self.a = a
        self.b = b

    # 멤버함수 = 메소드
    def add(self):
        print(self.a+self.b)

    def miu():
        print(self.a-self.b)

    def mul():
        print(self.a*self.b)

    def div():
        print(self.a/self.b)