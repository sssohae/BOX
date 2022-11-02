score = [80,90,100,60,70,85,60]
score2 =[]

for i in score : 
    if i !=60 and i !=100 :
        score2.append(i)

print("최소값:",min(score),"최대값:",max(score),
"갯수:",len(score2),"평균:",sum(score2)/len(score2))