def anagram_groups(words):
    groups = {}

    for word in words:
        key = ''.join(sorted(word.replace(" ", "")))

        if key not in groups:
            groups[key] = set()

        groups[key].add(word)

    return list(groups.values())

words = eval(input())

print(anagram_groups(words))