import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        // Listas para almacenar los objetos
        ArrayList<Hospital> hospitales = new ArrayList<>();
        ArrayList<Areas> areas = new ArrayList<>();
        ArrayList<Medico> medico = new ArrayList<>();
        ArrayList<Contrato> contratos = new ArrayList<>();


        //HOSPITALES
        Direccion dir1 = new Direccion("Atocha", 123, 28080, "Madrid", "Madrid");
        Hospital h1 = new Hospital("Hospital Central","H001",dir1);
        Direccion dir2 = new Direccion("Gran Via", 653, 28090, "Madrid", "Madrid");
        Hospital h2 = new Hospital("Hospital del Sur","H002", dir2);
        Direccion dir3 = new Direccion("Callao", 3612, 28078, "Madrid", "Madrid");
        Hospital h3 = new Hospital("Hospital del Norte","H003", dir3);
        hospitales.add(h1);
        hospitales.add(h2);
        hospitales.add(h3);


        //AREAS
        Areas a1 = new Areas("Cardiologia","CAR1",2, h1);
        Areas a2 = new Areas("Pediatria","CAR2", 1, h2);
        Areas a3 = new Areas("Urgencias","CAR3", 0, h3);

        h1.agregarAreas(a1);
        h2.agregarAreas(a2);
        h3.agregarAreas(a3);
        areas.add(a1);
        areas.add(a2);
        areas.add(a3);

        //MEDICO
        // Constructor: (dni, nombre, edad, sexo, sueldo, dia, mes, año, area)
        Medico m1= new Medico("Jose", a1,"20502084E",18,"Hombre", 25-9-2007,3002.2);
        a1.aumentarMedicos();
        Medico m2 = new Medico("Raquel",a1,"20607431I",18, "Mujer", 24-8-2007,2000.45);
        a1.aumentarMedicos();

        // CONTRATO
        Contrato c1 = new Contrato(20-7-2000,m1,h1);
        Contrato c2 = new Contrato(20-7-2007,m1,h1);
        contratos.add(c1);
        contratos.add(c2);

        //PRUEBA
        System.out.println("Número de médicos en " + a1.getNombre() + ": " + a1.getNumMedicos());

        System.out.println("Primer área del hospital " + h1.getNombre() + ": " + h1.getAreas().get(0).getNombre());

        System.out.println("Contrato creado: " + c1.getMedico().getNombre() + " en " + c1.getHospital().getNombre());
        System.out.println("Días desde creación del contrato: " + c1.diasDesdeCreacion(24-11-2025, 10-4-2000));
    }
}