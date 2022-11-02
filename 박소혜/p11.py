score = [
    {'no':1, 'kor':100, 'eng':90, 'mat':90},
    {'no':2, 'kor':30, 'eng':20, 'mat':50},
    {'no':3, 'kor':80, 'eng':90, 'mat':30},
    {'no':4, 'kor':70, 'eng':50, 'mat':10}
]

def under_60(item):
    for i in score:
        if i["kor"] < 60:
            return i["no"] 

ga= list(filter(under_60,score))
print(ga)
na= list(map(lambda item : item["kor"] >60, score))
print(na)