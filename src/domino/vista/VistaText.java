
package domino.vista;

import domino.model.Fitxa;
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
        
        for (Fitxa f : joc.getFitxesJugades()){
            f.getValors()[];
        }
        
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
     * Metode per a demanar la posició de la fitza que el jugador posara.
     * @return 
     */
    public int demanarFitxaJugador(){
        int fitxa = 0;
        System.out.println("");
        return fitxa;
    }
    
    /**
     * Metode per a mostrar un menu de joc per a que el jugador del torn actual
     * decideixi quina jugada vol fer.
     */
    public int menu(){
        int opcio;
        System.out.println("TRIAR JUGADA: \n"
                + "1. Col·locar 1 fitxa. \n"
                + "2. Col·locar 2 dobles \n"
                + "3. Passar.\n");
        return opcio = lector.nextInt();
    }
    
    /**
     * MEtode per a demaa el numero de jugadors.
     */
    public int demanarNumeroJugadors(){
        int numJugadors;
        System.out.println("Introdueix el numero de jugadors: ");
        return numJugadors = lector.nextInt();
    }
    
    

    
    public void demanarNomJugadors(){
        
    }
}
