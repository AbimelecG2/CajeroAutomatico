/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajeroautomatico;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class CajeroAutomatico {

    public static void main(String[] args) {
    
        Scanner entrada= new Scanner (System.in);
    int dineroSolicitado=0;
        final int BILLETES[]= {500,200,100,50,20,10,5,2,1};
        int billetesEntregados[] = new int[BILLETES.length];
        int billetesRecargados[] = new int[BILLETES.length];
        int contadorDeRecarga=0;
        int contadorDeRetiros=0;
        int dineroEntregado=0,dineroRestante=0;
        int limiteDeDinero=20000;
        int opcion=0; 
        int dineroQueSeVaRecargar; 
       
      do{     
        System.out.println("\nCAJERO AUTOMATICO MAGG");
        System.out.println("-----MENU-----");
        System.out.println("1. Recargar Cajero");
        System.out.println("2. Retirar Dinero");
        System.out.println("3. Historial de transacciones");
        System.out.println("4. Salir");
        
         System.out.print("Ingrese el numero de la opcion a elegir: ");
        opcion= entrada.nextInt();
     
        switch (opcion){
            case 1:
       System.out.println("\nIngrese la cantidad de dinero que va a recargar: ");
        dineroQueSeVaRecargar=entrada.nextInt();
                
                dineroRestante=dineroQueSeVaRecargar;
;
                
        for(int x=0;x<BILLETES.length;x++){
            if(dineroRestante>=BILLETES[x]){
                billetesRecargados[x]= dineroRestante/BILLETES[x];  //Conocer cuantos billetes entrego de esta denominacion
                dineroEntregado=billetesRecargados[x]*BILLETES[x];  //Dinero entregando con estos billetes
                dineroRestante-=dineroEntregado;                    //Restar esa cifra para saber cuanto me falta pagar
                contadorDeRecarga++;
            }else{
                billetesRecargados[x]=0;
            }
            //contadorRecarga++;
            
            System.out.println("Billetes de "+BILLETES[x]+" entregados: " + billetesRecargados[x] + " DINERO Recargado: " + dineroQueSeVaRecargar + " DINERO Restante: " + dineroRestante);
            dineroEntregado=0;
        }
        break;
        
      
        
            case 2:
                System.out.println("\nLa cantidad limite de retiro diario no debe exceder a 20,000");
                System.out.println("Ingrese la cantidad que desea retirar: ");
             dineroSolicitado=entrada.nextInt(); 
             if(dineroSolicitado<=limiteDeDinero){
             
             dineroRestante=dineroSolicitado;
                contadorDeRetiros++;

        for(int x=0;x<BILLETES.length;x++){
            if(dineroRestante>=BILLETES[x]){
                billetesEntregados[x]= dineroRestante/BILLETES[x];  //Conocer cuantos billetes entrego de esta denominacion
                dineroEntregado=billetesEntregados[x]*BILLETES[x];  //Dinero entregando con estos billetes
                dineroRestante-=dineroEntregado;                    //Restar esa cifra para saber cuanto me falta pagar
            }else{
                billetesEntregados[x]=0;
            }
            System.out.println("Billetes de "+BILLETES[x]+" entregados: " + billetesEntregados[x] + " DINERO Entregado: " + dineroEntregado + " DINERO Restante: " + dineroRestante);
            dineroEntregado=0;
              }
             }
             else{
              System.out.println("\nMonto diario de retiro EXCEDIDO. Ingrese una cantidad menor a 20,000");

             }
        break;
        
            case 3:
                
                System.out.println("\nHa recargado el cajero: " + contadorDeRecarga + " veces");
                System.out.println("Ha retirado del cajero: " + contadorDeRetiros + " veces");

                
        
            case 4:
                System.out.println("\nGRACIAS POR USAR EL SERVICIO DEL CAJERO AUTOMATICO MAGG");
                System.out.println("--------TENGA UN FELIZ DIA--------");
}
        
        }
        
      while(opcion!=4);

        
}
}
