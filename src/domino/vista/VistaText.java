
package domino.vista;

import domino.model.Fitxa;
import domino.model.Joc;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class VistaText {

    
    private Scanner lector = new Scanner(System.in);

    
    

    
    /**
     * Metode per a imprimir les dades del torn actual, numero del torn i nom del jugador.
     * @param torn
     * @param nom 
     */
    public void imprimirDadesTorn(int torn, String nom){
        
        System.out.println("TORN " + torn + ": " + nom);
            
    }
    
    
    
    /**
     * Metode per a imprimir les fitxes que s'han jugat fins ara.
     * @param fitxes 
     */
    public void imprimirFitxesJugades(Deque<Fitxa> fitxesJugades){
        
        StringBuilder tauler= new StringBuilder();
        tauler.append("-");
        for(Fitxa fitxa: fitxesJugades){
                tauler.append(fitxa.getValors()[0]);
                tauler.append(":");
                tauler.append(fitxa.getValors()[1]);
                tauler.append("-");
        }
        System.out.println(tauler);
        
    }
    
    
    
    
    
    /**
     * Metode per a imprimir les fitxes que encara té el jugador per a posar.
     * @param fitxes 
     */
    public void imprimirFitxesJugador(List<Fitxa> fitxes){
        
        for (int i = 0; i < fitxes.size(); i++) {
            System.out.print(" " + fitxes.get(i).valors[0] + ":" + fitxes.get(i).valors[1] + " ");
        }
        
    }
    
    
    
    
    /**
     * Metode per a demanar la posició de la fitxa que el jugador posara.
     * @param fitxa
     * @return 
     */
    public int demanarFitxaJugador(List<Fitxa> fitxa){
        int posicio;
        
        do{
        System.out.println("Quina fitxa vols posar? (Introdueix la posició en que es troba)");
        posicio = lector.nextInt();
        }while(comprovarFitxaIntroduida(posicio, fitxa.size()));
        
        return posicio - 1;
    }
    
    
    
    
    
    
    
    /**
     * Metode que comprova que la fitxa introduida per el jugador es correcte.
     * @param fitxa
     * @param longitudFitxesJugador
     * @return 
     */
    public boolean comprovarFitxaIntroduida(int fitxa, int longitudFitxesJugador){
        boolean comprovar;
        
        if (fitxa > 0 && longitudFitxesJugador >= 7) {
            comprovar = false;
        }
        
        comprovar = true;
        
        return comprovar;
    }
    
    
    
    
    
    
    
    /**
     * MEtode per a demaar el costat on es posara la fitxa, seogns el costat serà 
     * true o false.
     * @return 
     */
    public boolean demanarCostat(){
        String posicio;
        boolean costat = false;
        do{
            
        System.out.println("A quin costat vols posar la fitxa? 'E' esquerra 'D' dreta");
        posicio = lector.next();
        
        }while(comprovarCostat(posicio));
        
        if (posicio.equals("e") || posicio.equals("E")) {
            costat = true;
        }else if(posicio.equals("D") || posicio.equals("d")){
            costat = false;
        }
        return costat;
    }
    
    
    
    
    
    
    
    
    /**
     * MEtode per a comprovar que el costat introduit es correcte.
     * @param opcio
     * @return 
     */
    public boolean comprovarCostat (String opcio){
        boolean comprovar;
        
        if (opcio.equals("e") || opcio.equals("E") || opcio.equals("D") || opcio.equals("d")) {
            comprovar = false;
        }
        
        comprovar = true;
        
        return comprovar;
    }
    
    
    
    
    
    
    /**
     * Metode per a mostrar un menu de joc per a que el jugador del torn actual
     * decideixi quina jugada vol fer.
     */
    public int menu(){
        int opcio;
        
        do{
        System.out.println("TRIAR JUGADA: \n"
                + "1. Col·locar 1 fitxa. \n"
                + "2. Col·locar 2 dobles \n"
                + "3. Passar.\n");
        }while(comprovarMenu(lector.nextInt()));
        
        return opcio = lector.nextInt();
    }
    
    
    
    
    
    
    /**
     * Metode per a comprovar que la opcio introduida al menu es correcte.
     * @param opcio
     * @return 
     */
    public boolean comprovarMenu(int opcio){
        boolean comprovar;
        
        if (opcio > 0 && opcio < 4) {
            comprovar = false;
        }
        
        comprovar = true;
        
        return comprovar;
    }
    
    
    
    
    
    
    /**
     * Metode per a demanar el nom dels jugadors.
     * @return 
     */
    public String demanarNomJugador(){
        String nom;
        System.out.println("Introdueix nom del jugador: ");
        nom = lector.next();
        return nom;
    }
    
    
    
    
}
