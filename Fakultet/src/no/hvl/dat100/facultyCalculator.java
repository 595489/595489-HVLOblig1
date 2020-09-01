package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class facultyCalculator {
    public static int faculty(int a){
        int b = a - 1;
        while (b > 0){
            a = a * b;
            b = b - 1;
        }
        return a;
    }

    public static void main(String[] args){
        String input = showInputDialog("Skriv en integer:     Press 0 to stop");
        int in = Integer.parseInt(input);

        if (in != 0){
            showMessageDialog(null, faculty(in));
            main(null);
        }
    }
}
