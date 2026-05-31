text = input()

lowercase = ""
uppercase = ""

for ch in text:
    if ch.islower():
        lowercase += ch
    else:
        uppercase += ch

print(lowercase + uppercase)