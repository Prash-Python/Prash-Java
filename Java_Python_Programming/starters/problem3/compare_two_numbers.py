# Compare two numbers and print the larger one or indicate if they are equal.
# def compareTwoNumbers(a, b):
#     if a > b:
#         print(f"{a} is greater than {b}")
#     elif b > a:
#         print(f"{b} is greater than {a}")
#     else:
#         print("Both numbers are equal")
# num1 = int(input("Enter the first number: "))
# num2 = int(input("Enter the second number: "))
# compareTwoNumbers(num1, num2)

def compareGivenNumbers(a, b):
    if a == b:
        return "Both numbers are equal"
    return f"{a} is greater than {b}" if a > b else f"{b} is greater than {a}"
num1 = int(input("Enter the first number: "))
num2 = int(input("Enter the second number: "))
print(compareGivenNumbers(num1, num2))