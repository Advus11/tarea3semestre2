class CuentaCorriente extends CuentaBancaria {
    private double lineaSobregiro;

    public CuentaCorriente(String numeroCuenta, String fechaApertura, double saldo, double lineaSobregiro) {
        super(numeroCuenta, fechaApertura, saldo);
        this.lineaSobregiro = lineaSobregiro;
    }

    public double getLineaSobregiro() {
        return lineaSobregiro;
    }
}
