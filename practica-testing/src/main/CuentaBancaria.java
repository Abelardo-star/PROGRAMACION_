package main;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo){
        this.saldo=saldo;
        this.titular=titular;
    }

    //GET

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    //SET

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
