public class Usuario {
    //Agregamos atribustos declarados con private
    private String nombre;
    private String apellidos;
    private Integer codigoPostal;
    private String direccion;
    private String email;
    private String password;
    //Ahora implementamos un constructor que inicialice todos los atributos
    public Usuario(String nombre, String apellidos, Integer codigoPostal, String direccion, String email, String password) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codigoPostal = codigoPostal;
        this.direccion = direccion;
        this.email = email;
        this.password = password;

    }

    //Metodo get para todos los atributos

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    //Metodo set para todos los atributos

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String nuevoemail) {
        if (nuevoemail != null && nuevoemail.contains("@")) {
            this.email = nuevoemail;
        } else {
            System.out.println("Error: Email inválido. No contiene @.");
        }
    }

    // setPassword con validación mínima de longitud
    public void setPassword(String contrasena) {
        if (contrasena != null && contrasena.length() >= 6) {
            this.password = contrasena;
        } else {
            System.out.println("Error: La contraseña debe tener al menos 6 caracteres.");
        }
    }

    // Metodo de autenticación
    public boolean checkUsuario(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    // Metodo de representación
    public String toString() {
        return "Usuario: " + this.nombre + " " + this.apellidos + "\nDirección: " + this.direccion + "\nEmail: " + this.email + "\nCódigo Postal: " + this.codigoPostal;
    }
}

