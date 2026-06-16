import math

radius = float(input("Enter the radius of the circle: "))
angle = float(input("Enter the angle in degrees (for sector area): "))

diameter = 2 * radius
circumference = 2 * math.pi * radius
sector_area = (angle / 360) * math.pi * radius * radius
arc_length = (angle / 360) * circumference

print("Radius:", radius)
print("Diameter:", diameter)
print("Circumference:", circumference)
print("Sector Area for", angle, "degrees:", sector_area)
print("Arc Length for", angle, "degrees:", arc_length)