import pytest

@pytest.mark.xfail
def test_sample_1():
    assert 1+1 == 2

@pytest.mark.parametrize("test_input, expected",[(1, 3), (2, 4), (5, 7)])
def test_sample_2(test_input, expected):
    assert test_input+2 == expected

@pytest.mark.skip("This test is skipped")
def test_sample_3():
    assert 1+1 == 3, "Assertion fails"