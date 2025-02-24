public abstract class Usuario {
    protected String usuario, contrasenya;

    public Usuario(String usuario, String contrasenya) {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
    }

    public boolean autenticar(String nombreUsuario, String contrasenya) {
        return (nombreUsuario == this.usuario && contrasenya == this.contrasenya);
    }
}
