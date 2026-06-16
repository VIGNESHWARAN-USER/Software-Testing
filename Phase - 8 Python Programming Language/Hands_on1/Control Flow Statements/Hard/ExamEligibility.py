classes_held = int(input("Enter number of classes held: "))
classes_attended = int(input("Enter number of classes attended: "))

attendance = (classes_attended / classes_held) * 100

if attendance >= 75:
    print(f"{attendance:.0f}% Allowed")
else:
    medical = input("Do you have a medical cause? (Y/N): ")

    if medical.upper() == "Y":
        print(f"{attendance:.0f}% Allowed")
    else:
        print(f"{attendance:.0f}% Not allowed")