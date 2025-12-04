def determineEvenOrOdd(number):
    if number % 2 == 0:
        return f"{number} is Even"
    else:
        return f"{number} is Odd"
num = int(input("Enter an integer: "))
print(determineEvenOrOdd(num))