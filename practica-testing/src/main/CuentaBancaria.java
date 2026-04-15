package main;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo){
        this.saldo= saldo;
        this.titular= titular;
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

    //Metodo retirar
    public void retirar(double cantidad){
        if(cantidad <= 0){
            throw new IllegalArgumentException("La cantidad a retirar tiene que ser mayor a 0");
        }
        if(cantidad > this.saldo){
            throw new IllegalArgumentException("Fondos Insuficientes");
        }
        this.saldo -= cantidad;
    }
    //Metodo depositar
    public void depositar(double cantidad) {
        if (cantidad <= 0) {
                throw new IllegalArgumentException("La cantidad a depositar debe ser mayor que cero.");
        }
        this.saldo += cantidad;
    }
}
