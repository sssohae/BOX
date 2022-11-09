score = [ 80, 90, 100, 60, 70, 85, 60  ]
min_num = min(score) 
max_num = max(score)
cnt = len(score)-2
total = sum(score)- min_num - max_num
avg =  total / cnt
print(f"최소값:{min_num}   최대값:{max_num}   갯수:{cnt}   평균:{avg}")