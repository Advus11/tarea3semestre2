public class Main {
    public static void main(String[] args) {
        GestionBanco banco = new GestionBanco();

        banco.agregarSucursal("S1", "12345");
        banco.agregarSucursal("S2", "67890");

        banco.agregarCliente("Cliente 1", "12345678");
        banco.agregarCliente("Cliente 2", "87654321");

        CuentaAhorro cuentaAhorro = new CuentaAhorro("C001", "01/01/2023", 1000.0, 0.03);
        CuentaCorriente cuentaCorriente = new CuentaCorriente("C002", "01/01/2023", 2000.0, 500.0);

        banco.agregarCuentaBancaria("12345678", cuentaAhorro);
        banco.agregarCuentaBancaria("87654321", cuentaCorriente);

        banco.verCuentasCliente("12345678");
        banco.verCuentasCliente("87654321");

        banco.obtenerCuentasAhorro("S1");
        banco.obtenerCuentasCorriente("S1");
    }
}