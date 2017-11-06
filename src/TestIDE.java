/*
    Slumpmässiga tal
    David Persson
    2017-11-06
 */

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class TestIDE{
    public static void main(String[]args){
        int abc = (int) (Math.random() * 100);

        int tal = Integer.parseInt(JOptionPane.showInputDialog
                (null, "Gissa ett tal mellan 1-100"));
        if (tal == abc)
            JOptionPane.showMessageDialog(null, "Du gissade rätt!");
        else if (tal > abc)
            JOptionPane.showMessageDialog(null, "FEL! DU gissade för för mycket");
        else if (tal < abc)
            JOptionPane.showMessageDialog(null, "FEL! DU gissade för lite");




    }
}
