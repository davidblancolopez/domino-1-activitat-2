
package domino.grafica;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TaulerDomino extends javax.swing.JFrame {

    private JPanel pCard, pNord, pEst;
    
    
    public TaulerDomino(){
        
    }
    
    private void initComponent(){
        
        JLabel jLabel2 = new javax.swing.JLabel();
        
        
        
        
        
        

        
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUMNEDAM\\Documents\\NetBeansProjects\\DOMINO-1-activitat-2 David Blanco\\domino-1-activitat-2\\Assets\\Fondo.png"));
    }
    
    
    private void Configuracio() {
        this.setPreferredSize(new Dimension(400, 400));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        pNord = new JPanel();
        pEst = new JPanel();
        pEst = new JPanel();
        

        pCard = new JPanel(new CardLayout());

        this.add(pCard, BorderLayout.CENTER);

        this.pack();
        this.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TaulerDomino().setVisible(true);
            }
        });
    }
}
