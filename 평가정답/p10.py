score = [
    {'no':1, 'kor':100, 'eng':90, 'mat':90},
    {'no':2, 'kor':30, 'eng':20, 'mat':50},
    {'no':3, 'kor':80, 'eng':90, 'mat':30},
    {'no':4, 'kor':70, 'eng':50, 'mat':10}
]
userno = int(input('번호입력:'))
for i in range(len(score)):
    if score[i]['no'] == userno:
        print(score[i]['kor']+score[i]['eng']+score[i]['mat'])