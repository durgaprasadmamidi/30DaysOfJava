package com.durgaprasadmamidi;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiExample extends JFrame{
    JLabel item;
    public GuiExample(){
        super("hello");
        setLayout(new FlowLayout());
        item = new JLabel("this is the first JFrame example");
        item.setToolTipText("hovering over text");
        add(item);
    }
}
