package ComponentesFigma;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
public class AdministradorUsuario {

	private static final String ARCHIVO_USUARIOS = "usuarios.txt";

	public static void guardarUsuario(Usuario usuario) {
		try (PrintWriter writer = new PrintWriter(new FileWriter(ARCHIVO_USUARIOS, true))) {
			writer.println(usuario.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static boolean validarCredenciales(String nickname, String contrasena) {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_USUARIOS))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");

                if (datos.length >= 6) {
                    String usuarioNickname = datos[4].trim();
                    String usuarioContrasena = datos[5].trim();

                    if (usuarioNickname.equals(nickname) && usuarioContrasena.equals(contrasena)) {
                        return true; // Credenciales válidas
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false; // Credenciales inválidas
    }
}
