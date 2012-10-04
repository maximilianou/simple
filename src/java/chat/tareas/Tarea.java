package chat.tareas;

import java.util.*;

public class Tarea implements Runnable {
	private ArrayList<String> elLog;
	private String id;

	public Tarea(String id) {
		setId(id);
		elLog = new ArrayList<String>();
		elLog.add(getId() + ":" + new Date(System.currentTimeMillis())
				+ ":Inicio");

		chat.Application.getInstance().getMensajesLog().put(this.getId(),
				this.getElLog());

	}

	public ArrayList<String> getElLog() {
		return elLog;
	}

	public String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				elLog.add(id + ":" + new Date(System.currentTimeMillis()) + ":"
						+ i);
				Thread.sleep(3000);
			}
			elLog.add(id + ":" + new Date(System.currentTimeMillis()) + ": Murio!!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
