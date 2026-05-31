import re

text = input()

result = re.sub(r'[^a-zA-Z0-9\s]', '#', text)

print(result)