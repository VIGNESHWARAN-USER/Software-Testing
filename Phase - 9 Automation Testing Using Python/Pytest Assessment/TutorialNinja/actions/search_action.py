from actions.base_action import BaseAction
import pages.home_page as hp
import pages.search_page as sp

class SearchAction(BaseAction):

    def __init__(self, driver):
        super().__init__(driver)
        self.sp = sp.SearchPage()
        self.hp = hp.HomePage()


    def check_if_product_found(self):
        return len(self.get_elements(self.sp.products)) != 0


    def search(self, key):
        self.send_keys(self.hp.search_input, key)
        self.click(self.hp.search_button) 

    