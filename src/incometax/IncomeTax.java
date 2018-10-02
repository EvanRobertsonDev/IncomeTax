/*
 * Evan Robertson
 * October 2nd
 * Calculates income tax owed and how much money remains after
 */

package incometax;

import java.util.Scanner;

import java.text.*;

/**
 *
 * @author evrob0095
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variables
        Scanner keyedInput = new Scanner(System.in);
        DecimalFormat x = new DecimalFormat("$#,###,###.00");
        double salary;
        double taxTaken;
        double profit;
        
        //Constants
        final double TAX_BRACKET_1 = 0.15;
        final double TAX_BRACKET_2 = 0.205;
        final double TAX_BRACKET_3 = 0.26;
        final double TAX_BRACKET_4 = 0.29;
        final double TAX_BRACKET_5 = 0.33;
        
        
        
        //Input
        System.out.println("Enter your salary");
        salary = keyedInput.nextInt();
        
        //If statements to determine income tax
        if (salary <= 46605){
            taxTaken = TAX_BRACKET_1*salary;
        }
        
        else if (salary > 46605 && salary <= 93208) {
            taxTaken = ((salary - 46605)*TAX_BRACKET_2)+6991;
        }
        
        else if (salary > 93208 && salary <= 144489) {
            taxTaken = ((salary - 93208)*TAX_BRACKET_3)+16544;
        }
        
        else if (salary > 144489 && salary <= 205842) {
            taxTaken = ((salary - 144489)*TAX_BRACKET_4)+28877;
        }
        
        else {
            taxTaken = ((salary - 205842)*TAX_BRACKET_5)+47670;
        }
        
        profit = salary-taxTaken;
        
        //Execution
        System.out.println("Your income tax is " + x.format(taxTaken));
        System.out.println("Your income after tax is " + x.format(profit));
        
        
        
        
        
    }
    
}
