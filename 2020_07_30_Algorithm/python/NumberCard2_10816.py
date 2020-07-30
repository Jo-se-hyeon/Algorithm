# 백준 10816 숫자 카드2

from collections import Counter # collections 모듈의 Counter 사용 딕셔너리의 확장기능이다.

N = int(input())
arrN = list(map(int, input().split(' ')))

M = int(input())
arrM = list(map(int, input().split(' ')))

arrN = Counter(arrN) # ex) arrN = { 6 3 2 10 10 10} -> [(6 : 1), (3 : 1), (2 : 1), (10 : 3)]
for i in arrM:
    print(arrN[i], end=" ")
