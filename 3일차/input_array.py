'''
filename : input_array.py
'''

today = input()
arr = input().split(" ")
cnt = 0
for carNo in arr :
    if today == carNo :
        cnt+=1
print(cnt)