'''
filename : class.py
'''
class StdScore:

   std = []

    def mat_total(self): 
        matSum = 0 
        for idx in range(len(self.std)) : 
            matSum += self.std[idx]['mat']
        print(matSum)

stdScore = StdScore()
stdScore.std = [{'mat':50, 'eng':80},
                {'mat':60, 'eng':90},
                {'mat':70, 'eng':100}
                ]
stdScore.mat_total()

stdScore.std = [{'mat':50, 'eng':80},
                {'mat':60, 'eng':90},
                {'mat':70, 'eng':100}
                ]
stdScore.mat_total()

#클래스 호출학 