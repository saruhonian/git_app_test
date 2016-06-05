package com.hillel.strategy.sorted;

import javax.swing.*;
import java.awt.*;

public class GridForm extends JPanel{
    private JButton button1;
    public GridForm() {
        Dimension dimension = new Dimension();
        dimension.width = 100;
        dimension.height = 100;


        LayoutManager layoutManager = new GridBagLayout();
        setLayout(layoutManager);

        GridBagConstraints gc = new GridBagConstraints();

        JButton button1 = new JButton("Sorting");
        button1.setPreferredSize(dimension);

        gc.gridx = 0;
        gc.gridy = 0;

        add(button1, gc);
    }
}
