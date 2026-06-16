from collections import Counter

words = eval(input())
charset = eval(input())

charset_count = Counter(charset)

for word in words:
    word_count = Counter(word)

    possible = True

    for ch in word_count:
        if word_count[ch] > charset_count[ch]:
            possible = False
            break

    if possible:
        print(word, end=", ")