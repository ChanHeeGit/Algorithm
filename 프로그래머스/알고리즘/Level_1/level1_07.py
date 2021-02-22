# 프로그래머스 LEVEL1 
# 자연수 뒤집어 배열로 만들기

def solution(n):
    # reversed 적용을 위해 str type으로 변환
    # map 내장함수를 통해 float->int형으로 변환
    # 변환된 값을 다시 List로 씌움

    return list(map(int, reversed(str(n))))




