public class Receta {
    private int costoIngredientes;
    private byte cantidadIngredientes;
    private String descripcionPreparacion;
    private int cantidadComensales;
    

    public Receta() {
    }

    public Receta(int cantidadComensales, int costoIngredientes, byte cantidadIngredientes, String descripcionPreparacion) {
        this.costoIngredientes = costoIngredientes;
        this.cantidadIngredientes = cantidadIngredientes;
        this.descripcionPreparacion = descripcionPreparacion;
        this.cantidadComensales = cantidadComensales;
    }

    public int getCostoIngredientes() {
        return costoIngredientes;
    }

    public byte getCantidadIngredientes() {
        return cantidadIngredientes;
    }

    public String getDescripcionPreparacion() {
        return descripcionPreparacion;
    }

    public int getCantidadComensales() {
        return cantidadComensales;
    }

    public void setCostoIngredientes(int costoIngredientes) {
        this.costoIngredientes = costoIngredientes;
    }

    public void setCantidadIngredientes(byte cantidadIngredientes) {
        this.cantidadIngredientes = cantidadIngredientes;
    }

    public void setDescripcionPreparacion(String descripcionPreparacion) {
        this.descripcionPreparacion = descripcionPreparacion;
    }

    public void setCantidadComensales(int cantidadComensales) {
        this.cantidadComensales = cantidadComensales;
    }

    public String DescripcionPreparacion(String descripcion) {
        System.out.println("Describa los pasos para realizar la receta: ");
        return descripcion;
    }

    void ingredientesComensales(String nombreIngrediente, int cantidadComensales) {

    }
    

    @Override
    public String toString() {
        return "Receta [costoIngredientes=" + costoIngredientes + ", cantidadIngredientes=" + cantidadIngredientes +
                ", descripcionPreparacion=" + descripcionPreparacion + ", cantidadComensales=" + cantidadComensales;
            }
}
