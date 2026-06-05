def process_data(records):
    processed_records = []
    for data in records:
        processed_records.append((data[1], data[0], data[2].split("@")[0], data[2].split("@")[1]))

    return processed_records

def display_records(records):
    print(f"Valid Records : {len(records)}")
    print("USN", " "*10, "|","Name", " "*10,"|", "Username","|", " "*10,"|", "Domain", " "*10)
    for record in records:
        print(record[0], ""*2, "|",record[1], ""*2, "|",record[2], ""*2, "|",record[3], ""*2)