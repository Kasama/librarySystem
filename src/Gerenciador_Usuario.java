import java.util.ArrayList;
import java.util.List;

public class Gerenciador_Usuario {

    private static Gerenciador_Usuario instance = null;
	private List<Usuario> usuarios;

    public static Gerenciador_Usuario getInstance(){
        if (instance == null)
            instance = new Gerenciador_Usuario();
        return instance;
    }

    private Gerenciador_Usuario(){
        usuarios = new ArrayList<>();
    }

	public Usuario buscarUsuario(String codigo_RG_CIC) {

        usuarios.stream().filter(u -> checar(u, codigo_RG_CIC));

		return null;
	}

    public boolean checar(Usuario u, String codigo_RG_CIC) {
        return codigo_RG_CIC.equals( "" + u.getCodigo_usuario())
                || codigo_RG_CIC.equals("" + u.getCIC())
                || codigo_RG_CIC.equals("" + u.getRG());
    }

}
