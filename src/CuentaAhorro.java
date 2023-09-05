class CuentaAhorro extends CuentaBancaria {
    private double reajusteAnual;

    public CuentaAhorro(String numeroCuenta, String fechaApertura, double saldo, double reajusteAnual) {
        super(numeroCuenta, fechaApertura, saldo);
        this.reajusteAnual = reajusteAnual;
    }

    public double getReajusteAnual() {
        return reajusteAnual;
    }
}
