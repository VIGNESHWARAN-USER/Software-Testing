import re

text = "Alan Turing was born on 23 June 1912 in London."

print()
print("Special Sequence in RegEx")
print("-"*80)

res = re.findall(r"\AAlan", text)
print(r"Result of \A = ", res)
print("-"*80)

res = re.findall(r"\bLon", text)
print(r"Result of \b = ", res)
print("-"*80)

res = re.findall(r"ring\b", text)
print(r"Result of \b = ", res)
print("-"*80)

res = re.findall(r"\Bon", text)
print(r"Result of \B = ", res)
print("-"*80)

res = re.findall(r"\d", text)
print(r"Result of \d = ", res)
print("-"*80)

res = re.findall(r"\D", text)
print(r"Result of \D = ", res)
print("-"*80)

res = re.findall(r"\s", text)
print(r"Result of \s = ", res)
print("-"*80)

res = re.findall(r"\S", text)
print(r"Result of \S = ", res)
print("-"*80)

res = re.findall(r"\w", text)
print(r"Result of \w = ", res)
print("-"*80)

res = re.findall(r"\W", text)
print(r"Result of \W = ", res)
print("-"*80)

res = re.findall(r"London.\Z", text)
print(r"Result of \Z = ", res)
print("-"*80)

