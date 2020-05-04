package com.durgaprasadmamidi;

import javax.swing.JOptionPane;

public class FirstGui {

    public static void main(String[] args) {

        String firstName = JOptionPane.showInputDialog("enter your first name");
        String lastName = JOptionPane.showInputDialog("enter your last name");

        JOptionPane.showMessageDialog(null,firstName+" "+lastName,"greetings",JOptionPane.PLAIN_MESSAGE);
    }

}
