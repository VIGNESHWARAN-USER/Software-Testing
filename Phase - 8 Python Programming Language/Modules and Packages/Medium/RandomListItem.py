import random
import ast

items = ast.literal_eval(input())

print(random.choice(items))