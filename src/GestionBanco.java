import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class GestionBanco {
    private Map<String, Cliente> clientes;
    private List<Sucursal> sucursales;

    public GestionBanco() {
        clientes = new HashMap<>();
        sucursales = new ArrayList<>();
    }

    public void agregarCliente(String nombre, String rut) {
        if (!clientes.containsKey(rut)) {
            Cliente cliente = new Cliente(nombre, rut);
            clientes.put(rut, cliente);
        } else {
            System.out.println("El cliente con el rut " + rut + " ya existe.");
        }
    }

    public void agregarCuentaBancaria(String rutCliente, CuentaBancaria cuenta) {
        if (clientes.containsKey(rutCliente)) {
            Cliente cliente = clientes.get(rutCliente);
            cliente.getCuentas().add(cuenta);
        } else {
            System.out.println("No se encontró un cliente con el rut " + rutCliente);
        }
    }

    public void agregarSucursal(String codSucursal, String codPostal) {
        Sucursal sucursal = new Sucursal(codSucursal, codPostal);
        sucursales.add(sucursal);
    }

    public void verCuentasCliente(String rutCliente) {
        if (clientes.containsKey(rutCliente)) {
            Cliente cliente = clientes.get(rutCliente);
            List<CuentaBancaria> cuentas = cliente.getCuentas();
            System.out.println("Cuentas del cliente " + cliente.getNombre() + " (RUT: " + cliente.getRut() + "):");
            for (CuentaBancaria cuenta : cuentas) {
                System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta() + ", Saldo: " + cuenta.getSaldo());
            }
        } else {
            System.out.println("No se encontró un cliente con el rut " + rutCliente);
        }
    }

    public void obtenerCuentasAhorro(String codSucursal) {
        System.out.println("Cuentas de ahorro en la sucursal " + codSucursal + ":");
        for (Cliente cliente : clientes.values()) {
            List<CuentaBancaria> cuentas = cliente.getCuentas();
            for (CuentaBancaria cuenta : cuentas) {
                if (cuenta instanceof CuentaAhorro) {
                    System.out.println("Cliente: " + cliente.getNombre() + ", Número de cuenta: " + cuenta.getNumeroCuenta());
                }
            }
        }
    }

    public void obtenerCuentasCorriente(String codSucursal) {
        System.out.println("Cuentas corrientes en la sucursal " + codSucursal + ":");
        for (Cliente cliente : clientes.values()) {
            List<CuentaBancaria> cuentas = cliente.getCuentas();
            for (CuentaBancaria cuenta : cuentas) {
                if (cuenta instanceof CuentaCorriente) {
                    System.out.println("Cliente: " + cliente.getNombre() + ", Número de cuenta: " + cuenta.getNumeroCuenta());
                }
            }
        }
    }
}
