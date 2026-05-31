import re


class InvalidUsernameException(Exception):
    pass


class InvalidPasswordException(Exception):
    pass


def validate_username(username):

    if not (6 <= len(username) <= 30):
        raise InvalidUsernameException(
            "Username length should be between 6 and 30 characters."
        )

    if not re.match(r"^[A-Za-z][A-Za-z0-9_]*$", username):
        raise InvalidUsernameException(
            "Username format is invalid."
        )


def validate_password(password):

    if len(password) < 8:
        raise InvalidPasswordException(
            "Password must contain at least 8 characters."
        )

    if not re.search(r"[a-z]", password):
        raise InvalidPasswordException(
            "Password must contain a lowercase letter."
        )

    if not re.search(r"[A-Z]", password):
        raise InvalidPasswordException(
            "Password must contain an uppercase letter."
        )

    if not re.search(r"[0-9]", password):
        raise InvalidPasswordException(
            "Password must contain a digit."
        )

    if not re.search(r"[!@#$%^&*()\-+]", password):
        raise InvalidPasswordException(
            "Password must contain a special character."
        )


def validate_login(username, password):

    try:
        validate_username(username)
        validate_password(password)

        print(f"Welcome '{username}'")

    except (InvalidUsernameException,
            InvalidPasswordException) as e:
        print(f"Invalid username or password.\n(Reason: {type(e).__name__}: {e})")


username = input("Username: ")
password = input("Password: ")

validate_login(username, password)