public class Direccion {
    private String calle;
    private int numero;
    private int cp;
    private String localidad;
    private String provincia;

    public Direccion(String calle, int numero, int cp, String localidad, String provincia){
        this.calle=calle;
        this.numero=numero;
        this.cp=cp;
        this.localidad=localidad;
        this.provincia=provincia;
    }
}
