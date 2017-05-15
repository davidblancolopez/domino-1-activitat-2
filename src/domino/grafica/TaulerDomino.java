
package domino.grafica;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayDeque;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class TaulerDomino extends javax.swing.JFrame {

    private JPanel pCard, pNord, pEst, pSud, pOest;
    public ArrayDeque<JButton> fitxesJug1;
    //Menus
    private JMenuBar barraOpcions;
    private JMenu menu;
    private JMenuItem item1, item2;
    private JButton fitxa1_1, fitxa1_2, fitxa1_3, fitxa1_4, fitxa1_5, fitxa1_6, fitxa1_7;
    
    
    
    
    
    public TaulerDomino(){
        Configuracio();
    }

    
    /**
     * Metode que crea i afegeix els menus al joc.
     */
    private void afegirMenu(){
        //Inicialización de menu.
        barraOpcions = new JMenuBar();
        menu = new JMenu("Arxiu");
        barraOpcions.add(menu);
        
        item1 = new JMenuItem("Instruccions");
        item2 = new JMenuItem("Sortir");
        menu.add(item1);
        menu.add(item2);
        
        setJMenuBar(barraOpcions);
    }
    
    /**
     * Metode de configuració on es determina el tamany del tauler, la distribució, etc.
     */
    private void Configuracio() {
        this.setPreferredSize(new Dimension(800, 800));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        
        afegirMenu();
        
        pNord = new JPanel();
        pOest = new JPanel();
        pEst = new JPanel();
        pSud = new JPanel();
        
        
        this.add(pNord, BorderLayout.NORTH);
        this.add(pEst, BorderLayout.EAST);
        this.add(pOest, BorderLayout.WEST);
        this.add(pSud, BorderLayout.SOUTH);
        
        
        pOest.setLayout(new GridLayout(1, 7));
        
        pOest.setPreferredSize(new Dimension(100, 100));
        pEst.setPreferredSize(new Dimension(100, 100));
        pNord.setPreferredSize(new Dimension(100, 100));
        pSud.setPreferredSize(new Dimension(100, 100));

        fitxa1_1=new JButton();
        ImageIcon Img = new ImageIcon("/assets/Fitxa0-0.png"); 
        fitxa1_1.setIcon(Img);
        fitxa1_1.setPreferredSize(new Dimension(50,50));
        pOest.add(fitxa1_1);

        
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
    
    public void actionPerformed(ActionEvent e) {
        ((CardLayout) pCard.getLayout()).show(pCard, e.getActionCommand());
    }
}
