public class Ingrediente {
    private String nombreIngrediente;
    private Unidad unidad;
    private int valorUnidad;
    private String sitioCompra;
    private int calorias;

    public Ingrediente() {
    }

    public Ingrediente(String nombreIngrediente, Unidad unidad, int valorUnidad, String sitioCompra, int calorias) {
        this.nombreIngrediente = nombreIngrediente;
        this.unidad = unidad;
        this.valorUnidad = valorUnidad;
        this.sitioCompra = sitioCompra;
        this.calorias = calorias;
    }

    public String getNombreIngrediente() {
        return nombreIngrediente;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public int getValorUnidad() {
        return valorUnidad;

    }

    public String getSitioCompra() {
        return sitioCompra;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setNombreIngrediente(String nombreIngrediente) {
        this.nombreIngrediente = nombreIngrediente;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    public void setValorUnidad(int valorUnidad) {
        this.valorUnidad = valorUnidad;
    }

    public void setSitioCompra(String sitioCompra) {
        this.sitioCompra = sitioCompra;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Ingrediente [nombreIngrediente=" + nombreIngrediente + ", unidad=" + unidad + ", valorUnidad="
                + valorUnidad
                + ", sitioCompra=" + sitioCompra + ", calorias=" + calorias + "]";
    }
}