'''
filename : proc.py
'''
#학생의 성적을 계산하는 프로그램
std = [{'mat':50, 'eng':80},
       {'mat':60, 'eng':90},
       {'mat':70, 'eng':100}
       ]

matSum = 0 
for idx in range(len(std)) : 
    # for idx in std : 
    matSum += std[idx]['mat']
    # matSum += idx['mat']
print(matSum)
