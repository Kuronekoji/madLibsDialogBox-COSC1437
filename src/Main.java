import javax.swing.JOptionPane;

/**
This program utilizes the dialog boxes for displaying
madlibs questions with an input.
@author Scylla
*/

public class Main 
{

    public static void main(String[] args)
    {
        String inputString;
        int number;
        String planet;
        int number2;
        String name;
        

        // Get random number
        inputString = JOptionPane.showInputDialog("Give me some data and I will predict your future!\n" +
                                                "Enter a number: ");

        number = Integer.parseInt(inputString);

        planet = JOptionPane.showInputDialog("Enter the name of a planet: ");

        inputString = JOptionPane.showInputDialog("Enter another number: ");

        number2 = Integer.parseInt(inputString);

        name = JOptionPane.showInputDialog("Enter a funny name: ");

        JOptionPane.showMessageDialog(null, "In " + number + " years, you will " +
                                    "live on planet " + planet + ".\nOh no! " + number2
                                    + " asteroids led by the fearsome Asteroid " + name + 
                                    " destroy planet " + planet + ". Sorry for the bad news!");
    }
    
}
