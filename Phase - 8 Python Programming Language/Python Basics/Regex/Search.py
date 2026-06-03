import re

text = "Alan was born on 23 June 1912 in Maida Vale, London"
res = re.search("^Alan.*London$", text)
print(res.group())

if(res):
    print("We have a match!")
else:
    print("We don't have a match")