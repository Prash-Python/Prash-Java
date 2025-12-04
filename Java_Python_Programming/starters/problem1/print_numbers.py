# This program prints numbers from 1 to n, where n is a positive integer input by the user.

def printNumbers(n):
    for i in range(1, n + 1):
        print(i)
n = int(input("Enter a positive integer: "))
printNumbers(n)