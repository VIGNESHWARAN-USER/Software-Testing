def largest(t):
    if len(t) == 1:
        return t[0]

    m = largest(t[1:])

    if t[0] > m:
        return t[0]
    else:
        return m

t = eval(input())

print("Maximum Item in Tuple =", largest(t))