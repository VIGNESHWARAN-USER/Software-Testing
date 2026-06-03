import re

email_pattern = r"\b[A-Za-z0-9.%+-]+@[A-Za-z0-9.-]+\.[a-z|A-Z]{2,}\b"

text_with_emails = "Contact us at trainer@smartcliff.in or gayathri.manoj@smartcliff.in"

res = re.findall(email_pattern, text_with_emails)

print(res)