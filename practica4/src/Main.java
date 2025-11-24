import java.io.SyncFailedException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Hospital> hospitals= new ArrayList<Hospital>();
        //PRECARGA DE DATOS

        //HOSPITALES
        Hospital h1 = new Hospital("Hospital Central","H001");
        Hospital h2 = new Hospital("Hospital del Sur","H002");

        //AREAS
        Areas a1 = new Areas("Cardiologia","CAR1",2, h1);
        Areas a2 = new Areas("Pediatria","CAR2", 1, h1);
        Areas a3 = new Areas("Urgencias","CAR3", 0, h2);

        h1.agregarAreas(a1);
        h1.agregarAreas(a2);
        h2.agregarAreas(a3);

        Medico m1= new Medico("Jose", a1,"20502084E",18,"Hombre", 25-9-2007,3002.2);
        a1.aumentarMedicos();

        System.out.println(a1.getNumMedicos());

        Areas a = h1.getAreas().get(0);
        System.out.println(a.getNombre());



    }
}