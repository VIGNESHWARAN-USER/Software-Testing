def set_intersection_count(sets):
    common = sets[0]

    for s in sets[1:]:
        common = common & s

    return len(common)

sets = eval(input())

print(set_intersection_count(sets))