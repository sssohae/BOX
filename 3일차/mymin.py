'''
filename = mymin.py
'''

def mymin(*nums) :
    min = nums[0]
    for num in nums :
        if min > num :
            min = num
    return min

result = mymin(3,5,10,2,100,5,25,0,1)
print(result)