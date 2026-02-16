import java.util.HashSet;

public class Ascensor extends Maquinaria{
    private boolean vip;
    private int id_ascensor;
    private HashSet<String> registroAceso;

    public Ascensor(boolean vip, int id_ascensor,String nombre, String funcion){
        super(funcion, nombre);
        this.id_ascensor=id_ascensor;
        this.vip=vip;
        this.registroAceso=new HashSet<>();
    }
    public void validacionBiometrica(int ordenLlegada, String DNI){
        String registro= "Orden" + ordenLlegada +"DNI: "+ DNI;
        registroAceso.add(registro);
        System.out.print("Acceso validado para el DNI: "+DNI);
    }
}
