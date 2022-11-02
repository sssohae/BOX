movie = [ '리맴버',
          '블랙아담',
          '인생은아름다워',
          '스파이럴'
        ]

movie.insert(0,"자백")
movie.remove("블랙아담")
print("리스트 : 총",len(movie),"개")
print()
num=0
for i in movie :
    num+=1 
    print(num,i)

