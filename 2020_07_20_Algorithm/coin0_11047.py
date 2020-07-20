'''백준 11047 동전 0'''
cnt, won = map(int, input().split(" "))
coin = []
# 입력한 개수만큼의 동전종류를 입력
for i in range(cnt):
    coin.append(int(input()))
# 최소한의 동전값을 찾아주는 함수
def min_count(value, coin_list):
    total_coin_count = 0
    # 가장 큰 값부터 정렬하여
    coin_list.sort(reverse = True)
    for coin in coin_list:
        # 가장 큰 값부터 대입하여 몫을 구하고
        coin_num = value // coin
        # 구한 값으로 카운트
        total_coin_count += coin_num
        # 코인값 만큼 총 값에서 빼주고 다시 반복합니다.
        value -= coin_num * coin
    return total_coin_count

result = min_count(won, coin)
print(result)