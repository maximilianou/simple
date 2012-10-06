package chat.msg;

public class Mensaje {

    private String idCanal;
    private String texto;
    private long timestamp;

    public Mensaje(String idC, String tex) { // El constructor me obliga.
        setIdCanal(idC);
        setTexto(tex);
        setTimestamp(System.currentTimeMillis());
    }

    @Override
    public String toString() {
        return idCanal
                + "::"
                + texto
                + "("
                + timestamp
                + ")";
    }

    public String getIdCanal() {
        return idCanal;
    }

    protected void setIdCanal(String idCanal) {
        this.idCanal = idCanal;
    }

    public String getTexto() {
        return texto;
    }

    protected void setTexto(String texto) {
        this.texto = texto;
    }

    public long getTimestamp() {
        return timestamp;
    }

    protected void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
