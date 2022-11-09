score = [ 80, 90, 100, 60, 70, 85, 60  ]
min_num = min(score) 
max_num = max(score)

score.remove(min_num) 
score.remove(max_num)

total = sum(score)   
cnt = len(score)
avg =  total / cnt
print(f"최소값:{min_num}   최대값:{max_num}   갯수:{cnt}   평균:{avg}")