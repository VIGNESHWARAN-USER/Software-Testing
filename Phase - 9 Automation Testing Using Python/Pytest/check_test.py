import pytest_check as check

def test_login():
    check.equal(10, 10, "First validation")
    check.equal(20, 25, "Second validation")
    check.is_true("Python" == "Python", "Third validation")

    print("Test continues even after failures")