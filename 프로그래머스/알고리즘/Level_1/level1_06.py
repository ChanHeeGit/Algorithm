# 프로그래머스 LEVEL1 
# K번째 수 

def solution(array, commands):
    answer = []
    for fI, sI, num in commands:
        tempArr = sorted(array[fI-1:sI])
        answer.append(tempArr[num-1])
        
        
    return answer



