# 백준 1654 랜선자르기

import sys # 인터프리터가 제공하는 변수와 함수를 제어하는 모듈
input = sys.stdin.readline
K, N = map(int, input().split())
arr = [int(input()) for _ in range(K)]
left, right = 1, max(arr) # 최소값을 1 최대값을 배열의 가장 큰 값으로 지정한다.

while(left <= right): #값이 같아지거나 더 커질때 까지 탐색한다.
    mid = (left+right) // 2 # 먼저 중간값을 구한다.
    sum = 0
    for i in arr: # 랜선 길이를 중간값으로 자른다
        sum += i // mid # 자르고 나오는 랜선의 개수 저장

    if sum >= N: # 랜선의 개수가 지정한 개수 보다 많으면
        left = mid+1 # 시작 값을 현재 자른값+1 즉 값을 올리면서 탐색한다.
    else:
        right = mid-1 # 아니라면 자른값-1로 값을 내리면서 탐색한다.

print(right)