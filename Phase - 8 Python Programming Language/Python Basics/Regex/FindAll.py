import re

text = "Alan was born on 23 June 1912 in Maida Vale, London Alan lives in London Alan studied in London"
res = re.findall(r"Alan.*?London", text)

print(res)