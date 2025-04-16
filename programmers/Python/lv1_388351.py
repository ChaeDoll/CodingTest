# 250416 유연근무제 / LV.1 / 47%
# 시간의 차를 구할 때는 무조건 시간x60을 해서 분으로 계산하자.
# ------------------------------

def calc_minute(logs, schedules):
    log_hour = int(logs/100)
    log_minute = log_hour*60 + logs%100 
    sche_hour = int(schedules/100)
    sche_minute = sche_hour*60 + schedules%100
    print(log_minute, sche_minute)
    return log_minute, sche_minute
    
def solution(schedules, timelogs, startday):
    answer = 0
    index = 0
    for logs in timelogs:
        flag = False
        if startday==7: # 일요일
            for i in range(1, 6):
                log_minute, sche_minute = calc_minute(logs[i], schedules[index])
                if log_minute-sche_minute > 10:
                    flag=True  
        else: # 월요일 ~ 토요일
            for i in range(6-startday):
                log_minute, sche_minute = calc_minute(logs[i], schedules[index])
                if log_minute-sche_minute > 10:
                    flag=True
            for i in range(startday-1):
                log_minute, sche_minute = calc_minute(logs[6-i], schedules[index])
                if log_minute-sche_minute > 10:
                    flag=True   
        index+=1
        if flag==False:
            answer+=1
    return answer

s = [700, 800, 1100]
t = [[710, 2359, 1050, 700, 650, 631, 659], [800, 801, 805, 800, 759, 810, 809], [1105, 1001, 1002, 600, 1059, 1001, 1100]]
st = 5
ans = solution(s, t, st)
print(ans)
