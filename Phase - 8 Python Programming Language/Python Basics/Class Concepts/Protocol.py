from typing import Protocol

class PaymentMethod(Protocol):
    def authorize_payment(self, amount: float) -> bool:
        ...
    def process_payment(self, amount: float) -> bool:
        ...

class CreditCardPayment:
    def authorize_payment(self, amount: float) -> bool:
        print(f"Authorizing credit card payment of amount ${amount}")
        return True
    
    def process_payment(self, amount: float) -> bool:
        print(f"Processing credit card payment of amount ${amount}")
        return True
    
class UPIPayment:
    def authorize_payment(self, amount: float) -> bool:
        print(f"Authorizing UPI payment of amount ${amount}")
        return True
    
    def process_payment(self, amount: float) -> bool:
        print(f"Processing UPI payment of amount ${amount}")
        return True
    

amount = float(input("Enter the amount"))

creditCardPayment = CreditCardPayment()
creditCardPayment.authorize_payment(5000)
creditCardPayment.process_payment(5000)

upiPayment = UPIPayment()
upiPayment.authorize_payment(5000)
upiPayment.process_payment(5000)