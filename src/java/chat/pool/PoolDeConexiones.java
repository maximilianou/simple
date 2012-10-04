package chat.pool;


public class PoolDeConexiones {
    private RecursosPool recursosPool = new RecursosPool();
    
    public void inicializarPool(int cantMin) throws Exception{
    	for(int i = 0; i < cantMin; i++){
    		// Instanciar un REcurso con una conexion
    		Recurso rec = new Recurso("Recurso"+i);
    		rec.setConn(
    		      AdministradorDeConexiones.getConnection()
    		  );
    		recursosPool.add(rec);
    	}
    }

	public RecursosPool getRecursosPool() {
		return recursosPool;
	}
    
    
}
