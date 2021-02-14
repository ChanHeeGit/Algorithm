# 프로그래머스 LEVEL1 
# 완주하지 못한 선수

def solution(participant, completion):
    answer = ''
    participant.sort()
    completion.sort()

    for i in range(len(completion)):
        if participant[i] != completion[i]:
            return participant[i]
    answer = participant[-1]
                
            
    return answe