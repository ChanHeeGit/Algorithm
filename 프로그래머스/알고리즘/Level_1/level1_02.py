# 프로그래머스 LEVEL1 
# 두 정수 사이의 합 

def solution(a, b):
    answer = 0
    if a==b:
        answer = a
    elif a>b:
        for i in range(b,a+1,1):
            answer+=i
    else:
        for i in range(a,b+1,1):
            answer+=i
    return answer 
