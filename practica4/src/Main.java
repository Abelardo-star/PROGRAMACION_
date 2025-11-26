import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //LISTAS
    static ArrayList<Hospital> hospitales = new ArrayList<>();
    static ArrayList<Areas> areas = new ArrayList<>();
    static ArrayList<Medico> medicos = new ArrayList<>();
    static ArrayList<Contrato> contratos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cargarDatosIniciales();
        ejecutarMenuPrincipal();
    }

    // CARGA DE DATOS

    public static void cargarDatosIniciales() {

        Direccion d1 = new Direccion("Atocha", 1, 28001, "Madrid", "Madrid");
        Hospital h1 = new Hospital("Hospital Central", "H001", d1);

        Direccion d2 = new Direccion("Gran Via", 10, 28013, "Madrid", "Madrid");
        Hospital h2 = new Hospital("Hospital Norte", "H002", d2);

        hospitales.add(h1);
        hospitales.add(h2);

        Areas a1 = new Areas("Cardiologia", "A1", 2, h1);
        Areas a2 = new Areas("Pediatria", "A2", 1, h1);
        Areas a3 = new Areas("Urgencias", "A3", 0, h2);

        h1.agregarAreas(a1);
        h1.agregarAreas(a2);
        h2.agregarAreas(a3);

        areas.add(a1);
        areas.add(a2);
        areas.add(a3);

        Medico m1 = new Medico("Ana", a1, "20502084E",20,"Mujer", 20-2-2000,3000.12);
        Medico m2 = new Medico("Jose", a2, "20602084D",25,"Hombre", 23-2-1995,2000.12);
        Medico m3 = new Medico("Marta", a3, "20305040A",23,"Mujer", 20-2-1999,1000.12);

        medicos.add(m1);
        medicos.add(m2);
        medicos.add(m3);

        Contrato c1 = new Contrato(2000, m3, h1 );
        Contrato c2 = new Contrato(1996,m2,h1);
        Contrato c3 = new Contrato(2002,m1,h2);

        contratos.add(c1);
        contratos.add(c2);
        contratos.add(c3);
    }

    // MENÚ

    public static void ejecutarMenuPrincipal() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Calcular antigüedad");
            System.out.println("2. Calcular sueldo neto");
            System.out.println("3. Comprobar mayoría de edad");
            System.out.println("4. Proporción de médicos en área");
            System.out.println("5. Capacidad de área");
            System.out.println("6. Comparar áreas");
            System.out.println("7. Contratos por año");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {

                case 1 -> calcularAntiguedad();
                case 2 -> calcularSueldo();
                case 3 -> comprobarEdad();
                case 4 -> proporcion();
                case 5 -> capacidadArea();
                case 6 -> compararAreas();
                case 7 -> contratosPorAnio();
                case 0 -> System.out.println("Adiós");
                default -> System.out.println("Opción incorrecta");
            }

        } while(opcion != 0);
    }

    // MÉTODOS DEL MENÚ

    static void calcularAntiguedad() {
        Scanner sc = new Scanner(System.in);
        System.out.print("DNI: ");
        String dni = sc.nextLine();
        Medico m = buscarMedico(dni);

        if(m != null)
            System.out.println("Antigüedad: " + m.getAniosAntiguedad());
        else
            System.out.println("No existe");
    }

    static void calcularSueldo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("DNI: ");
        String dni = sc.nextLine();
        System.out.print("Retención (%): ");
        double r = sc.nextDouble();
        Medico m = buscarMedico(dni);

        if(m != null)
            System.out.println("Sueldo neto: " + m.calcularSueldoNeto(r));
        else
            System.out.println("No existe");
    }

    static void comprobarEdad() {
        Scanner sc = new Scanner(System.in);
        System.out.print("DNI: ");
        String dni = sc.nextLine();
        System.out.print("Edad mínima: ");
        int edad = sc.nextInt();
        Medico m = buscarMedico(dni);

        if(m != null)
            System.out.println(m.esMayorEdad(edad));
    }

    static void proporcion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre hospital: ");
        String nombre = sc.nextLine();
        Hospital h = buscarHospital(nombre);

        System.out.print("ID área: ");
        String id = sc.nextLine();

        System.out.println("Proporción: " + h.getProporcionMedicosArea(id));
    }

    static void capacidadArea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID Área: ");
        String id = sc.nextLine();
        System.out.print("Capacidad máxima: ");
        int max = sc.nextInt();

        Areas a = buscarArea(id);
        System.out.println("Huecos: " + a.calcularCapacidadRestante(max));
    }

    static void compararAreas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primer ID: ");
        String id1 = sc.nextLine();
        System.out.print("Segundo ID: ");
        String id2 = sc.nextLine();

        Areas a1 = buscarArea(id1);
        Areas a2 = buscarArea(id2);

        System.out.println(a1.compararMedicos(a2));
    }

    static void contratosPorAnio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Año: ");
        int anio = sc.nextInt();

        for(Contrato c : contratos) {
            if(c.esDeAnio(anio))
                System.out.println(c.getMedico().getNombre());
        }
    }

    // BÚSQUEDAS

    static Medico buscarMedico(String dni) {
        for(Medico m : medicos)
            if(m.getDNI().equals(dni))
                return m;
        return null;
    }

    static Areas buscarArea(String id) {
        for(Areas a : areas)
            if(a.getIdentificador().equals(id))
                return a;
        return null;
    }

    static Hospital buscarHospital(String nombre) {
        for(Hospital h : hospitales)
            if(h.getNombre().equalsIgnoreCase(nombre))
                return h;
        return null;
    }
}