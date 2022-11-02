'''
filename : datetest.py
'''

#오늘날짜 출력
from datetime import datetime


now = datetime.now()
#오늘날짜 출력
print(now.year)
print(now.month)

#현재시간 출력
print(now.hour)
print(now.minute)
