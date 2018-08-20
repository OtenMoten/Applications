/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Boolean.TRUE;
import java.util.Date;

/**
 *
 * @author Kevin
 */
public class Main {

    //char a = a;
    char b = 'a';
    char c = 1;
    Integer g = 33;
    Date datum = null;
    boolean f = true;

    public static void main(String[] args) {

        boolean newBool = TRUE;

        System.out.println(newBool);

        String s = "maus";
        s = s.toUpperCase();
        System.out.println(s);

        int[] i = {4, 5};
        for (int erg : i) {
            System.out.println(erg);
        }

        Button myButton = new Button();

        myButton.addActionListener((ActionEvent e) -> {
        });

    }

}
