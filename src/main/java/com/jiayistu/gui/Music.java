package com.jiayistu.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author SoundOfAutumn
 * @date 2020/10/24 23:10
 */
public class Music {
    private JPanel mainPanel;
    private JLabel musicName;
    private JTextField musicNameTextField;
    private JLabel musicSinger;
    private JLabel introduction;
    private JTextField musicSingerTestField;
    private JTextArea introductionTextArea;
    private JButton submitButton;
    private JButton loginButton;
    private JButton fileChooserButton;

    public Music() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login login = new Login();
                login.pack();
                login.setLocationRelativeTo(null);
                login.setVisible(true);
            }
        });
        fileChooserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileChoose fileChoose = new FileChoose();
                fileChoose.pack();
                fileChoose.setLocationRelativeTo(null);
                fileChoose.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("嘉懿之声点歌台");
        frame.setContentPane(new Music().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(350,-1));
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
