import data_validator
import data_processor

n = int(input("Enter records: "))
records = []

for i in range(n):
    print("Enter data for first record")
    usn = input("USN: ")
    name = input("Name: ")
    email = input("Email: ")
    phone = input("Phone: ")

    record = (name, usn, email, phone)
    records.append(record)

for record in records:
    try:
        data_validator.validate_usn(record[0])
        data_validator.validate_email(record[2])
        data_validator.validate_phone(record[3])
    except data_validator.InvalidFieldError as e:
        print(f"Error: {e}")
        continue

processed_records = data_processor.process_data(records)
data_processor.display_records(processed_records)
    
