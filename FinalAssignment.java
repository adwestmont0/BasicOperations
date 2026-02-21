public class FinalAssignment
{
    public static int num1, num2;
    static { // It needs to be a static block to initialize static variables and not be an instance initializer block
        // Initialize two positive integers tied to the class
        num1 = (int)(Math.random() * 100) + 1; // Integer from 1 to 100
        num2 = (int)(Math.random() * 100) + 1; // Integer from 1 to 100
        
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }
    
    public static int RepeatedAddition(int a, int b)
    {
        int product = 0; // Initialize product to 0
        for (int i = 0; i < b; i++) // Loop 'b' times, adding 'a' to the product each iteration
        {
            product += a; // Add 'a' to itself 'b' times
        }
        return product; 
    }

    public static int RepeatedSubtraction(int a, int b)
    {
        int quotient = 0; // Initialize quotient to 0
        while (a >= b)
        {
            a -= b; // Subtract 'b' from 'a' until 'a' is less than 'b'
            quotient++; // Increment the quotient for each subtraction
            // The quotient represents how many times 'b' can be subtracted from 'a' before 'a' becomes less than 'b'
        }
        return quotient;
    }

    public static int CalculateRemainder(int a, int b)
    {
        while (a >= b)
        {
            a -= b; // Subtract 'b' from 'a' until 'a' is less than 'b'
        }
        
        return a; // The remaining value of 'a' is the remainder
    }

    public static void main(String[] args)
    {
        int product = RepeatedAddition(num1, num2);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        int quotient = RepeatedSubtraction(num1, num2);
        System.out.println("The quotient of " + num1 + " and " + num2 + " is: " + quotient);
        int remainder = CalculateRemainder(num1, num2);
        System.out.println("The remainder of " + num1 + " and " + num2 + " is: " + remainder);
    }
}