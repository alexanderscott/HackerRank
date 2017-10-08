# https://www.hackerrank.com/challenges/py-collections-ordereddict

from collections import OrderedDict

n = int(raw_input())
inventory_dict = OrderedDict()

for i in range(n):
    item_price_list = raw_input().split(" ")
    (item, price) = (" ".join(item_price_list[0:-1]), int(item_price_list[-1]))
    if item in inventory_dict:
        inventory_dict[item] = inventory_dict[item] + price
    else:
        inventory_dict[item] = price

for key in inventory_dict:
    print("{} {}".format(key, str(inventory_dict[key])))
