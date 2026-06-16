from pytest_assume.plugin import assume

def test_example():

    assume(10 == 20)

    assume("Hello" == "World")

    assume(True == True)

    print("Execution continues")