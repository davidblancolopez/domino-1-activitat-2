
package domino.control;

import domino.model.Fitxa;
import domino.model.Joc;
import domino.model.Torn;
import domino.vista.VistaText;


public class ControlText {
    private Joc joc;
    private VistaText vText;
    private Torn torn;
    
    public ControlText(){
        this.joc = new Joc(4,28,7);
        this.vText = new VistaText();
        this.torn = new Torn(joc);
    }
        
    public void recollirNoms(){
        vText.demanarNumeroJugadors();
        
    }    
    
    public void respostaMenu(){
        int opcio = 0;
        opcio = vText.menu();
        
        switch(opcio){
            case 1:
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
}
