package chat.pool;
import java.util.*;
public class RecursosPool {
  private ArrayList<Recurso> recursos = new ArrayList< Recurso>();
  
  public Recurso getRecurso(){
	  Recurso retorno = null;
	  for(Recurso rec : recursos){
		  if(retorno == null && rec.isFree() ){
			  retorno = rec;
			  rec.setFree(false); //////////////
		  }
	  }
	  return retorno;
  }
  public void release(Recurso rec){
	  rec.setFree(true);
  }
  public void add(Recurso r){
	  recursos.add(r);
  }
}
