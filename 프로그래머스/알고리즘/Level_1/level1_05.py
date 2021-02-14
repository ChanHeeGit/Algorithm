# 프로그래머스 LEVEL1 
# 문자열 내 p와 y의 개수

def solution(s):
    answer = True
    cntP = 0
    cntY = 0
    
    for i in s:
        if i == 'p' or i == 'P':
            cntP+=1
        elif i == 'y' or i == 'Y':
            cntY+=1
    
    if cntP == cntY:
        return True
    else:
        return False