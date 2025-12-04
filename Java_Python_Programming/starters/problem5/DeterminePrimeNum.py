def determineIfPrime(num):
    for i in range(2, int(num/2) + 1, 1):
        if num % i == 0:
            return f"{num} is not a prime number"
    return f"{num} is a prime number"
number = int(input("Enter a positive integer: "))
print(determineIfPrime(number))