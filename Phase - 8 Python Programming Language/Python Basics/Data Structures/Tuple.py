tup = 10, 20, [1, 2, 3]
tup1 = (100,) + tup[1:]

print(tup)
print(tup1)
print(tup is tup1)

addr = 'abd@gmail.com'

uname, domain = addr.split("@")

print(uname, domain)

quot, rem = divmod(2, 5)
print(quot, rem)
