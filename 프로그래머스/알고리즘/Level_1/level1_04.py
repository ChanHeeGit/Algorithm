# 프로그래머스 LEVEL1 
# 문자열 내림차순으로 배치하기

def solution(s):
    answer = ''
    answer = ''.join(sorted(s, reverse=True))
    return answer