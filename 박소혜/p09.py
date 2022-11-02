score = [
    {'no':1, 'kor':100, 'eng':90, 'mat':90},
    {'no':2, 'kor':30, 'eng':20, 'mat':50},
    {'no':3, 'kor':80, 'eng':90, 'mat':30},
    {'no':4, 'kor':70, 'eng':50, 'mat':10}
]

total =0 
for i in score:
    total+= i["mat"]
print("수학성적의 합",total,"평균:",total//len(score))