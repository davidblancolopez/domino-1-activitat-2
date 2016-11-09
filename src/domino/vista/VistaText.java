
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
        int fitxa;
        System.out.println("Quina fitxa vols posar? (Introdueix la posició en que es troba)");
        fitxa = lector.nextInt();
        return fitxa - 1;
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
            if (posicio.equals("E") || posicio.equals("e") || posicio.equals("D") || posicio.equals("d")) {
                break;
            }
        }while(true);
        
        if (posicio.equals("e") || posicio.equals("E")) {
            costat = true;
        }else if(posicio.equals("D") || posicio.equals("d")){
            costat = false;
        }
        return costat;
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
     * Metode per a demanar el numero de jugadors.
     */
    /*public int demanarNumeroJugadors(){
        int numJugadors;
        System.out.println("Introdueix el numero de jugadors: ");
        return numJugadors = lector.nextInt();
    }*/
    
    
    
    

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
