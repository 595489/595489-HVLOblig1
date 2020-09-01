package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class gradeCalculator {
    public static int getGrade(){
        String input = showInputDialog("Skriv inn karakter: ");
        return Integer.parseInt(input);
    }

    public static void main(String[] args){
        String antallKarakterer = showInputDialog("Hvor mange karakterer skal sjekkes? ");
        int amount = Integer.parseInt(antallKarakterer);

        for (int i = 0; i<amount; i++){
            int a = getGrade();
            if (a < 0 || a > 100){
                showMessageDialog(null, "Ugyldig karakter");
                i = i - 1;
            }
            else if (a<40){
                System.out.println("F");
            }
            else if (a<50){
                System.out.println("E");
            }
            else if (a<60){
                System.out.println("D");
            }
            else if (a<80){
                System.out.println("C");
            }
            else if (a<90){
                System.out.println("B");
            }
            else {
                System.out.println("A");
            }
        }
    }
}
