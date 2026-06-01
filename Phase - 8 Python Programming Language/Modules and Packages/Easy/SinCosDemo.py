from math import sin, cos, radians

degree = float(input())

print(f"sin(90) = {sin(radians(degree)):.1f}")
print(f"cos(90) = {round(cos(radians(degree)), 1)}")