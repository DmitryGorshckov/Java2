package ru.gorshckov;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppMain extends JFrame {

    private JTextArea jta = new JTextArea();
    private JScrollPane jsp = new JScrollPane(jta);
    private JTextField jtf = new JTextField();
    private JButton jb = new JButton("SEND");

    public static void main(String[] args) {

	    AppMain app = new AppMain();

	    app.setVisible(true);

    }




    private AppMain() throws HeadlessException {

        this.setTitle("my app");
        this.setBounds(700,200,600,700);


        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                sendMessage();

            }
        });


        jtf.addKeyListener(new KeyAdapter() {

            @Override

            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    sendMessage();
                }
            }
        });


        this.add(getJPanel());
        this.add(getJPanel("first panel"));
        add("South", getJPanel());

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


    private JPanel getJPanel(String s){

        JPanel jp = new JPanel(new GridLayout());
        jp.setBackground(Color.ORANGE);

        jp.add(jsp);

        return jp;
    }


    private JPanel getJPanel(){

        JPanel jp = new JPanel(new GridLayout());
        jp.setBackground(Color.GREEN);
        jp.add(jtf);
        jp.add(jb);

        return jp;
    }


    private void sendMessage() {

        String out = jtf.getText();

        jta.append(getTime() + out + "\n");

        jtf.setText("");

    }

    private String getTime() {

        return new SimpleDateFormat("HH:mm:ss").format(new Date());

    }
}
