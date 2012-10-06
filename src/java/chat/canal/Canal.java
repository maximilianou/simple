package chat.canal;

import java.util.*;
import chat.msg.*;

public class Canal {
	private String id;
	private LinkedList<Mensaje> mensajes = new LinkedList<Mensaje>();
	public Canal(String id) { // El constructor me obliga.
       setId(id);
	}

	public LinkedList<Mensaje> getMensajes() {
		return mensajes;
	}

	public String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}
	
	

}
