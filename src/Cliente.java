import java.util.ArrayList;
import java.util.List;
class Cliente {
    private String nombre;
    private String rut;
    private List<CuentaBancaria> cuentas;

    public Cliente(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
        this.cuentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public List<CuentaBancaria> getCuentas() {
        return cuentas;
    }
}
