public class Contrato {
    private int fechaCreacion;
    private Medico medico;
    private Hospital hospital;

    public Contrato(int fechaCreacion, Medico medico, Hospital hospital) {
        this.fechaCreacion = fechaCreacion;
        this.medico = medico;
        this.hospital = hospital;
    }
    //GET

    public int getFechaCreacion() {
        return fechaCreacion;
    }

    public Medico getMedico() {
        return medico;
    }

    public Hospital getHospital() {
        return hospital;
    }

    //SET

    public void setFechaCreacion(int fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    //COMPROBACION DE AÑO
    public boolean esDeAnio(int anio) {
        return this.fechaCreacion == anio;
    }
    // CALCULO DE VIGENCIA EN AÑOS
    public int aniosDesdeCreacion(int anioActual) {
        return anioActual - this.fechaCreacion;
    }
    public String toString() {
        return "Contrato: " + this.medico.getNombre() + " en " + this.hospital.getNombre() + " - " + this.fechaCreacion;
    }
}
