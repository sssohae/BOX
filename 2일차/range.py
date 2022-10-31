'''
filename :range.py
특정한 횟수만큼 반복 
11-0   (11- i)//2
9 - 1
7 - 2
" "*i
'''

#1~10
# n = input()
# n = int(n)

# for i in range(1,n+1):

#     # print(" "*(n-i),"*"*i)

output = ""
n = int(input())
for i in range(1,n+1) :
    #공백 출력
    for j in range(n-i):
        print(" ", end="")
    #별출력
    for j in (range(i)) :
        print("*", end="")
    print()


output = ""
for i in range(1,n+1) :
    #공백 출력
    for j in range(n-i):
        output += " "
        # print(" ", end="")
    #별출력
    for j in (range(i)) :
        output += "*"
        # print("*", end="")
    # print()
    output += '\n'
print(output)