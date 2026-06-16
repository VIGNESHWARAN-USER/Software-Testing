s = input()

words = s.split()

if len(words) == 3:
    print("Print String in default order:")
    print("{} {} {}".format(words[0], words[1], words[2]))

    print("\nPrint String in Positional order:")
    print("{1} {0} {2}".format(words[0], words[1], words[2]))

    print("\nPrint String in order of Keywords:")
    print("{third} {second} {first}".format(
        first=words[0],
        second=words[1],
        third=words[2]
    ))