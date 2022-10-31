score = [10,50,5]

total = 0
for i in score  : 
    total += i
print('합계',total)


maxScore = score[0]
minScore = score[0]
#합계면 초기값이 0이 맞지만 최소, 최대는 배열의 첫번째 값을 초기값으로 넣어주면 됨 
# if score[i] > score[i+1]: 완전 틀린 시도임. 안됨.. .

for i in score :
    if i > maxScore :
        maxScore = i
    if i < minScore : 
        minScore = i
print('최대',maxScore)
print('최소',minScore)

