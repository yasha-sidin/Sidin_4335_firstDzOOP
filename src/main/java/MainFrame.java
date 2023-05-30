import Domen.Product;
import VendingMachines.VendingMachine;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.PriorityQueue;

import javax.swing.*;

public class MainFrame extends JFrame {


    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField idName;

    JLabel lbWelcome;

    public void initialize(VendingMachine iMachine) {


        JLabel lbIdName = new JLabel("Choose product(num): ");
        lbIdName.setFont(mainFont);

        idName = new JTextField();
        idName.setFont(mainFont);





        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(10, 1, 5, 5));
        formPanel.add(lbIdName);
        formPanel.add(idName);



        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);



        JButton btnOk = new JButton("Buy");
        btnOk.setFont(mainFont);
        btnOk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {


                String firstName = idName.getText();
                for(Product item : iMachine.getProducts()) {
                    lbWelcome.setText(item.toString());
                }



            }

        });


        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                idName.setText("");
                idName.setText("");
                lbWelcome.setText("");

            }

        });


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonPanel.add(btnOk);
        buttonPanel.add(btnClear);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(0, 150, 255));

        mainPanel.add(formPanel, BorderLayout.NORTH);


        mainPanel.add(lbWelcome, BorderLayout.CENTER);


        mainPanel.add(buttonPanel, BorderLayout.SOUTH);


        add(mainPanel);


        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        formPanel.setOpaque(false);
        buttonPanel.setOpaque(false);


        setTitle("VendingMachines");
        setSize(500, 600);
        setMaximumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

//    public static void main(String[] arg)
//    {
//        MainFrame myFrame = new MainFrame();
//        myFrame.initialize(new VendingMachine(15));
//    }

}