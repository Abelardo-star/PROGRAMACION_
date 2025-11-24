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
    //GET

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public int getCp() {
        return cp;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    //SET

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
