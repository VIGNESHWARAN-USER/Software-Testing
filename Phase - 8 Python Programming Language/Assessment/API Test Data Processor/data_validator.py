import re

class InvalidFieldError(Exception):
    pass

def validate_email(email):
    regText = r"[A-Za-z0-9_.]+@[A-Za-z0-9].[A-Za-z]{2, 5}"
    if(re.match(regText, email)):
        return True
    else:
        raise InvalidFieldError("Email", email)

def validate_phone(phone):
    regText = r"+91 [6-9][1-0]{9}"
    if(re.match(regText, phone)):
        return True
    else:
        raise InvalidFieldError("Phone", phone)


def validate_usn(usn):
    regText = r"25MCA\d{3}"
    if(re.match(regText, usn)):
        return True
    else:
        raise InvalidFieldError("USN", usn)