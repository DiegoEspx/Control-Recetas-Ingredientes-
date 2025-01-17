import java.util.ArrayList;
import java.util.List;

public class LaMerced {
    private Usuario usuario;
    private List<Receta> recetas; // Lista de recetas creadas
    private List<Ingrediente> ingredientes;

    public LaMerced(Usuario usuario, Receta receta) {
        this.usuario = usuario;
        this.recetas = new ArrayList<>(); // Inicializamos la lista de recetas
        this.ingredientes = new ArrayList<>();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void eliminarIngrediente(Ingrediente ingrediente) {
        ingredientes.remove(ingrediente);
    }

    public Receta crearReceta(int cantidadComensales, String descripcionPreparacion) {
        int costoIngredientes = 0;
        byte cantidadIngredientes = (byte) ingredientes.size();

        // Calcular el costo total de los ingredientes
        for (Ingrediente ingrediente : ingredientes) {
            costoIngredientes += ingrediente.getValorUnidad();
        }

        // Crear y agregar la receta a la lista
        Receta nuevaReceta = new Receta(cantidadComensales, costoIngredientes, cantidadIngredientes, descripcionPreparacion);
        recetas.add(nuevaReceta);
        return nuevaReceta;
    }

    public List<Receta> getRecetas() {
        return recetas;
    }
}
