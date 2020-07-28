# 백준 1920 수 찾기

N = int(input())
arrA = list(map(int, input().split(' ')))

M = int(input())
arrM = list(map(int, input().split(' ')))

arrA.sort()

def bin_tree(arrA, i, start, end): # bin_tree(비교될 배열A, 입력하는 배열M, 0부터, 배열 A의 길이 -1)
    if start > end: #존재하는 수 없음 0 리턴
        return 0
    mid = (start + end) // 2 # 가운데 수 지정
    if arrA[mid] > i: # 배열 A의 가운데 인덱스 와 비교하는 값 비교 후
        return bin_tree(arrA, i, start, mid-1) # 가운데 수보다 적은 수로 돌아가서 반복
    elif arrA[mid] < i:
        return bin_tree(arrA, i, mid+1, end) # 가운데 수보다 큰 수로 돌아가서 반복
    else:
        return 1

for i in arrM:
    print(bin_tree(arrA, i, 0, N-1))





