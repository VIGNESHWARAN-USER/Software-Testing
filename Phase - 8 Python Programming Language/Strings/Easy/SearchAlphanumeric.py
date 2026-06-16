text = input()

words = text.split()

for word in words:
    if word.isalnum() and any(ch.isdigit() for ch in word):
        print(word) 