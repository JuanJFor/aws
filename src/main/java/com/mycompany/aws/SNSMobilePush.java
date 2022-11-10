package com.mycompany.aws;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SNSMobilePush {

    public static void main(String[] args) throws IOException {
        try {
            Notificaciones not = new Notificaciones();

            not.pack();
            not.setLocationRelativeTo(null);
            not.setVisible(true);

            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SNSMobilePush.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
