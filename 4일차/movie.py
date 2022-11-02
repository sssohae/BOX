'''
filename. movie.py
'''

import requests
def movie_rank(dt) :
    url = f"http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt={dt}" #+ dt
    result = requests.get(url) #string 
    result = result.json() #dictionary 혹은 list로 변환. 객체로 읽을 수 있음

    boxOfficeResult = result["boxOfficeResult"]
    dailyBoxOfficeList = boxOfficeResult["dailyBoxOfficeList"]

    dailyBoxOfficeList = result["boxOfficeResult"]["dailyBoxOfficeList"]
    print(dailyBoxOfficeList[0]["movieNm"])

    # rank movieCd movieNm
    for i in dailyBoxOfficeList :
        print(f'{i["rank"]}\t{i["movieCd"]}\t{i["movieNm"]}')
        # print(i["rank"],i["movieCd"],i["movieNm"])

# print("20221101")
# movie_rank("20221101")

# print("20220310")
# movie_rank("20220310")
# dt = input() #함수 안에서는 input 받지마 

# movieCd 넘겨주면 - 상세정보조회함수 선언
#typeNm openDt actors showTm 


def movie_info(movieCd) : 
    url = f"http://www.kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieInfo.json?key=f5eef3421c602c6cb7ea224104795888&movieCd={movieCd}"
    result =requests.get(url)
    result =result.json()

    info = result["movieInfoResult"]["movieInfo"]

    # rank movieCd movieNm
    
    # print(info["showTm"],info["openDt"],info["typeNm"])
    print(f'{info["showTm"]}\t{info["openDt"]}\t{info["typeNm"]}')

    
    for i in info["actors"] :
        # print(i["peopleNm"], i["cast"])
        print(f'{i["peopleNm"]}\t{i["cast"]}')
    print('감독', info["directors"][0]["peopleNm"])

if __name__ == "__main__" :
    print("20219628")
    movie_info("20219628")


