import pytest

@pytest.mark.smoke
@pytest.mark.dependency(name="sample1")
def test_sample_1():
    assert 1 + 1 == 2


@pytest.mark.regression
@pytest.mark.dependency(depends=["sample1"])
def test_sample_2():
    assert 1 + 1 == 3


@pytest.mark.regression
@pytest.mark.dependency(depends=["sample1"])
def test_sample_3():
    assert 1 + 1 == 3, "Assertion fails"