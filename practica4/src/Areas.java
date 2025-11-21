public class Areas {
    private String nombre;
    private String identificador;
    private int planta;
    private Hospital hospital; // Areas pertenece a hospital
    private int numMedicos;

    public Areas ( String nombre,String identificador,int planta, Hospital hospital) {

        this.nombre= nombre;
        this.identificador= identificador;
        this.planta= planta;
        this.hospital= hospital;
        this.numMedicos= 0;
    }

    //GET

    public String getNombre() {
        return nombre;
    }
    public String getIdentificador() {
        return identificador;
    }
    public Hospital getHospital() {
        return hospital;
    }
    public int getPlanta() {
        return planta;
    }
    public int getNumMedicos() {
        return numMedicos;
    }

 //SET


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    //AUMENTAR MEDICOS
    public void aumentarMedicos() {
        this.numMedicos=this.numMedicos+1;
    }
}
