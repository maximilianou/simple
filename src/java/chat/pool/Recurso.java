package chat.pool;

public class Recurso {
	
	public Recurso(String id){
		free = false;
		setId(id);
	}
	public boolean isFree() {
		return free;
	}
	public void setFree(boolean free) {
		this.free = free;
	}
	public String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}
	private String id ;
    private java.sql.Connection conn;
    private boolean free ;
	public java.sql.Connection getConn() {
		
		return conn;
	}

	public void setConn(java.sql.Connection conn) {
		this.conn = conn;
	}
    
}
