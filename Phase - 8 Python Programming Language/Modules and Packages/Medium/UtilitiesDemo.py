from utilities.string_utils import count_vowels
from utilities.number_utils import is_prime

choice = int(input())

if choice == 1:
    text = input()
    print(count_vowels(text))

elif choice == 2:
    num = int(input())
    print(is_prime(num))   