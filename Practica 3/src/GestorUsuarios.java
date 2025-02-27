import java.lang.reflect.Array;
import java.util.Arrays;

public class GestorUsuarios {
    private Usuario[] usuarios;
    private int cantidadUsuarios;

    private void registrarUsuario(Usuario usuario) {
        if (existeUsuario(usuario.usuario) == null) {
            Arrays.copyOf(usuarios, usuarios.length + 1);
            usuarios[usuarios.length - 1] = usuario;
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
        if (nombreUsuario.equals(usuarioLogin.usuario) && (contrasenya.equals(usuarioLogin.contrasenya))) {
            System.out.println("");
            return usuarioLogin;
        }
        System.out.println("Usuario o constraseña incorrectos. Intente de nuevo.");
        return null;
    }

    private Usuario existeUsuario(String nombreUsuario) {
        for (Usuario usuarioInstance : usuarios) {
            if (nombreUsuario == usuarioInstance.usuario) {
                System.out.println("El usuario introducido ya está registrado.");
                return usuarioInstance;
            }
        }
        return null;
    }
}
