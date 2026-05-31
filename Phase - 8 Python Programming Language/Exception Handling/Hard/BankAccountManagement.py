class PayOutOfBoundsException(Exception):
    pass


class AccountManagement:

    def __init__(self):
        self.current_balance = 80000
        self.max_transaction_limit = 30000

    def withdraw(self, amount):

        if amount > self.max_transaction_limit:
            raise PayOutOfBoundsException(
                "Transaction amount exceeds maximum limit."
            )

        if amount > self.current_balance:
            raise PayOutOfBoundsException(
                "Insufficient balance."
            )

        self.current_balance -= amount

        print("Withdrawal successful.")
        print(f"Updated balance: {self.current_balance}")


try:
    amount = int(input("Withdraw amount: "))

    account = AccountManagement()
    account.withdraw(amount)

except PayOutOfBoundsException as e:
    print("Error:", e)