package com.hillel.strategy.sorted;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainForm extends JFrame {

    int[] array;
    public MainForm(int[] array) {
        this.array = array;
    }



    private JTextArea textArea;
    private JButton button;



    public MainForm() {


        super("Sorting ARRAY");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screen = toolkit.getScreenSize();
        int x = screen.width;
        int y = screen.height;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize((int)Math.round(x * 0.8), (int)Math.round(y * 0.8));
        setLocationRelativeTo(null);
        setVisible(true);

        LayoutManager layoutManager = new BorderLayout(5, 5);
        setLayout(layoutManager);

        textArea = new JTextArea();
        button = new JButton("Sotring");

        Dimension textAreaSize = textArea.getPreferredSize();
        Dimension buttonSize = button.getPreferredSize();
       // System.out.println(textAreaSize.width + ":" + textAreaSize.height);

        textAreaSize.width = 300;
        textAreaSize.height = 100;
       // buttonSize.width = 300;
        buttonSize.height = 50;
        textArea.setPreferredSize(textAreaSize);
        button.setPreferredSize(buttonSize);

        add (button, BorderLayout.PAGE_START);
        add (textArea, BorderLayout.PAGE_END);



        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {



                Sorting sorting = new Sorting(new InsertionSort());

                String str = String.valueOf(sorting);
                //textArea.append(String.valueOf(sorting));
                textArea.append(str);

                //String str = textArea.getName();
                //JOptionPane.showMessageDialog(null, str);
            }
        });
    }

}
