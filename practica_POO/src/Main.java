public class Main {
    public static void main(String[] args){

        Usuario user = new Usuario(
                "Abelardo",
                "Maza",
                11640,
                "Calle Amargura",
                "abelardomc25@gmail.com",
                "12345"

        );
        System.out.println(user.getNombre());
        user.setNombre("Abelardo");
        System.out.println(user.getNombre());


        System.out.println(user.getEmail());
        user.setEmail("amazcas2509@g.educaand.es");
        System.out.println(user.getEmail());

        System.out.println(user.toString());

        System.out.println("El correo y la contraseñas estan: "+ user.checkUsuario("amazcas2509@g.educaand.es", "12345"));

    }
}
