package com.jiayistu.gui;

import javax.swing.*;
import java.awt.event.*;

/**
 * @author SoundOfAutumn
 * @date 2020/10/24 23:10
 */
public class Login extends JDialog {
    private JPanel contentPane;
    private JButton buttonSubmit;
    private JButton buttonCancel;
    private JPasswordField passwordField;
    private JTextField uerNameTextField;

    public Login() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonSubmit);

        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onSubmit();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onSubmit() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        Login dialog = new Login();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
