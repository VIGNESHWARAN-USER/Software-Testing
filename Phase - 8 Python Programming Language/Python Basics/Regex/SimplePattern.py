import re
patter = r"\b\w+ing\b"
text = "Walking and talking are important activities"

res = re.findall(patter, text)

if res:
    if isinstance(res, list):
        print(res)
    else:
        print("Match found: ", res.group())
else:
    print("No match found")