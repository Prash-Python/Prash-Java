# This program prints numbers from n to 1 in descending order, where n is a positive integer input by the user.
def printNumbers(n):
    if n < 1:
        print("Please enter a positive integer.")
        return
    for i in range(n, 0, -1):
        print(i)
n = int(input("Enter any positive given number: "))
printNumbers(n)