
package domino.grafica;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.util.ArrayDeque;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TaulerDomino extends javax.swing.JFrame {

    private JPanel pCard, pNord, pEst, pSud, pOest;
    public ArrayDeque<JButton> fitxesJug1;
    private JButton fitxa1_1, fitxa1_2, fitxa1_3, fitxa1_4, fitxa1_5, fitxa1_6, fitxa1_7;
    
    public TaulerDomino(){
        Configuracio();
    }
    

    
    private void Configuracio() {
        this.setPreferredSize(new Dimension(800, 800));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        pNord = new JPanel();
        pOest = new JPanel();
        pEst = new JPanel();
        pSud = new JPanel();
        
        
        this.add(pNord, BorderLayout.NORTH);
        this.add(pEst, BorderLayout.EAST);
        this.add(pOest, BorderLayout.WEST);
        this.add(pSud, BorderLayout.SOUTH);

        
        ImageIcon imatge = new ImageIcon("C:\\Users\\ALUMNEDAM\\Documents\\NetBeansProjects\\DOMINO-1-activitat-2 David Blanco\\domino-1-activitat-2\\Assets\\fitxa0-0.png");
        fitxa1_1.setIcon(imatge);
        
        ImageIcon imatge2 = new ImageIcon("C:\\Users\\ALUMNEDAM\\Documents\\NetBeansProjects\\DOMINO-1-activitat-2 David Blanco\\domino-1-activitat-2\\Assets\\fitxa0-1.png");
        fitxa1_2.setIcon(imatge2);
        
        ImageIcon imatge3 = new ImageIcon("C:\\Users\\ALUMNEDAM\\Documents\\NetBeansProjects\\DOMINO-1-activitat-2 David Blanco\\domino-1-activitat-2\\Assets\\fitxa0-2.png");
        fitxa1_2.setIcon(imatge3);
        
        pNord.setBackground(Color.red);
        pSud.setBackground(Color.GREEN);
        pOest.setBackground(Color.BLUE);
        pEst.setBackground(Color.YELLOW);
        
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
