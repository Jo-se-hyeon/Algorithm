# 백준 11399 ATM - 그리디 알고리즘
cnt = int(input())
p = list(map(int, input().split(" ")))

p.sort()

result = 0
sum = 0

for i in range(cnt):
    result += (sum + p[i])
    sum += p[i]

print(result)


