
package domino.control;

import domino.model.Fitxa;
import domino.model.Joc;
import domino.model.Torn;
import domino.model.Jugador;
import domino.vista.VistaText;
import java.util.List;


public class ControlText {
    private Joc joc;
    private VistaText vText;
    private Torn torn;
    private Jugador jugador;
    public  String noms[] = new String [joc.NUMJUGADORS];//VARIABLE posada
    private Fitxa fitxa;
    
    
    public ControlText(){
        this.joc = new Joc(4,28,7);
        this.vText = new VistaText();
        this.torn = new Torn(joc);//

    }
    
    
    
    /**
     * Començar joc
     */
    public void començarJoc(){
        recollirNomJugadors();
        joc.iniciar(noms);
    }
    
    
    
    
    
    
    
    
    
    /**
     * Metode per a recollir el nom de tots els jugadors.
     */
    public void recollirNomJugadors(){
        for (int i = 0; i < joc.NUMJUGADORS; i++) {
            noms[i] = vText.demanarNomJugador();
        }
    }
    
    
    


    
    
    /**
     * Metode de resposta del menú de jugada.
     */
    public void respostaMenuJugada(){
        int opcio = 0;
        opcio = vText.menu();
        
        switch(opcio){
            case 1:
                posar1Fitxa();
                break;
            case 2:
                posar2Dobles();
                break;
            case 3:
                torn.passar();
                break;
        }
    }
    

    
    
    /**
     * Metode per jugada de 1 fitza.
     */
    public void posar1Fitxa(){
        Fitxa f;
        int f1 = vText.demanarFitxaJugador (jugador.getFitxes());
        f = jugador.fitxes.get(f1);
        boolean extrem = vText.demanarCostat();
        torn.colocarUnaFitxa(f, extrem);
    }
    
    
    
    
    
    
    
    /**
     * Metode per a posar 2 dobles.
     */
    public void posar2Dobles(){
        //torn.colocarDosDobles(d1, extrem, d2, extrem);
    }
    
    
}
