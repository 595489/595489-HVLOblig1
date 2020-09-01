package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class incomeTax
{
    private static double findTax(double income)
    {
        if (income >= 164101 && income <= 230950)
        {
            return 0.93;
        }
        else if (income >= 230951 && income <= 580650)
        {
            return 2.41;
        }
        else if (income >= 580651 && income <= 934050)
        {
            return 11.52;
        }
        else if (income >= 934051)
        {
            return 14.52;
        }
        else
        {
            return 0;
        }
    }

    public static double incomeTax(double income, double tax)
    {
        if(tax == 0)
        {
            return 0;
        }
        else if(tax == 0.93)
        {
            return income * 0.0093;
        }
        else if(tax == 2.41)
        {
            return income * 0.0241;
        }
        else if(tax == 11.52)
        {
            return income * 0.1152;
        }
        else
        {
            return income * 0.1452;
        }
    }

    public static void main(String[] args)
    {
        String input = showInputDialog("Skriv inntekt: ");
        double a = Double.parseDouble(input);

        double tax = findTax(a);

        showMessageDialog(null, "Income: " + a + '\n' + "Percentage: "
                + tax + "%" + '\n' + "Tax: " + incomeTax(a, tax) + '\n'
                + "Income after tax: " + (a-incomeTax(a, tax)));
    }
}
