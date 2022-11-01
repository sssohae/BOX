'''
filename : fileread.py
'''
#open
with open('basic.txt', 'r') as file :

#read 한 줄씩 처리 
    lines = file.readlines()
    for line in lines:
        info = line.split(" ")
        print(info[1])

# #close
# file.close()
