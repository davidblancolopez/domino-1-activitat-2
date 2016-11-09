
package domino.control;

import domino.model.Fitxa;
import domino.model.Joc;
import domino.model.Torn;
import domino.model.Jugador;
import domino.vista.VistaText;


public class ControlText {
    private Joc joc;
    private VistaText vText;
    private Torn torn;
    private Jugador jugador;
    
    
    public ControlText(){
        this.joc = new Joc(4,28,7);
        this.vText = new VistaText();
        this.torn = new Torn(joc);//
    }
        
    public String recollirNom(){
        String nom;
        nom = vText.demanarNomJugador();
        return nom;
    }    
    
    public void respostaMenu(){
        int opcio = 0;
        opcio = vText.menu();
        
        switch(opcio){
            case 1:
                vText.demanarFitxaJugador();
                torn.colocarUnaFitxa(Fitxa f, boolean extrem);
                break;
            case 2:
                     
                torn.colocarDosDobles(d1, extrem, d2, extrem);
                break;
            case 3:
                torn.passar();
                break;
        }
    }
    
    
    public void crearJugadors(){
        
        for (int i = 0; i < joc.NUMJUGADORS; i++) {
            Jugador jugador = new Jugador(vText.demanarNomJugador(), ); 
        }
    }
    
}
