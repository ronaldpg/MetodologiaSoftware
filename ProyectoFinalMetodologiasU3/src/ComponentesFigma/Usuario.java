package ComponentesFigma;

public class Usuario {

	private String numeroCedula;
	private String nombreCompleto;
	private String correoElectronico;
	private String numeroCelular;
	private String nickname;
	private String contrasena;
	
	public Usuario() {
		
	}

	public Usuario(String numeroCedula, String nombreCompleto, String correoElectronico,
			String numeroCelular, String nickname, String contrasena) {
		this.numeroCedula = numeroCedula;
		this.nombreCompleto = nombreCompleto;
		this.correoElectronico = correoElectronico;
		this.numeroCelular = numeroCelular;
		this.nickname = nickname;
		this.contrasena = contrasena;
	}
	
	public String getNumeroCedula() {
        return numeroCedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public String getNickname() {
        return nickname;
    }

    public String getContrasena() {
        return contrasena;
    }
    
    @Override
    public String toString() {
        return "Usuario{" +
                "numeroCedula='" + numeroCedula + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", numeroCelular='" + numeroCelular + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}