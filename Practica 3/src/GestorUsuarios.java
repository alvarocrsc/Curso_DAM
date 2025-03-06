import java.lang.reflect.Array;
import java.util.Arrays;

public class GestorUsuarios {
    private Usuario[] usuarios = new Usuario[0];
    private int cantidadUsuarios;

    private void registrarUsuario(Usuario usuario) {
        if (existeUsuario(usuario.usuario) == null) {
            usuarios = Arrays.copyOf(usuarios, usuarios.length + 1);
            usuarios[usuarios.length - 1] = usuario;
            cantidadUsuarios++;
            System.out.println("Registro exitoso. Ahora puede iniciar sesión.");
        }
    }

    public void registrarCliente(String usuario, String contrasenya) {
        Usuario cliente = new Cliente(usuario, contrasenya);
        registrarUsuario(cliente);
    }

    public void registrarAdmin(String usuario, String contrasenya) {
        Usuario admin = new Administrador(usuario, contrasenya);
        registrarUsuario(admin);
    }

    public Usuario autenticar(String nombreUsuario, String contrasenya) {
        Usuario usuarioLogin = existeUsuario(nombreUsuario);
        if (usuarioLogin != null && usuarioLogin.autenticar(nombreUsuario,contrasenya)) {
            System.out.println("");
            return usuarioLogin;
        }
        System.out.println("Usuario o constraseña incorrectos. Intente de nuevo.");
        return null;
    }

    private Usuario existeUsuario(String nombreUsuario) {
        for (Usuario usuarioInstance : usuarios) {
            if (nombreUsuario.equals(usuarioInstance.usuario)) {
                System.out.println("El usuario introducido ya está registrado.");
                return usuarioInstance;
            }
        }
        return null;
    }
}
