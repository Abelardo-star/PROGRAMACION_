public class Main {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("Ana", "Gil", 28001, "Calle Damasco", "ana@mail.com", "1234");
        Usuario u2 = new Usuario("Luis", "Martinez", 27101, "Calle Tribal", "luis@mail.com", "3525");
        Usuario u3 = new Usuario("Marta", "Torres", 28571, "Calle Madrid", "marta@mail.com", "74848");

        Usuario[] usuario = {u1, u2, u3};


        for (int i = 0; i < usuario.length; i++) {
            System.out.println(usuario[i].toString());
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.");
        }
        //Validad codigos postales
        validarRegistro(usuario);
        System.out.println("-.-.-.-.-.-.-.--.-.-.-.-.-.--.-.-.-.-.-.--.-.-.-.-.-.--.-.-.-.-.-.-.-.-.-.-.");

        // Intento 1: Éxito
        System.out.println("Intento de acceso 1:");
        boolean acceso1 = u1.checkUsuario("ana@mail.com", "1234");

        if (acceso1) {
            System.out.println("Acceso concedido a " + u1.getNombre());
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.");
        }

        // Intento 2: Fallo
        System.out.println("Intento de acceso 2:");
        boolean acceso2 = u2.checkUsuario("luis@mail.com", "xxxx"); // contraseña incorrecta

        if (!acceso2) {
            System.out.println("¡ERROR! Contraseña incorrecta para " + u2.getEmail() + ". Acceso denegado.");
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.");
        }
        // Intento 3: Éxito
        System.out.println("Intento de acceso 3:");
        boolean acceso3 = u3.checkUsuario("marta@mail.com", "74848");

        if (acceso3) {
            System.out.println("Acceso concedido a " + u3.getNombre());
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.");
        }
    }

    //Metodo auxiliar validarRegistro()
    public static void validarRegistro(Usuario[] usuarios) {

        System.out.println("Validación de códigos postales:");

        for (Usuario u : usuarios) {
            int cp = u.getCodigoPostal();

            if (cp / 1000 == 28) {
                System.out.println(":) Usuario " + u.getNombre() + ": código postal válido (" + cp + ")");
            } else {
                System.out.println(":( ERROR: Usuario " + u.getNombre() + " bloqueado. Código Postal no permitido (" + cp + ")");
            }
        }
    }
}
