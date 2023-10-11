public class Comentario {
    private String comentario;
    private String status;
    private String dueno;

    
    public Comentario(String comentario, String status, String dueno) {
        this.comentario = comentario;
        this.status = status;
        this.dueno = dueno;
    }
    public Comentario(){

    }
    
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getDueno() {
        return dueno;
    }
    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    
}
