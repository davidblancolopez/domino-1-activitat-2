
package domino.control;

import domino.model.Joc;
import domino.vista.VistaText;


public class ControlText {
    private Joc joc;
    private VistaText vText;
    
    public ControlText(){
        this.joc = new Joc(4,28,7);
        this.vText = new VistaText();
    }
        
    public void recollirNoms(){
        vText.demanarNumeroJugadors();
        
    }    
    
    public void respostaMenu(){
        int opcio = 0;
        opcio = vText.menu();
    }
}
