package com.durgaprasadmamidi;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        GuiExample guiExample = new GuiExample();
        guiExample.setVisible(true);
        guiExample.setSize(300,300);
        guiExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
