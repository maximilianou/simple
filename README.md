##  Clases, Objetos o Instancias. Encapsular.
-----

* Ejemplo java de como crear una clase.
* Ejemplo java de como crear un atritubo a la clase.
* Ejemplo java de como crear metodos.
* Ejemplo java de Encapsulamiento de los atributos, con los metodos getters y setters.

>      abc.clases01.Aviso.java
>      abc.clases01.TestAviso.java
----- 
>      package abc.clases01;
>      import abc.clases01.Aviso;
>      /**
>       * @author maximilianou
>       */
>      public class TestAviso {
>          public static void main(String [] args){
>              System.out.println("[....] TestAviso --------");
>              
>              System.out.println(" -- ---------------------------------------- -- ");
>              System.out.println(" -- Una Instancia u Objeto de la clase Aviso -- ");
>              Aviso avisoUno = new Aviso();
>              avisoUno.setTitulo("Bicicleta Plegable");
>              avisoUno.setDescripcion("Bicicleta Plegable, 12 kg, roja, Dahon Eco 3.");
>              avisoUno.setPrecio(2000);
>              
>              System.out.println(avisoUno.getTitulo());
>              System.out.println(avisoUno.getPrecio());
>              System.out.println(avisoUno.getDescripcion());
>              System.out.println(" -- ---------------------------------------- -- ");
>              
>              System.out.println(" -- ------------------------------------------ -- ");
>              System.out.println(" -- Dos Instancias u Objetos de la clase Aviso -- ");
>              Aviso avisoDos = new Aviso();
>              avisoDos.setTitulo("Mountain Bike");
>              avisoDos.setDescripcion("Bicicleta profesional, 7kg, 21 cambios.");
>              avisoDos.setPrecio(7000);
>              
>              System.out.println(avisoDos.getTitulo());
>              System.out.println(avisoDos.getPrecio());
>              System.out.println(avisoDos.getDescripcion());
>              System.out.println(" -- ---------------------------------------- -- ");
>      
>              System.out.println("[ OK ] TestAviso --------");
>          }
>      }
----- 
>      package abc.clases01;
>      /**
>       * @author maximilianou
>       */
>      public class Aviso {
>          private String titulo;
>          private String descripcion;
>          private float precio;
>      
>          public String getTitulo() {
>              return titulo;
>          }
>          public void setTitulo(String titulo) {
>              this.titulo = titulo;
>          }
>          public String getDescripcion() {
>              return descripcion;
>          }
>          public void setDescripcion(String descripcion) {
>              this.descripcion = descripcion;
>          }
>          public float getPrecio() {
>              return precio;
>          }
>          public void setPrecio(float precio) {
>              this.precio = precio;
>          }
>      
>      }
----- 
##  Constructores, Atributos Obligatorios.
-----

* Ejemplo java de Constructor con los Campos Obligatorios.
* Ejemplo java de Constructor con los Campos Obligatorios, mas opcionales.

>      abc.clases02.Aviso.java
>      abc.clases02.TestAvisoConstructores.java

----- 
>      package abc.clases02;
>      import abc.clases02.Aviso;
>      /**
>       * @author maximilianou
>       */
>      public class TestAvisoConstructores {
>             public static void main(String [] args){
>              System.out.println("[....] TestAvisoConstructores  --------");
>              
>              System.out.println(" -- ---------------------------------------- -- ");
>              System.out.println(" -- Una Instancia u Objeto de la clase Aviso -- ");
>      // No compila sin parametros, de forma de asegurarnos campos obligatorios.
>      //        Aviso avisoUno = new Aviso();
>      // Solo se construyen instancias con campos obligatorios
>              Aviso avisoUno = new Aviso("Bicicleta Plegable", 2000);
>              // atributo opcional descripcion
>              avisoUno.setDescripcion("Bicicleta Plegable, 12 kg, roja, Dahon Eco 3.");
>              
>              System.out.println(avisoUno.getTitulo());
>              System.out.println(avisoUno.getPrecio());
>              System.out.println(avisoUno.getDescripcion());
>              System.out.println(" -- ---------------------------------------- -- ");
>              
>              System.out.println(" -- ------------------------------------------ -- ");
>              System.out.println(" -- Dos Instancias u Objetos de la clase Aviso -- ");
>              
>      // No compila sin parametros, de forma de asegurarnos campos obligatorios.
>      //        Aviso avisoDos = new Aviso();
>      // Solo se construyen instancias con campos obligatorios
>              Aviso avisoDos = new Aviso("Mountain Bike", 7000);
>              // atributo opcional descripcion
>              avisoDos.setDescripcion("Bicicleta profesional, 7kg, 21 cambios.");
>              
>              System.out.println(avisoDos.getTitulo());
>              System.out.println(avisoDos.getPrecio());
>              System.out.println(avisoDos.getDescripcion());
>              System.out.println(" -- ---------------------------------------- -- ");
>      
>              System.out.println(" -- ------------------------------------------ -- ");
>              System.out.println(" -- Tres Instancias u Objetos de la clase Aviso -- ");
>              
>      // Se construyen instancias con campos obligatorios, y con opcionales como agregado.
>              Aviso avisoTres = new Aviso("Long Board", 3000, "Ruedas de silicona, ideal para competencias.");
>              
>              System.out.println(avisoTres.getTitulo());
>              System.out.println(avisoTres.getPrecio());
>              System.out.println(avisoTres.getDescripcion());
>              System.out.println(" -- ---------------------------------------- -- ");
>      
>              System.out.println("[ OK ] TestAvisoConstructores  --------");
>          }
>       
>      }
----- 
>      package abc.clases02;
>      /**
>       * @author maximilianou
>       */
>      public class Aviso {
>      
>          private String titulo;
>          private String descripcion;
>          private float precio;
>      
>          public Aviso(String titulo, float precio){
>              this.setPrecio(precio);
>              this.setTitulo(titulo);
>          }
>          public Aviso(String titulo, float precio, String descripcion){
>              this.setPrecio(precio);
>              this.setTitulo(titulo);
>              this.setDescripcion(descripcion);
>          }
>          
>          public String getTitulo() {
>              return titulo;
>          }
>          public void setTitulo(String titulo) {
>              this.titulo = titulo;
>          }
>          public String getDescripcion() {
>              return descripcion;
>          }
>          public void setDescripcion(String descripcion) {
>              this.descripcion = descripcion;
>          }
>          public float getPrecio() {
>              return precio;
>          }
>          public void setPrecio(float precio) {
>              this.precio = precio;
>          }
>      }
----- 
##  Excepcion, Validaciones.
-----

* Ejemplo java validacion que lanza Excepcion. No permite campos invalidos.
* Ejemplo java Excepcion muy simple generica, luego se veran especificas.

>      abc.clases03.Aviso.java
>      abc.clases03.TestAvisoExcepcion.java
----- 
>      package abc.clases03;
>      import abc.clases03.Aviso;
>      import java.util.logging.Level;
>      import java.util.logging.Logger;
>      /**
>       * @author maximilianou
>       */
>      public class TestAvisoExcepcion {
>      
>          public static void main(String[] args) {
>              System.out.println("[....]TestAvisoExcepcion --------");
>              System.out.println(" -- ------------------------------------------ -- ");
>              System.out.println(" -- Instancias u Objetos de la clase Aviso -- ");
>              Aviso avisoTres;
>              try {
>                  // Respeta el precio positivo.
>                  avisoTres = new Aviso("Long Board", 3000, "Ruedas de silicona, ideal para competencias.");
>                  System.out.println(avisoTres.getTitulo());
>                  System.out.println(avisoTres.getPrecio());
>                  System.out.println(avisoTres.getDescripcion());
>                  System.out.println(" -- [Ok]: Test Correcto, datos validos. -- ");
>              } catch (Exception ex) {
>                  System.out.println(" -- [Error]: Test Correcto por Validacion -- ");
>              }
>              System.out.println(" -- ------------------------------------------ -- ");
>              System.out.println(" -- Instancias u Objetos de la clase Aviso -- ");
>              Aviso avisoCuatro;
>              try {
>                  // NO Respeta el precio positivo.
>                  avisoCuatro = new Aviso("Long Board", -10, "Ruedas de silicona, ideal para competencias.");
>                  System.out.println(avisoCuatro.getTitulo());
>                  System.out.println(avisoCuatro.getPrecio());
>                  System.out.println(avisoCuatro.getDescripcion());
>                  System.out.println(" -- [ERROR]: Test Fallido, datos invalidos -- ");
>              } catch (Exception ex) {
>                  System.out.println(" -- [Ok]: Test Correcto por Validacion -- ");
>                  //ex.printStackTrace();
>              }
>              System.out.println(" -- ------------------------------------------ -- ");
>              System.out.println(" -- Instancias u Objetos de la clase Aviso -- ");
>              Aviso avisoCinco;
>              try {
>                  // NO Respeta el titulo. No puede ser null
>                  avisoCinco = new Aviso(null, 4444, "Ruedas de silicona, ideal para competencias.");
>                  System.out.println(avisoCinco.getTitulo());
>                  System.out.println(avisoCinco.getPrecio());
>                  System.out.println(avisoCinco.getDescripcion());
>                  System.out.println(" -- [ERROR]: Test Fallido -- ");
>              } catch (Exception ex) {
>                  System.out.println(" -- [Ok]: Test Correcto por Validacion -- ");
>                  //ex.printStackTrace();
>              }
>              System.out.println(" -- ------------------------------------------ -- ");
>              System.out.println(" -- Instancias u Objetos de la clase Aviso -- ");
>              Aviso avisoSeis;
>              try {
>                  // NO Respeta el titulo. Tiene que tener un titulo legible.
>                  avisoSeis = new Aviso("", 4444, "Ruedas de silicona, ideal para competencias.");
>                  System.out.println(avisoSeis.getTitulo());
>                  System.out.println(avisoSeis.getPrecio());
>                  System.out.println(avisoSeis.getDescripcion());
>                  System.out.println(" -- [ERROR]: Test Fallido -- ");
>              } catch (Exception ex) {
>                  System.out.println(" -- [Ok]: Test Correcto por Validacion -- ");
>                  //ex.printStackTrace();
>              }
>              System.out.println(" -- ---------------------------------------- -- ");
>              System.out.println("[ OK ]TestAvisoExcepcion --------");
>          }
>      }
----- 
>      package abc.clases03;
>      /**
>       * @author maximilianou
>       */
>      public class Aviso {
>          private String titulo;
>          private String descripcion;
>          private float precio;
>      
>          public Aviso(String titulo, float precio) throws Exception{
>              this.setPrecio(precio);
>              this.setTitulo(titulo);
>          }
>          public Aviso(String titulo, float precio, String descripcion) throws Exception{
>              this.setPrecio(precio);
>              this.setTitulo(titulo);
>              this.setDescripcion(descripcion);
>          }
>      
>          public String getTitulo() {
>              return titulo;
>          }
>          public void setTitulo(String titulo) throws Exception {
>              if( titulo == null || titulo.length() < 1 ){
>                  throw new Exception("Un Aviso debe tener un Titulo al menos un caracter.");
>              }
>              this.titulo = titulo;
>          }
>          public String getDescripcion() {
>              return descripcion;
>          }
>          public void setDescripcion(String descripcion) {
>              this.descripcion = descripcion;
>          }
>          public float getPrecio() {
>              return precio;
>          }
>          public void setPrecio(float precio) throws Exception {
>              if( precio < 0 ){
>                  throw new Exception("Un aviso debe tener un precio positivo.");
>              }
>              this.precio = precio;
>          }
>      
>      }
----- 
##  Lista Coleccion, Cargar, recorrer y Vaciar.
-----
* Ejemplo java una coleccion, una lista particularmente.
* Ejemplo java de como llenar una coleccion.
* Ejemplo java de como recorrer una coleccion.
* Ejemplo java de como vaciar una coleccion.

>      abc.clases04.Aviso.java
>      abc.clases04.TestAvisoColeccion.java

----- 
>      package abc.clases04;
>      import java.util.ArrayList;
>      import java.util.logging.Level;
>      import java.util.logging.Logger;
>      /** @author maximilianou */
>      public class TestAvisoColeccion {
>      
>          public static void main(String[] args) {
>              System.out.println("[..] " + TestAvisoColeccion.class.getCanonicalName() + " --------");
>      
>              ArrayList<Aviso> listaAvisos = new ArrayList();
>              System.out.println("Lista Size Cero: " + listaAvisos.size());
>      
>              System.out.println(" -- ------------------------------------------ -- ");
>              System.out.println(" -- Coleccion de Objetos -- ");
>              try {
>                  listaAvisos.add(new Aviso("Peras", 15, "Amarillas for Export"));
>                  System.out.println(listaAvisos);
>                  System.out.println("Lista Size Uno: " + listaAvisos.size());
>                  listaAvisos.add(new Aviso("Manzana", 20, "Verdes Grandes"));
>                  System.out.println(listaAvisos);
>                  listaAvisos.add(new Aviso("Lechuga", 10, "Criolla para el asadito"));
>                  System.out.println(listaAvisos);
>                  System.out.println("Lista Size Tres: " + listaAvisos.size());
>                  System.out.println("[OK] Coleccion de objetos cargada");
>      
>                  System.out.println(" -- --- -- ");
>                  System.out.println(" -- Una forma de recorrer la Coleccion, Lista -- ");
>                  for (Aviso avisoActual : listaAvisos) {
>                      System.out.println(" : " + avisoActual + " : ");
>                  }
>                  System.out.println(" -- --- -- ");
>                  System.out.println(" -- Otra forma de recorrer la Coleccion, Lista -- ");
>                  for (int i = 0; i < listaAvisos.size(); i++) {
>                      Aviso avisoEnIndiceI = listaAvisos.get(i);
>                      System.out.println(" : " + i + " : " + avisoEnIndiceI + " : ");
>                  }
>      
>                  System.out.println(" -- --- -- ");
>      
>                  System.out.println(" -- Vaciamos la Coleccion, Lista -- ");
>      
>                  listaAvisos.clear();
>                  System.out.println("Lista Size Cero: " + listaAvisos.size());
>                  System.out.println(listaAvisos);
>       
>                  System.out.println(" -- --- -- ");
>              } catch (Exception ex) {
>                  System.out.println("[ERROR] Hubo un error en la coleccion");
>                  ex.printStackTrace();
>                  Logger.getLogger(TestAvisoColeccion.class.getName()).log(Level.SEVERE, null, ex);
>              }
>              System.out.println(" -- ------------------------------------------ -- ");
>      
>      
>              System.out.println("[Ok] " + TestAvisoColeccion.class.getCanonicalName() + " --------");
>      
>          }
>      }
----- 
>      package abc.clases04;
>      /**
>       * @author maximilianou
>       */
>      public class Aviso {
>          private String titulo;
>          private String descripcion;
>          private float precio;
>      
>          public Aviso(String titulo, float precio) throws Exception{
>              this.setPrecio(precio);
>              this.setTitulo(titulo);
>          }
>          public Aviso(String titulo, float precio, String descripcion) throws Exception{
>              this(titulo, precio);
>              this.setDescripcion(descripcion);
>          }
>          
>          @Override
>          public String toString() {
>              return "Aviso(Titulo:"+this.titulo+"; Precio:"+this.precio+"; Descripcion:"+this.descripcion+")";
>          }
>          
>          public String getTitulo() {
>              return titulo;
>          }
>          public void setTitulo(String titulo) throws Exception {
>              if( titulo == null || titulo.length() < 1 ){
>                  throw new Exception("Un Aviso debe tener un Titulo al menos un caracter.");
>              }
>              this.titulo = titulo;
>          }
>          public String getDescripcion() {
>              return descripcion;
>          }
>          public void setDescripcion(String descripcion) {
>              this.descripcion = descripcion;
>          }
>          public float getPrecio() {
>              return precio;
>          }
>          public void setPrecio(float precio) throws Exception {
>              if( precio < 0 ){
>                  throw new Exception("Un aviso debe tener un precio positivo.");
>              }
>              this.precio = precio;
>          }
>      }
----- 
##  Diccionario, categorizacion, Indice.
-----
* Ejemplo java un diccionario (clave, valor).
* Ejemplo java indice por Categoria de lista de Avisos.

>      abc.clases05.Aviso.java
>      abc.clases05.Categoria.java
>      abc.clases05.AdministradorAvisos.java
>      abc.clases05.TestAvisoDiccionario.java

----- 
>      package abc.clases05;
>      import java.util.*;
>      /** @author maximilianou */
>      public class TestAvisoDiccionario {
>      
>          public static void main(String[] args) {
>              System.out.println("[..] " + TestAvisoDiccionario.class.getCanonicalName() + " --------");
>      
>              System.out.println(" -- ------------------------------------------ -- ");
>              System.out.println(" -- Diccionario de Objetos, Singleton -- ");
>              Categoria cate1 = new Categoria("Educativo");
>              Categoria cate2 = new Categoria("Consultoria");
>              Categoria cate3 = new Categoria("Marketing");
>              try {
>                  Aviso a1 = new Aviso("Curso Java", 300, cate1, "");
>                  Aviso a9 = new Aviso("Curso JavaScript", 250, cate1, "");
>                  Aviso a5 = new Aviso("Curso HTML5", 240, cate1, "");
>                  Aviso a4 = new Aviso("Proyecto Actualizacion Tecnica", 30000, cate2, "");
>                  Aviso a7 = new Aviso("Proyecto Infraestructura", 250000, cate2, "");
>                  Aviso a8 = new Aviso("Proyecto Integracion", 50000, cate2, "");
>                  Aviso a2 = new Aviso("Comunidades Sociales", 30000, cate3, "");
>                  Aviso a6 = new Aviso("Avisos Pagos", 250000, cate3, "");
>                  Aviso a3 = new Aviso("Integracion Empresas", 50000, cate3, "");
>      
>                  AdministradorAvisos.getInstance().addByCategory(a7);
>                  AdministradorAvisos.getInstance().addByCategory(a8);
>                  AdministradorAvisos.getInstance().addByCategory(a9);
>                  AdministradorAvisos.getInstance().addByCategory(a1);
>                  AdministradorAvisos.getInstance().addByCategory(a2);
>                  AdministradorAvisos.getInstance().addByCategory(a3);
>                  AdministradorAvisos.getInstance().addByCategory(a4);
>                  AdministradorAvisos.getInstance().addByCategory(a5);
>                  AdministradorAvisos.getInstance().addByCategory(a6);
>      
>                  Iterator<String> categoriasNombres 
>                          = AdministradorAvisos.getInstance().getCategoryNames();
>                  while(categoriasNombres.hasNext()){
>                    System.out.println("....Categoria...................");
>                    System.out.println( 
>                            AdministradorAvisos.getInstance()
>                               .getAvisosByCategory(categoriasNombres.next()) );
>                  }
>                  
>              } catch (Exception e) {
>                  System.out.println("[ER] " + e.getMessage());
>              }
>              System.out.println(" -- ------------------------------------------ -- ");
>      
>              System.out.println("[Ok] " + TestAvisoDiccionario.class.getCanonicalName() + " --------");
>      
>          }
>      }
----- 
>      package abc.clases05;
>      import java.util.*;
>      /** @author maximilianou 
>       Diccionario de Avisos por Categoria, Singleton(Unica Instancia de Admin)*/
>      public class AdministradorAvisos {
>          private static AdministradorAvisos INSTANCE = new AdministradorAvisos();
>          public static AdministradorAvisos getInstance(){
>              return INSTANCE;
>          }
>          private TreeMap<String, ArrayList<Aviso>> avisos = new TreeMap();
>          public void addByCategory(Aviso aviso_param){
>              ArrayList<Aviso> contenidoCategoria = avisos.get(aviso_param.getCategoria().getNombre());
>              if( contenidoCategoria == null ){
>                  contenidoCategoria = new ArrayList();
>                  avisos.put(aviso_param.getCategoria().getNombre(), contenidoCategoria);
>              }
>              contenidoCategoria.add(aviso_param);
>          }
>          public Iterator getCategoryNames(){
>              return avisos.keySet().iterator();
>          }
>          public ArrayList getAvisosByCategory(String cateName){
>              return avisos.get(cateName);
>          }
>      }
----- 
>      package abc.clases05;
>      
>      /**
>       *
>       * @author maximilianou
>       */
>      public class Aviso {
>          
>          private String titulo;
>          private String descripcion;
>          private float precio;
>      
>          private Categoria categoria; 
>          
>          public Aviso(String titulo, float precio, Categoria categ) throws Exception{
>              this.setPrecio(precio);
>              this.setTitulo(titulo);
>              this.setCategoria(categ);
>          }
>          public Aviso(String titulo, float precio, Categoria categ, String descripcion) throws Exception{
>              this(titulo, precio, categ);
>              this.setDescripcion(descripcion);
>          }
>          
>          @Override
>          public String toString() {
>              return "Aviso(Titulo:"+this.titulo+"; Precio:"+this.precio+"; Descripcion:"+this.descripcion+")";
>          }
>          
>          
>          /**
>           * @return the titulo
>           */
>          public String getTitulo() {
>              return titulo;
>          }
>      
>          /**
>           * @param titulo the titulo to set
>           */
>          public void setTitulo(String titulo) throws Exception {
>              if( titulo == null || titulo.length() < 1 ){
>                  throw new Exception("Un Aviso debe tener un Titulo al menos un caracter.");
>              }
>              this.titulo = titulo;
>          }
>      
>          /**
>           * @return the descripcion
>           */
>          public String getDescripcion() {
>              return descripcion;
>          }
>      
>          /**
>           * @param descripcion the descripcion to set
>           */
>          public void setDescripcion(String descripcion) {
>              this.descripcion = descripcion;
>          }
>      
>          /**
>           * @return the precio
>           */
>          public float getPrecio() {
>              return precio;
>          }
>      
>          /**
>           * @param precio the precio to set
>           */
>          public void setPrecio(float precio) throws Exception {
>              if( precio < 0 ){
>                  throw new Exception("Un aviso debe tener un precio positivo.");
>              }
>              this.precio = precio;
>          }
>      
>          /**
>           * @return the categoria
>           */
>          public Categoria getCategoria() {
>              return categoria;
>          }
>      
>          /**
>           * @param categoria the categoria to set
>           */
>          public void setCategoria(Categoria categoria) {
>              this.categoria = categoria;
>          }
>      
>      
>      
>          
>      }
----- 
>      package abc.clases05;
>      
>      /**
>       *
>       * @author maximilianou
>       */
>      public class Categoria {
>      
>          private String nombre;
>      
>          public Categoria(String nom) {
>              setNombre(nom);
>          }
>      
>          /**
>           * @return the nombre
>           */
>          public String getNombre() {
>              return nombre;
>          }
>      
>          /**
>           * @param nombre the nombre to set
>           */
>          public void setNombre(String nombre) {
>              this.nombre = nombre;
>          }
>      }
----- 
##  Base de Datos, SQL.
-----
* Ejemplo java Base de Datos Embebida, Singleton.
* Ejemplo java Base de Datos Instanciar el Servidor de Base de Datos.
* Ejemplo java Base de Datos Bajar el Servidor de Base de Datos.
* Ejemplo java Base de Datos Test Crear, Insertar, Consultar.

>      abc.clases06.DB.java
>      abc.clases06.TestDB.java

* Ejemplo java Data Access Object, Singleton.
* Ejemplo java Data Access Object, Crear, Insertar, Consultar

>      abc.clases06.Aviso.java
>      abc.clases06.AvisoDao.java
>      abc.clases06.TestAvisoDao.java

----- 
>      package abc.clases06;
>      
>      import java.io.IOException;
>      import java.sql.*;
>      import org.hsqldb.server.ServerAcl;
>      
>      /**
>       * @author maximilianou
>       */
>      public class TestDB {
>      
>          private static final String SQL_CREATE =
>                  "CREATE TABLE IF NOT EXISTS avisos ( av_id IDENTITY, "
>                  + "av_titulo VARCHAR(255)  );";
>          private static final String SQL_INSERT =
>                  "INSERT INTO avisos (av_titulo)values(?);";
>          private static final String SQL_SELECT =
>                  "SELECT * FROM avisos;";
>          private static final String SQL_DROP =
>                  "DROP TABLE avisos;";
>          private static final String SQL_SHUTDOWN =
>                  "SHUTDOWN;";
>      
>          public static void main(String[] args) {
>              System.out.println("[ .. ] TestDB");
>              Connection c = null;
>              PreparedStatement pstmt = null;
>              try {
>                  c = DB.getInstance().getConnection();
>                  pstmt = c.prepareStatement(SQL_CREATE);
>                  pstmt.execute();
>                  pstmt.close();
>              } catch (Exception ex) {
>                  ex.printStackTrace();
>              }
>              for (int i = 0; i < 5; i++) {
>                  try {
>                      pstmt = c.prepareStatement(SQL_INSERT);
>                      pstmt.setString(1, "El Titulo Del Aviso " + i);
>                      pstmt.execute();
>                      pstmt.close();
>                  } catch (Exception ex) {
>                      ex.printStackTrace();
>                  }
>              }
>              try {
>                  pstmt = c.prepareStatement(SQL_SELECT);
>                  ResultSet rs = pstmt.executeQuery();
>                  while (rs.next()) {
>                      System.out.println("[" + rs.getString(1) + "], ["
>                              + rs.getString(2) + "] ");
>                  }
>                  pstmt.close();
>              } catch (Exception ex) {
>                  ex.printStackTrace();
>              }
>              try {
>                  pstmt = c.prepareStatement(SQL_DROP);
>                  System.out.println(
>                          pstmt.execute());
>                  pstmt.close();
>              } catch (Exception ex) {
>                  ex.printStackTrace();
>              }
>              try {
>                  pstmt = c.prepareStatement(SQL_SHUTDOWN);
>                  pstmt.execute();
>                  pstmt.close();
>              } catch (Exception ex) {
>                  ex.printStackTrace();
>              }
>              System.out.println("[ OK ] TestDB");
>          }
>      }
----- 
>      package abc.clases06;
>      
>      import java.io.IOException;
>      import java.io.OutputStreamWriter;
>      import java.io.PrintWriter;
>      import java.io.Writer;
>      import java.sql.*;
>      import org.hsqldb.server.Server;
>      import org.hsqldb.persist.HsqlProperties;
>      import org.hsqldb.server.ServerAcl;
>      
>      /**
>       * @author maximilianou
>       */
>      public class DB {
>      
>          private static DB INSTANCE = null;
>      
>          public static DB getInstance() throws ClassNotFoundException, IOException, SQLException {
>              if (INSTANCE == null) {
>                  INSTANCE = new DB();
>              }
>              return INSTANCE;
>          }
>      
>          private DB() throws ClassNotFoundException,
>                  IOException, SQLException {
>              try {
>                  Class.forName("org.hsqldb.jdbc.JDBCDriver");
>                  HsqlProperties p = new HsqlProperties();
>                  p.setProperty("server.database.0", "file:./publicacion.hsqldb");
>                  p.setProperty("server.dbname.0", "publicacion");
>                  PrintWriter salidaINFO = new PrintWriter(
>                          new OutputStreamWriter(System.out));
>                  PrintWriter salidaERR = new PrintWriter(
>                          new OutputStreamWriter(System.err));
>                  Server server = new Server();
>                  server.setProperties(p);
>                  server.setLogWriter(salidaINFO);
>                  server.setErrWriter(salidaERR);
>                  server.start();
>              } catch (ServerAcl.AclFormatException e) {
>                  throw new SQLException("Acceso denegado:" + e.getMessage());
>              }
>          }
>      
>          public Connection getConnection() throws ClassNotFoundException,
>                  IOException, SQLException {
>              DB.getInstance();
>              return DriverManager.getConnection("jdbc:hsqldb:file:./publicacion.hsqldb;", "SA", "");
>          }
>      
>          public void shutdown() throws ClassNotFoundException,
>                  IOException, SQLException {
>              Connection c = null;
>              PreparedStatement pstmt = null;
>              try {
>                  c = getConnection();
>                  pstmt = c.prepareStatement("SHUTDOWN;");
>                  pstmt.execute();
>                  pstmt.close();
>              } finally {
>                  try {
>                      pstmt.close();
>                  } finally {
>                      c.close();
>                  }
>              }
>          }
>      }
----- 
>      package abc.clases06;
>      
>      import java.io.IOException;
>      import java.sql.SQLException;
>      import java.util.*;
>      import java.util.logging.Level;
>      import java.util.logging.Logger;
>      
>      /**
>       *
>       * @author maximilianou
>       */
>      public class TestAvisoDao {
>      
>          public static void main(String[] args) {
>              System.out.println("[ .. ]TestAvisoDao");
>              try {
>                  ArrayList<Aviso> avisos = AvisoDao.getInstance().obtener();
>                  for (Aviso a : avisos) {
>                      System.out.println(a);
>                  }
>              } catch (Exception ex) {
>                  ex.printStackTrace();
>              }
>              try {
>                  Aviso a = new Aviso("Un Titulo TestAvisoDao", 2000, "" + new Date());
>                  AvisoDao.insertar(a);
>              } catch (Exception ex) {
>                  ex.printStackTrace();
>              }
>              try {
>                  DB.getInstance().shutdown();
>              } catch (Exception ex) {
>                  ex.printStackTrace();
>              }
>              System.out.println("[ OK ]TestAvisoDao");
>          }
>      }
----- 
>      package abc.clases06;
>      
>      import java.io.IOException;
>      import java.sql.*;
>      import java.util.ArrayList;
>      
>      /**
>       * @author maximilianou
>       */
>      public class AvisoDao {
>      
>          private AvisoDao() throws ClassNotFoundException,
>                  IOException, SQLException {
>              crear();
>          }
>          private static AvisoDao INSTANCE = null;
>      
>          public static AvisoDao getInstance() throws ClassNotFoundException,
>                  IOException, SQLException {
>              if (INSTANCE == null) {
>                  INSTANCE = new AvisoDao();
>              }
>              return INSTANCE;
>          }
>          private final static String SQL_AVISOS_CREATE = "CREATE TABLE IF NOT EXISTS "
>                  + "avisos ( av_id IDENTITY, av_titulo VARCHAR(255), "
>                  + "av_precio FLOAT, av_descripcion VARCHAR(255)  );";
>      
>          public void crear() throws ClassNotFoundException, IOException, SQLException {
>              Connection c = null;
>              PreparedStatement ptsmt = null;
>              try {
>                  c = DB.getInstance().getConnection();
>                  ptsmt = c.prepareStatement(SQL_AVISOS_CREATE);
>                  ptsmt.execute();
>              } finally {
>                  try {
>                      ptsmt.close();
>                  } finally {
>                      c.close();
>                  }
>              }
>          }
>          private final static String SQL_AVISOS_SELECT = "SELECT * FROM avisos;";
>      
>          public ArrayList<Aviso> obtener() throws ClassNotFoundException,
>                  IOException, SQLException {
>              ArrayList<Aviso> lista = new ArrayList();
>              Connection c = null;
>              PreparedStatement ptsmt = null;
>              ResultSet rs = null;
>              try {
>                  c = DB.getInstance().getConnection();
>                  ptsmt = c.prepareStatement(SQL_AVISOS_SELECT);
>                  rs = ptsmt.executeQuery();
>                  Aviso a = null;
>                  while (rs.next()) {
>                      try {
>                          a = new Aviso(rs.getString("av_titulo"),
>                                  rs.getFloat("av_precio"),
>                                  rs.getString("av_descripcion"));
>                      } catch (Exception ex) {
>                          ex.printStackTrace();
>                      }
>                      a.setId(rs.getString("av_id"));
>                      lista.add(a);
>                  }
>              } finally {
>                  try {
>                      rs.close();
>                  } finally {
>                      try {
>                          ptsmt.close();
>                      } finally {
>                          c.close();
>                      }
>                  }
>              }
>              return lista;
>          }
>          private final static String SQL_AVISOS_INSERT = "INSERT INTO avisos (av_titulo,"
>                  + "av_precio, av_descripcion)values(?,?,?);";
>      
>          public static void insertar(Aviso a)
>                  throws ClassNotFoundException,
>                  IOException, SQLException {
>              Connection c = null;
>              PreparedStatement ptsmt = null;
>              try {
>                  c = DB.getInstance().getConnection();
>                  ptsmt = c.prepareStatement(SQL_AVISOS_INSERT);
>                  ptsmt.setString(1, a.getTitulo());
>                  ptsmt.setFloat(2, a.getPrecio());
>                  ptsmt.setString(3, a.getDescripcion());
>                  ptsmt.execute();
>              } finally {
>                  try {
>                      ptsmt.close();
>                  } finally {
>                      c.close();
>                  }
>              }
>          }
>          private final static String SQL_AVISOS_UPDATE = "UPDATE avisos "
>                  + "set av_titulo = ?, av_precio = ?, av_descripcion = ? "
>                  + " WHERE av_id = ?;";
>      
>          public static void actualizar(Aviso a) throws ClassNotFoundException,
>                  IOException, SQLException {
>              Connection c = null;
>              PreparedStatement ptsmt = null;
>              try {
>                  c = DB.getInstance().getConnection();
>                  ptsmt = c.prepareStatement(SQL_AVISOS_UPDATE);
>                  ptsmt.setString(1, a.getTitulo());
>                  ptsmt.setFloat(2, a.getPrecio());
>                  ptsmt.setString(3, a.getDescripcion());
>                  ptsmt.setInt(4, Integer.parseInt(a.getId()));
>                  ptsmt.execute();
>              } finally {
>                  try {
>                      ptsmt.close();
>                  } finally {
>                      c.close();
>                  }
>              }
>          }
>          private final static String SQL_AVISOS_DELETE = "DELETE avisos "
>                  + " WHERE av_id = ?;";
>      
>          public static void borrar(Aviso a) throws ClassNotFoundException,
>                  IOException, SQLException {
>              Connection c = null;
>              PreparedStatement ptsmt = null;
>              try {
>                  c = DB.getInstance().getConnection();
>                  ptsmt = c.prepareStatement(SQL_AVISOS_DELETE);
>                  ptsmt.setInt(1, Integer.parseInt(a.getId()));
>                  ptsmt.execute();
>              } finally {
>                  try {
>                      ptsmt.close();
>                  } finally {
>                      c.close();
>                  }
>              }
>          }
>      }
----- 
>      package abc.clases06;
>      
>      /**
>       *
>       * @author maximilianou
>       */
>      public class Aviso {
>      
>          private String id;
>          private String titulo;
>          private String descripcion;
>          private float precio;
>      
>          public Aviso(String titulo, float precio, String desc) throws Exception {
>              this.setPrecio(precio);
>              this.setTitulo(titulo);
>              this.setDescripcion(desc);
>          }
>      
>          @Override
>          public String toString() {
>              return "{Aviso:{id:"+this.id+", Titulo:" + this.titulo 
>                      + ", Precio:" + this.precio + ", Descripcion:" + this.descripcion + "}}";
>          }
>      
>          public String getTitulo() {
>              return titulo;
>          }
>      
>          public void setTitulo(String titulo) throws Exception {
>              if (titulo == null || titulo.length() < 1) {
>                  throw new Exception("Un Aviso debe tener un Titulo al menos un caracter.");
>              }
>              this.titulo = titulo;
>          }
>      
>          public String getDescripcion() {
>              return descripcion;
>          }
>      
>          public void setDescripcion(String descripcion) {
>              this.descripcion = descripcion;
>          }
>      
>          public float getPrecio() {
>              return precio;
>          }
>      
>          public void setPrecio(float precio) throws Exception {
>              if (precio < 0) {
>                  throw new Exception("Un aviso debe tener un precio positivo.");
>              }
>              this.precio = precio;
>          }
>      
>          public String getId() {
>              return id;
>          }
>      
>          public void setId(String id) {
>              this.id = id;
>          }
>      }
----- 
##  Patrones, Crear, Singleton.
-----

* Ejemplo java patron singleton.
* Ejemplo java unica instancia en el proceso.

>        pattern.create.a.Singleton.java
>        
----- 
>      package pattern.create.a;
>      
>      public class Singleton {
>          public static void main(String[]args){
>              System.out.println("-----------Singleton------------");
>              UnicaInstancia ui1 = UnicaInstancia.getInstance();
>              UnicaInstancia ui2 = UnicaInstancia.getInstance();
>              UnicaInstancia ui3 = UnicaInstancia.getInstance();
>              UnicaInstancia ui4 = UnicaInstancia.getInstance();
>              System.out.println( ui1 );
>              System.out.println( ui2 );
>              System.out.println( ui3 );
>              System.out.println( ui4 );
>              System.out.println("-----------Singleton------------");
>              
>          }
>      }
>      
>      class UnicaInstancia{
>          private static UnicaInstancia INSTANCE = new UnicaInstancia();
>          private UnicaInstancia(){
>              System.out.println("UnicaInstancia..");
>          }
>          public static UnicaInstancia getInstance(){
>              return INSTANCE;
>          }
>      }
>      
----- 
##  Patrones, Crear, Singleton, Inicializacion sobre demanda.
-----

* Ejemplo java patron singleton.
* Ejemplo java unica instancia en el proceso.
* Ejemplo java inicializacion sobre demanda.

>        pattern.create.a.LazyInitialization.java
>     
   
----- 
>      package pattern.create.b;
>      
>      public class LazyInitialization {
>          public static void main(String[]args){
>              System.out.println("------------LazyInitialization-------------");
>              System.out.println(Config.getInstance());
>              System.out.println(Config.getInstance());
>              System.out.println(Config.getInstance());
>              System.out.println(Config.getInstance());
>              System.out.println("------------LazyInitialization-------------");
>          }
>      }
>      
>      class Config{
>          private static Config INSTANCE = null;
>          private Config(){
>              System.out.println("Config()..");
>          }
>          public static Config getInstance(){
>              if( INSTANCE == null ){
>                  INSTANCE = new  Config();
>              }
>              return INSTANCE;
>          }
>      }
----- 
##  Patrones, Crear, Pool de Objetos, Recursos.
-----

* Ejemplo java patron Pool de Objetos.
* Ejemplo java pool de recursos.
* Ejemplo java pool de recursos Tipificados.

>        pattern.create.c.ObjectPool.java
>        
----- 
>      package pattern.create.c;
>      import java.util.*;
>      public class ObjectPool {
>          public static void main(String[]args){
>              System.out.println("------------- Object Pool --------------");
>              Pool<String> ps = new Pool<String>(); 
>              Recurso<String> s = ps.getE();
>              Recurso<String> s2 = ps.getE();
>              Recurso<String> s3 = ps.getE();
>              System.out.println(":"+s);
>              System.out.println(":"+s2);
>              System.out.println(":"+s3);
>              System.out.println("------------- Object Pool --------------");
>              ps.release(s);
>              Recurso<String> s4 = ps.getE();
>              System.out.println(":"+s2);
>              System.out.println(":"+s3);
>              System.out.println(":"+s4);
>              ps.release(s2);
>              ps.release(s3);
>              ps.release(s4);
>              System.out.println("------------- Object Pool --------------");
>              Recurso<String> s5 = ps.getE();
>              Recurso<String> s6 = ps.getE();
>              Recurso<String> s7 = ps.getE();
>              System.out.println(":"+s5);
>              System.out.println(":"+s6);
>              System.out.println(":"+s7);
>              ps.release(s5);
>              ps.release(s6);
>              ps.release(s7);
>              System.out.println("------------- Object Pool --------------");
>          }
>      }
>      
>      class Pool<E>{
>          private ArrayList<Recurso> recursos = new ArrayList<Recurso>();
>          public Recurso<E> getE(){
>              Recurso<E> e = null;
>              for(int i = 0; i < recursos.size() && e == null; i++){
>                  if(recursos.get(i).isLibre()){
>                      e = recursos.get(i);
>                  }
>              }
>              if(e==null){
>                  e  = new Recurso<E>();
>                  //TODO: Inicializar E !!!
>                  recursos.add(e);
>              }
>              e.setLibre(false);
>              return e;
>          }
>          public void release(Recurso r){
>              r.setLibre(true);
>          }
>      }
>      class Recurso<E>{
>          private E obj;
>          private boolean libre = true;
>          public Recurso(){
>          }
>          public E getObj() {
>              return obj;
>          }
>          public void setObj(E obj) {
>              this.obj = obj;
>          }
>          public boolean isLibre() {
>              return libre;
>          }
>          public void setLibre(boolean libre) {
>              this.libre = libre;
>          }
>      }
----- 
##  Patrones, Crear, Abstract Factory.
-----

* Ejemplo java patron abstract factory.
* Ejemplo java crea instancias de productos de distinto tipo segun algun criterio.

>        pattern.create.h.AbsFactPat.java
>     
   
----- 
>      package pattern.create.h;
>      public class AbsFactPat {
>          public static void main(String[] args) {
>              System.out.println("-------- AbstractFactory con Facade ------");
>              Producto p = ProductFacade.getProducto("12");
>              Producto p1 = ProductFacade.getProducto("22");
>              Producto p2 = ProductFacade.getProducto("31");
>              Producto p3 = ProductFacade.getProducto("8549");
>              System.out.println(p);
>              System.out.println(p1);
>              System.out.println(p2);
>              System.out.println(p3);
>              System.out.println("-------- AbstractFactory con Facade ------");
>          }
>      }
>      abstract class Producto{
>          private String id;
>          public void setId(String pid){
>              id = pid;
>          }
>          public String getId(){
>              return id;
>          }
>      }
>      class Servicio extends Producto{
>          public String toString(){ return "Servicio:["+getId()+"]"; }
>      }
>      class Articulo extends Producto{
>          public String toString(){ return "Articulo:["+getId()+"]"; }
>      }
>      abstract class ProductFactory{
>          public abstract Producto getProducto(String id);
>      }
>      class ServiceFactory extends ProductFactory{
>          @Override
>          public Producto getProducto(String id) {
>              Servicio s = new Servicio();
>              s.setId(id);
>              return s;
>          }
>      }
>      class ArticuloFactory extends ProductFactory{
>          @Override
>          public Producto getProducto(String id) {
>              Articulo a = new Articulo();
>              a.setId(id);
>              return a;
>          }
>      }
>      abstract class ProductFacade{
>          static ProductFactory unaFact = new ServiceFactory();
>          static ProductFactory otraFact = new ArticuloFactory();
>          public static Producto getProducto(String id){
>              Producto p;
>              if(id.length() > 3){
>                  p = otraFact.getProducto(id);
>              }else{
>                  p = unaFact.getProducto(id);
>              }
>              return p;
>          }
>      }
----- 
##  Patrones, Estructurales, Proxy.
-----

* Ejemplo java patron proxy.
* Ejemplo java proxy de paginas web.

>        pattern.structure.f.ProxyTest.java
>        
----- 
>      package pattern.structure.f;
>      import java.net.*;
>      import java.util.*;
>      import java.io.*;
>      public class ProxyTest {
>          public static void main(String[] args) {
>              try {
>                  PagesProxy pp = new PagesProxy();
>                  pp.getPage("http://www.linkedin.com/in/maximilianou");
>                  pp.getPage("http://www.linkedin.com/company/crear-buenos-aires");
>                  pp.getPage("http://www.ccc.uba.ar");
>                  pp.getPage("http://www.centro27.edu.ar/");
>                  pp.getPage("http://www.linkedin.com/in/maximilianou");
>                  pp.getPage("http://www.linkedin.com/company/crear-buenos-aires");
>                  pp.getPage("http://www.ccc.uba.ar");
>                  pp.getPage("http://www.centro27.edu.ar/");
>                  pp.getPage("http://www.linkedin.com/in/maximilianou");
>                  pp.getPage("http://www.linkedin.com/company/crear-buenos-aires");
>                  pp.getPage("http://www.ccc.uba.ar");
>                  pp.getPage("http://www.centro27.edu.ar/");
>              } catch (Exception e) {
>                  e.printStackTrace();
>              }
>          }
>      }
>      class PagesProxy {
>          private HashMap<String, Page> paginas = new HashMap<String, Page>();
>          public Page getPage(String urlp) throws MalformedURLException, IOException {
>              Page p = paginas.get(urlp);
>              URL url = new URL(urlp);// Cambia siempre
>              URLConnection urlCon = url.openConnection();
>              if (p != null) {
>                  System.out.println("" + urlCon.getLastModified() + ">" + p.getLastUpdate());
>                  if (urlCon.getLastModified() == 0 || urlCon.getLastModified() > p.getLastUpdate()) {
>                      paginas.put(urlp, buscarPagina(urlp, urlCon));
>                  } else { // En este caso no se actualizo la pagina.
>                  }
>              } else {
>                  paginas.put(urlp, buscarPagina(urlp, urlCon));
>              }
>              return p;
>          }
>          public Page buscarPagina(String url, URLConnection urlCon) throws IOException {
>              System.out.println("GET: [" + url + "]");
>              Page p = new Page(url);
>              p.setLastUpdate(urlCon.getLastModified());
>              InputStreamReader isr = null;
>              BufferedReader r = null; 
>              try{
>                  isr = new InputStreamReader(urlCon.getInputStream());
>                  r = new BufferedReader(isr);
>                  if(r.ready()) {//while (r.ready()) {
>                      p.setContenido(p.getContenido() + r.readLine());
>                  }
>              }finally{
>                  r.close();
>                  isr.close();
>              }
>              return p;
>          }
>      }
>      class Page {
>          private String url;
>          public Page(String url) {
>              this.url = url;
>          }
>          private long lastUpdate = 0;
>          private String contenido;
>          public long getLastUpdate() {
>              return lastUpdate;
>          }
>          public void setLastUpdate(long lastUpdate) {
>              this.lastUpdate = lastUpdate;
>          }
>          public String getContenido() {
>              return contenido;
>          }
>          public void setContenido(String contenido) {
>              this.contenido = contenido;
>          }
>      }
----- 
##  Archivo Acceso Directo, RandomAccessFile.
-----
* Ejemplo java acceso directo a posiciones de un archivo.

>      io.db.ArchivoAccesoDirecto.java
>      io.db.TestArchivoAccesoDirecto.java

----- 
>      package io.db;
>      import java.io.FileNotFoundException;
>      import java.io.IOException;
>      import java.io.RandomAccessFile;
>      import java.util.ArrayList;
>      import java.util.logging.Level;
>      import java.util.logging.Logger;
>      /**
>       * @author maximilianou
>       */
>      public class TestArchivoAccesoDirecto {
>      
>          public static void main(String[] args) {
>              System.out.println("[....] TestIndice");
>              ArrayList<String> lista = new ArrayList();
>              lista.add("01@uno@dos");
>              lista.add("03@cientouno@doscientos");
>              lista.add("05@cuarenta@ocho");
>              lista.add("08@siete@setentaytres");
>              System.out.println("[....] TestIndice escribir -------- ");
>              ArchivoAccesoDirecto.escribir(lista, "base.txt");
>              System.out.println("[ OK ] TestIndice escribir ~~~~~~~~ ");
>              ArrayList listaRespuesta = new ArrayList();
>              System.out.println("[....] TestIndice escribir -------- ");
>              ArchivoAccesoDirecto.leer("base.txt", listaRespuesta);
>              System.out.println("[ OK ] TestIndice escribir ~~~~~~~~ ");
>              for (Object s : listaRespuesta) {
>                  System.out.println("[" + s + "]");
>              }
>              System.out.println("[ OK ] TestIndice");
>          }
>      }
----- 
>      package io.db;
>      
>      import java.io.FileNotFoundException;
>      import java.io.IOException;
>      import java.io.RandomAccessFile;
>      import java.util.ArrayList;
>      
>      /** @author maximilianou  */
>      public class ArchivoAccesoDirecto {
>         
>              public static void escribir(ArrayList lista, String nombreArchivo ){
>              RandomAccessFile rf = null;
>              try {
>                  rf = new RandomAccessFile(nombreArchivo, "rw");
>                  rf.writeInt(lista.size());
>                  for (Object s : lista) {
>                      rf.writeUTF(s.toString());
>                  }
>              } catch (FileNotFoundException ex) {
>                  ex.printStackTrace();
>              } catch (IOException ex) {
>                  ex.printStackTrace();
>              } finally {
>                  try {
>                      rf.close();
>                  } catch (IOException ex) {
>                      ex.printStackTrace();
>                  }
>              }
>          }
>          public static void leer( String nombreArchivo, ArrayList lista){
>              RandomAccessFile rf = null;
>              try {
>                  rf = new RandomAccessFile(nombreArchivo, "rw");
>                  int cantidadDatos = rf.readInt();
>                  for(int i = 0; i<cantidadDatos; i++){
>                      lista.add(rf.readUTF());
>                  }
>              } catch (FileNotFoundException ex) {
>                  ex.printStackTrace();
>              } catch (IOException ex) {
>                  ex.printStackTrace();
>              } finally {
>                  try {
>                      rf.close();
>                  } catch (IOException ex) {
>                      ex.printStackTrace();
>                  }
>              }
>          }
>      }
----- 
##  Graficos.
-----
* Ejemplo java Graficos con JFreeChart http://www.jfree.org/jfreechart/ 

>      graficos.TestGraphics.java

----- 
>      package graficos;
>      
>      import org.jfree.chart.ChartFactory;
>      import org.jfree.chart.ChartFrame;
>      import org.jfree.chart.JFreeChart;
>      import org.jfree.chart.plot.PlotOrientation;
>      import org.jfree.data.category.CategoryDataset;
>      import org.jfree.data.category.DefaultCategoryDataset;
>      import org.jfree.data.general.DefaultPieDataset;
>      
>      /**
>       * @author maximilianou
>       */
>      public class TestGraphics {
>      
>          public static void main(String[] args) {
>              System.out.println("[....]TestGraphics");
>      
>              DefaultPieDataset dpdata = new DefaultPieDataset();
>              dpdata.setValue("Julio", 8);
>              dpdata.setValue("Agosto", 14);
>              dpdata.setValue("Septiembre", 27);
>              dpdata.setValue("Octubre", 32);
>              dpdata.setValue("Noviembre", 45);
>              dpdata.setValue("Diciembre", 35);
>              dpdata.setValue("Enero", 2);
>              dpdata.setValue("Febrero", 5);
>              dpdata.setValue("Marzo", 15);
>      
>              JFreeChart chart = ChartFactory.createPieChart(
>                      "Ejemplo Grafico de Torta", dpdata, true, true, true);
>      
>              ChartFrame marco = new ChartFrame("Primer Reporte", chart);
>              marco.pack();
>              marco.setVisible(true);
>      
>              String sitio = "http://www.maximilianou.com.ar";
>              DefaultCategoryDataset cddata = new DefaultCategoryDataset();
>              cddata.setValue(8, sitio, "Julio");
>              cddata.setValue(14, sitio, "Agosto");
>              cddata.setValue(27, sitio, "Septiembre");
>              cddata.setValue(32, sitio, "Octubre");
>              cddata.setValue(45, sitio, "Noviembre");
>              cddata.setValue(35, sitio, "Diciembre");
>              cddata.setValue(2, sitio, "Enero");
>              cddata.setValue(5, sitio, "Febrero");
>              cddata.setValue(15, sitio, "Marzo");
>      
>      
>              JFreeChart chart2 = ChartFactory.createLineChart(
>                      "Primer Grafico De Linea", "Meses", "Personas", cddata, PlotOrientation.VERTICAL, true, true, true);
>      
>              ChartFrame marco2 = new ChartFrame("Segundo Reporte", chart2);
>              marco2.pack();
>              marco2.setVisible(true);
>              marco2.setSize(1200,500);
>      
>      
>              System.out.println("[ OK ]TestGraphics");
>          }
>      }
----- 
##  Export, Utilitario, Herramienta.
-----

* Ejemplo java exportar los archivos README.md
* Ejemplo java exportar el codigo fuente.

>        util.Readme.java
>        
----- 
>      package util;
>      import java.io.*;
>      import java.util.logging.Level;
>      import java.util.logging.Logger;
>      /**
>       * @author maximilianou
>       */
>      public class Readme {
>          String salida = "README.md";
>          String[] archivos = {
>              "src/java/abc/clases01/README.md",
>              "src/java/abc/clases01/TestAviso.java",
>              "src/java/abc/clases01/Aviso.java",
>              "src/java/abc/clases02/README.md",
>              "src/java/abc/clases02/TestAvisoConstructores.java",
>              "src/java/abc/clases02/Aviso.java",
>              "src/java/abc/clases03/README.md",
>              "src/java/abc/clases03/TestAvisoExcepcion.java",
>              "src/java/abc/clases03/Aviso.java",
>              "src/java/abc/clases04/README.md",
>              "src/java/abc/clases04/TestAvisoColeccion.java",
>              "src/java/abc/clases04/Aviso.java",
>              "src/java/abc/clases05/README.md",
>              "src/java/abc/clases05/TestAvisoDiccionario.java",
>              "src/java/abc/clases05/AdministradorAvisos.java",
>              "src/java/abc/clases05/Aviso.java",
>              "src/java/abc/clases05/Categoria.java",
>              "src/java/abc/clases06/README.md",
>              "src/java/abc/clases06/TestDB.java",
>              "src/java/abc/clases06/DB.java",
>              "src/java/abc/clases06/TestAvisoDao.java",
>              "src/java/abc/clases06/AvisoDao.java",
>              "src/java/abc/clases06/Aviso.java",
>              "src/java/pattern/create/a/README.md",
>              "src/java/pattern/create/a/Singleton.java",
>              "src/java/pattern/create/b/README.md",
>              "src/java/pattern/create/b/LazyInitialization.java",
>              "src/java/pattern/create/c/README.md",
>              "src/java/pattern/create/c/ObjectPool.java",
>              "src/java/pattern/create/h/README.md",
>              "src/java/pattern/create/h/AbsFactPat.java",
>              "src/java/pattern/structure/f/README.md",
>              "src/java/pattern/structure/f/ProxyTest.java",
>              "src/java/io/db/README.md",
>              "src/java/io/db/TestArchivoAccesoDirecto.java",
>              "src/java/io/db/ArchivoAccesoDirecto.java",
>              "src/java/graficos/README.md",
>              "src/java/graficos/TestGraphics.java",
>              "src/java/util/README.md",
>              "src/java/util/Readme.java",
>              "src/java/license/README.md"
>          };
>          FileWriter arch = null;
>          BufferedWriter barch = null;
>          public void inicializar() throws IOException {
>              File fs = new File(salida);
>              fs.delete();
>              arch = new FileWriter(salida, true);
>              barch = new BufferedWriter(arch);
>          }
>          public void exportar() {
>              for (String s : archivos) {
>                  String p = "";
>                  if (!s.endsWith(salida)) {
>                      p = ">      ";
>                  }
>                  try {
>                      exportar(s, p);
>                  } catch (Exception ex) {
>                      Logger.getLogger(Readme.class.getName()).log(Level.SEVERE, null, ex);
>                      System.out.println("[ERROR]Readme " + ex.getMessage() + s);
>      
>                  }
>              }
>              try {
>                  barch.close();
>              } catch (IOException ex) {
>                  Logger.getLogger(Readme.class.getName()).log(Level.SEVERE, null, ex);
>              }
>              try {
>                  arch.close();
>              } catch (IOException ex) {
>                  Logger.getLogger(Readme.class.getName()).log(Level.SEVERE, null, ex);
>              }
>          }
>          public void exportar(String archName, String pref) throws FileNotFoundException, IOException {
>              FileReader in = new FileReader(archName);
>              BufferedReader bin = new BufferedReader(in);
>              while (bin.ready()) {
>                  barch.write(pref + bin.readLine());
>                  barch.newLine();
>              }
>              barch.write("----- ");
>              barch.newLine();
>          }
>          public static void main(String[] args) {
>              System.out.println("[..]Readme");
>              Readme r = new Readme();
>              try {
>                  r.inicializar();
>                  r.exportar();
>              } catch (IOException ex) {
>                  Logger.getLogger(Readme.class.getName()).log(Level.SEVERE, null, ex);
>                  System.out.println("[ERROR]Readme");
>              }
>              System.out.println("[ok]Readme");
>          }
>      }
----- 
-----

## The MIT License

Copyright (c) 2009 - 2013 Maximiliano Usich maximilianou@gmail.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the 'Software'), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED 'AS IS', WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

----- 
