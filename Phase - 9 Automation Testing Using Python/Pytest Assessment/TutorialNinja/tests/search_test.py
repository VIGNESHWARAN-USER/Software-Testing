import pytest
from utilities.config_reader import get_value
from actions.search_action import SearchAction

@pytest.mark.smoke
@pytest.mark.usefixtures("setup")
class TestSearch:

    @pytest.mark.parametrize("key", get_value("config.ini", "key set","search_keys").split(","))
    def test_valid_product(self, key):
        self.sa = SearchAction(self.driver)
        self.sa.search(key)
        assert self.sa.check_if_product_found()
