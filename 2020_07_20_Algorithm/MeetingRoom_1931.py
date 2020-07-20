# 백준 1931 회의실 배정
cnt = int(input())
room = []
for i in range(cnt):
    room.append(list(map(int, input().split(" "))))
# 배열에 넣어준 값을 뒤 시간으로 정렬 후 앞 시간으로 재정렬한다
room = sorted(room, key=lambda x:(x[1], x[0]))

end = result = 0
for i in room:
    if end <= i[0]: # 이전 회의 종료시간과 회의 시작시간을 비교하여 시작시간이 더 느리면
        end = i[1] # 끝나는 시간 교체
        result += 1 # 회의 수를 증가

print(result)