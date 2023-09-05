class Sucursal {
    private String codSucursal;
    private String codPostal;

    public Sucursal(String codSucursal, String codPostal) {
        this.codSucursal = codSucursal;
        this.codPostal = codPostal;
    }

    public String getCodSucursal() {
        return codSucursal;
    }

    public String getCodPostal() {
        return codPostal;
    }
}
