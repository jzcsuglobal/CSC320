package Module5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /*
    Assignment:
    Develop a Java program that will store data in the form of monthly temperatures for a year.
    Store the month and temperature in two different arrays.
    Your program should prompt the user for the month to be viewed and display both the month and average temperature.
    If "year" is entered, the output for your program should provide the temperature for each month along with
    the yearly average as well as the highest and lowest monthly averages.
    Use the looping and decision constructs in combination with the arrays to complete this assignment.

    Psuedocode:
    Create a method to generate the monthly data. This should reference a Temperature class that will generate temps.
    Use this method to generate 12 months worth of temperatures.
    While userInput != 'year', display valid inputs.
    When userInput == 'year', display temperatures for each month, as well as the average temperature for the year.
    When userInput == the name of a month, display that month's temperatures.
     */
    private static double _averageTemp = 0;

    public static void main(String[] args)
    {
        var averageTempsForAYear = GenerateTemperatureArray();
        var averageTemperature = 0;
        for (var item : averageTempsForAYear)
        {
            averageTemperature += item.get_aveTemp();
        }

        set_aveTemp(averageTemperature);

        var scanner = new Scanner(System.in);
        System.out.println("Input the name of a month to see the temperatures for that month.");
        System.out.print("Only enter a valid month's name or 'quit' to exit the program. Type 'year' for all months.");
        var userInput = "";
        do
        {
            userInput = scanner.nextLine();
            for (var month: averageTempsForAYear)
            {
                if (userInput.equals("quit"))
                {
                    break;
                }

                else if (userInput.equalsIgnoreCase("year"))
                {
                    DisplayYearData(averageTempsForAYear);
                    System.out.println("Average temperature for the entire year: " + get_aveTemp());
                    break;
                }

                else if (userInput.equalsIgnoreCase(month.get_monthName())) {
                    DisplayMonthData(month);
                    System.out.println("Average temperature for the entire year: " + get_aveTemp());
                    break;
                }

            }
            System.out.println("Please enter a month name, 'year', or 'quit'.");

        } while(!userInput.equalsIgnoreCase("quit"));

    }

    private enum Months {
        January,
        February,
        March,
        April,
        May,
        June,
        July,
        August,
        September,
        October,
        November,
        December
    }

    private static void DisplayMonthData(Temperature month)
    {
        System.out.println();
        System.out.println("_____");
        System.out.println("Average temperature for " + month.get_monthName() + ": " + month.get_aveTemp() + ".");

    }

    private static void DisplayYearData(ArrayList<Temperature> arrayList)
    {
        for (var item : arrayList)
        {
            DisplayMonthData(item);
        }

    }

    private static double get_aveTemp()
    {
        return _averageTemp;
    }

    private static void set_aveTemp(double temp)
    {
        _averageTemp = temp/12;
    }

    private static ArrayList<Temperature> GenerateTemperatureArray()
    {
        var returnArray = new ArrayList<Temperature>();
        for (var item : Months.values())
        {
            returnArray.add(new Temperature(item.name()));

        }
        return returnArray;
    }
}
