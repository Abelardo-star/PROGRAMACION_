import java.time.LocalDate;

public class Medico {
    private String nombre;
    private Areas area;
    private String DNI;
    private int edad;
    private String Sexo;
    private int fecha_i;
    private double sueldoBruto;
    private Areas nuevaArea;

    public Medico(String nombre, Areas area, String DNI, int edad, String Sexo, int fecha_i, double sueldoBruto){
        this.nombre=nombre;
        this.area=area;
        this.DNI=DNI;
        this.edad=edad;
        this.Sexo=Sexo;
        this.fecha_i=fecha_i;
        this.sueldoBruto=sueldoBruto;

        area.aumentarMedicos();
    }
    //GET

    public String getNombre() {
        return nombre;
    }

    public Areas getArea() {
        return area;
    }

    public String getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return Sexo;
    }
    public int getFecha_i() {
        return fecha_i;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public Areas getNuevaArea() {
        return nuevaArea;
    }

    //SET


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArea(Areas area) {
        this.area = area;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public void setFecha_i(int fecha_i) {
        this.fecha_i = fecha_i;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public void setNuevaArea(Areas nuevaArea) {
        this.nuevaArea = nuevaArea;
    }

    //CALCULAR SUELDO NETO
    public double calcularSueldoNeto(double retencion) {
        return this.sueldoBruto - (this.sueldoBruto * retencion / 100);
    }

    //CALCULAR ANTIGUEDAD
    public int getAniosAntiguedad() {
        java.time.LocalDate hoy = java.time.LocalDate.now();

        int anio = this.fecha_i / 10000;
        int mes = (this.fecha_i % 10000) / 100;
        int dia = this.fecha_i % 100;

        LocalDate inicio = LocalDate.of(anio, mes, dia);

        if (inicio.isAfter(hoy)) {
            System.out.println("ERROR: La fecha de inicio es posterior a hoy");
            return 0;
        }

        return java.time.Period.between(inicio, hoy).getYears();
    }




    //CALCULAR IMPUESTOS ANUALES
    public double calcularImpuestosAnuales(double tasaImpositiva) {
        return this.sueldoBruto * (tasaImpositiva / 100);
    }
    //COMPROBACIÓN DE EDAD
    public boolean esMayorEdad(int MayoriaEdad){
        return this.edad >= MayoriaEdad;
    }
    //CALCULO DEL AUMENTO DEL SUELDO
    public double proximoAumento(double porcentajeAumento, int aniosRequeridos){
        if (getAniosAntiguedad() >= aniosRequeridos) {
            return this.sueldoBruto + (this.sueldoBruto * porcentajeAumento / 100);
        }
        return this.sueldoBruto;
    }
    //CAMBIAR AREAS
    public void cambiarArea(Areas nuevaArea) {
        if (this.area != null) {
            this.area.decrementarMedicos();
        }
        nuevaArea.aumentarMedicos();
        this.area = nuevaArea;
    }
    public String toString() {
        return this.nombre + " (DNI: " + this.DNI + ") - Edad: " + this.edad + " - Sueldo: " + this.sueldoBruto + " - Área: " + (this.area != null ? this.area.getNombre() : "Sin Área");
    }

}


