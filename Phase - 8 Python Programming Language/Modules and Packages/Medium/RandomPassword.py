import random
import string

length = int(input())

characters = (
    string.ascii_letters +
    string.digits +
    "!@#$%^&*"
)

password = ''.join(random.choice(characters) for _ in range(length))

print("Generated password:", password)