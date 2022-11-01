'''
filename : filter.py
'''


arr = [3,1,30,10,310]

'''
for el in arr :
    if el > 5 :
        newarr.append(el)
'''
def comp(item):
    return item > 5

newarr = list(filter(lambda x : x > 5 , arr))
print(newarr)       
