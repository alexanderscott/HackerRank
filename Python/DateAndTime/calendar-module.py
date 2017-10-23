# https://www.hackerrank.com/challenges/calendar-module

import calendar

[month, day, year] = map(int, raw_input().split())
weekdayInt = calendar.weekday(year, month, day)
weekdays = ["MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY",
        "SUNDAY"]
print(weekdays[weekdayInt])

