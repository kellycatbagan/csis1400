//Kelly Catbagan
//CSIS 1400
//Koziatek
//
//ASSUMMPTIONS
// 1. User enters positive int for savings
// 2. User enter positive double for apr

import javax.swing.JOptionPane;

public class CompoundInterest
{

    public static void main(String[] args)
    {
        String dialoginput1;                                                        //declaration of variables to be used
        int savings;
        String dialoginput2;
        double apr;
        double value;

        dialoginput1 = JOptionPane.showInputDialog("Enter monthly savings amount"); //takes dialoginput1 as String
        savings = Integer.parseInt(dialoginput1);                                   //converts dialoginput1 from String to int

        dialoginput2 = JOptionPane.showInputDialog("Enter annual interest rate");   //takes dialoginput2 as String
        apr = Double.parseDouble(dialoginput2);                                     //converts dialoginput2 from String to double

        value = 0;                                                                  //initializes bank account value
        apr = apr / 12;                                                             //assigns value to variable apr

        for (int n = 0; n < 6; n++)                                                 //for loop iterates up to 6 months of savings
        {   
            value = (savings + value) * (1 + apr);
        }
        System.out.printf("The value of your bank account at 6 months is: %.2f \n", value); //prints bank account value from savings and apr after 6 months

    }

}
