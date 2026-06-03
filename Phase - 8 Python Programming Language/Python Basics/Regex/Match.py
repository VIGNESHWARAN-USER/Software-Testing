import re

text = "Alan Turing was born on 23 June 1912 in London."
res = re.search("Turing", text)

print("Match Object Outputs")
print("-"*60)

print("Match Object = ", res)
print("-"*60)

print("Gruop method output = ", res.group())
print("-"*60)

print("Span method output = ", res.span())
print("-"*60)

print("Start method output = ", res.start())
print("-"*60)

print("End method output = ", res.end())
print("-"*60)

print("String attribute output = ", res.string)
print("-"*60)

print("RE attribute output = ", res.re)
print("-"*60)