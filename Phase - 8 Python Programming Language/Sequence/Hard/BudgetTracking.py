income = float(input("Enter your monthly income: "))
expenses = input("Enter your expenses (space-separated): ").split()

total_expenses = 0

for expense in expenses:
    total_expenses += float(expense)

remaining_budget = income - total_expenses

print(f"Remaining budget: ${remaining_budget:.2f}")