import java.util.ArrayList;
import java.util.Scanner; 
public class AplicacionDeCartas {
    
    public void inicia(){
       System.out.println("ingresa el numero de Jugadores"); 
       Scanner sc = new Scanner(System.in); 
       int numJ = sc.nextInt(); 
       CardShark card = new CardShark(numJ); 
       card.inicia(); 
    }
    }
    /*
    public void inicia(){
       Scanner sc = new Scanner(System.in);  
       System.out.println("ingresa el numero de Jugadores"); 
       int numJ = sc.nextInt(); 
       Baraja baraja = new Baraja(); 
       baraja.barajar(); 
       ArrayList<Jugador> jugadores;
       CardSharkExtendedforAll juego= new CardSharkExtendedforAll(numJ,baraja.mazo());
       System.out.println("Cartas de los Jugadores"); 
       jugadores = juego.jugadores(); 
       for(int v=0 ; v <= numJ-1 ; v++){
        System.out.println("Jugador "+ jugadores.get(v).getId()); 
        jugadores.get(v).obtenerCartas(baraja); 
        System.out.println(jugadores.get(v).toString());
        System.out.println("LANZAMIENTO DE DADO");
        
        //System.out.println("Jugador "+ jugadores.get(v).getId() + " estas listo para lanzar dado?");
        //String ingresa = sc.nextLine();
        //if (ingresa == "si"){ 
        jugadores.get(v).obtenerCartasPorNumeroDeDado(baraja);  
        System.out.println("Estas son tus nuevas cartas"); 
        System.out.println(jugado).toString());   
        }
        
        
c
        }
    
    
    }
/*
  public void inicia() {
    Baraja b = new Baraja();
    b.barajar();
    ArrayList<Carta> mano = b.repartir(5);
    System.out.println(mano);
    int negras=0;
    int rojas=0;
    for (Carta carta : mano) {
      if(carta.getColor() == Color.NEGRO)
        negras++;
      else
        rojas++;
    }
    System.out.println("Negras: "+negras+" Rojas: "+ rojas);
  }
 */ 

