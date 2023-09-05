class CuentaBancaria {
    private String numeroCuenta;
    private String fechaApertura;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String fechaApertura, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
    }

    // Getters y setters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }


    public double getSaldo() {
        return saldo;
    }

}
