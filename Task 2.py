def calculator():
    try:
        num1 = float(input("Enter the first number: "))
        num2 = float(input("Enter the second number: "))
        print("Choose an operation:")
        print("1. Addition (+)")
        print("2. Subtraction (-)")
        print("3. Multiplication (*)")
        print("4. Division (/)")
        operation = input("Enter the number corresponding to the operation: ")
        if operation == '1':
            result = num1 + num2
            print(f"The result of {num1} + {num2} is {result}")
        elif operation == '2':
            result = num1 - num2
            print(f"The result of {num1} - {num2} is {result}")
        elif operation == '3':
            result = num1 * num2
            print(f"The result of {num1} * {num2} is {result}")
        elif operation == '4':
            if num2 == 0:
                print("Error: Cannot divide by zero.")
            else:
                result = num1 / num2
                print(f"The result of {num1} / {num2} is {result}")
        else:
            print("Invalid operation choice. Please choose a valid operation.")
    except ValueError:
        print("Invalid input! Please enter valid numbers.")
calculator()