'''
clactest.py
'''

import calc
from calcclass import CalcClass
'''a=5
b=3

calc.add(a,b)
calc.miu(a,b)
calc.mul(a,b)
calc.div(a,b)'''

#클래스 사용 
cc = CalcClass(10,20) #객체생성. 여러개 생성가능
cc.add()
cc.miu()
cc2 = CalcClass(100,200)
cc2.add()
cc2.miu()
cc2.mul()
cc2.div()

#캡슐화