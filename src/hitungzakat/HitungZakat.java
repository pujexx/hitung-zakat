/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungzakat;

import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import sun.applet.Main;

/**
 *
 * @author poedjex
 */
public class HitungZakat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
            // TODO code application logic here
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            SwingUtilities.invokeLater(new Runnable() {

                @Override
                public void run() {
                  FormUtama bikin = new FormUtama();
                    bikin.setLocationRelativeTo(null);
                    bikin.setVisible(true);
                }
            });
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
