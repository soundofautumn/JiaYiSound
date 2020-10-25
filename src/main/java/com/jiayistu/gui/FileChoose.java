package com.jiayistu.gui;

import javax.swing.*;

public class FileChoose extends JDialog {
    private JPanel contentPane;

    public FileChoose() {
        setContentPane(contentPane);
        setModal(true);
    }

    public static void main(String[] args) {
        FileChoose dialog = new FileChoose();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
