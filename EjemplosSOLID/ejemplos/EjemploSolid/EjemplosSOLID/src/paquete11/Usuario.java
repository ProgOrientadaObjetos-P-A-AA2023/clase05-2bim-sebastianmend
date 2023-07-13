package paquete11;

public class Usuario {
    private String user;
    private String tipo;

    public Usuario(String u, String t) {
        user = u;
        tipo = t;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
