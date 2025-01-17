public class Usuario {
    private int usuarioId;
    private String nombre;
    private String contraseña;

    public Usuario() {
    }

    public Usuario(int usuarioId, String nombre, String contraseña) {
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
