package Module3;

public class Main {

    // Constants used for threshold values

    private final static int FIVE_HUNDRED = 500;
    private final static int FIFTEEN_HUNDRED = 1500;
    private final static int TWENTY_FIVE_HUNDRED = 2500;

    // Constants used for tax percentages:
    private final static float TEN_PERCENT = .1F;
    private final static float FIFTEEN_PERCENT = .15F;
    private final static float TWENTY_PERCENT = .2F;
    private final static float THIRTY_PERCENT = .3F;

    // Constant for generating random sample of incomes:
    private final static int FIVE_THOUSAND = 5000;

    public static void main(String[] args)
    {
        /*
        Assignment:
        Create a program that will calculate the weekly average tax withholding for a customer
        given the following weekly income guidelines:

        Income less than $500: tax rate 10%
        Incomes greater than/equal to $500 and less than $1500: tax rate 15%
        Incomes greater than/equal to $1500 and less than $2500: tax rate 20%
        Incomes greater than/equal to $2500: tax rate 30%
        Compile and submit your pseudocode, source code, and screenshots of the application executing the
        application, the results and GIT repository in a single document.

        Pseudocode block:

        Assign constants to be used.

        In a conditional block, determine, calculate, then print the tax withholding based on income.

        if income < $500, tax is 10% -> calculate and then print tax withholding
        else if income < 1500, tax is 15% -> calculate and then print tax withholding
        else if income < 2500, tax is 20% -> calculate and then print tax withholding
        else tax is 30% -> calculate and then print tax withholding

         */

        // Calculate with rounded numbers for quick verification:
        CalculateTax(100);
        CalculateTax(1000);
        CalculateTax(2000);
        CalculateTax(3000);

        // Generate sample of 10 incomes and calculate the tax withholding for each.
        for (int i = 0; i < 10; i++)
        {
            CalculateAndPrintTax((float)Math.random() * FIVE_THOUSAND);
        }
    }

    private static void CalculateTax(int income)
    {
        CalculateAndPrintTax(income);
    }

    private static void CalculateAndPrintTax(float income)
    {
        float tax = THIRTY_PERCENT;

        if (income < FIVE_HUNDRED)
            tax = TEN_PERCENT;
        else if (income < FIFTEEN_HUNDRED)
            tax = FIFTEEN_PERCENT;
        else if (income < TWENTY_FIVE_HUNDRED)
            tax = TWENTY_PERCENT;

        System.out.println("The tax withholding for $" + income + " is: " + (income * tax));
    }
}
