'''
filename: map.py
'''

# arr = input().split(' ')
arr = list(map(int,input().split(' ')))
# for i in range(len(arr)):
#     arr[i] = int(arr[i])

# for i in range(len(arr)):
#     arr[i] = arr[i]*arr[i]

# for el in arr :
#     print(el)
# arr = [1,2,3,4,5]


# for i in range(len(arr)) :
#     arr[i] = arr[i]**2
    # print(arr[i])
# def power(item) :
#     return item**2
arr = list(map(lambda item : item**2, arr))

for el in arr:
    print(el)