try:
    with open("sample.bin", "wb") as file:
        file.write(b"Hello Binary World")
except IOError:
    print("IO Exception occured")
else:
    print("No exception occured")
finally:
    print("Code executed successfully.")