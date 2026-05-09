package patoadaptador;
public class Main {
    public static void main(String[] args) {
        PatoReal pato=new PatoReal();
        SuperDrone drone=new SuperDrone();
        Pato AdaptadorDrone= new AdaptadorDrone(drone);
        System.out.println("El drone hace...");
        drone.beep();
        drone.despegar();
        drone.girarRotor();
        
        System.out.println("El pato hace......");
        pato.cuaquear();
        pato.volar();
        
        System.out.println("El adaptador hace....");
        AdaptadorDrone.cuaquear();
        AdaptadorDrone.volar();
    }
   
    
}
