def mat_total(std): 
    matSum = 0 
    for idx in range(len(std)) : 
        matSum += std[idx]['mat']
    print(matSum)

def eng_total(std): 
    matSum = 0 
    for idx in range(len(std)) : 
        matSum += std[idx]['mat']
    print(matSum)

std = [{'mat':50, 'eng':80},
       {'mat':60, 'eng':90},
       {'mat':70, 'eng':100}
       ]
mat_total(std)