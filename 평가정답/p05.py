movie = [
    '리멤버',
    '블랙아담',
    '인생은아름다워',
    '스파이럴'
    ]

movie.insert(0,'자백')
movie.remove('블랙아담')   #delete(인덱스), remove(value)차이
print(f'리스트: 총 {len(movie)}개')
print()
for i in range(len(movie)):
    print(f'{i+1} {movie[i]}')