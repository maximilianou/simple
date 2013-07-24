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
##  Constructores, Atributos Obligatorios.
-----

* Ejemplo java de Constructor con los Campos Obligatorios.
* Ejemplo java de Constructor con los Campos Obligatorios, mas opcionales.

>      abc.clases02.Aviso.java
>      abc.clases02.TestAvisoConstructores.java

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
##  Excepcion, Validaciones.
-----

* Ejemplo java validacion que lanza Excepcion. No permite campos invalidos.
* Ejemplo java Excepcion muy simple generica, luego se veran especificas.

>      abc.clases03.Aviso.java
>      abc.clases03.TestAvisoExcepcion.java
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
>      
>              System.out.println(" -- ------------------------------------------ -- ");
>              System.out.println(" -- Instancias u Objetos de la clase Aviso -- ");
>      
>              Aviso avisoTres;
>              try {
>                  // Respeta el precio positivo.
>                  avisoTres = new Aviso("Long Board", 3000, "Ruedas de silicona, ideal para competencias.");
>                  System.out.println(avisoTres.getTitulo());
>                  System.out.println(avisoTres.getPrecio());
>                  System.out.println(avisoTres.getDescripcion());
>              } catch (Exception ex) {
>                  Logger.getLogger(TestAvisoExcepcion.class.getName()).log(Level.SEVERE, null, ex);
>              }
>      
>              System.out.println(" -- ---------------------------------------- -- ");
>      
>              System.out.println(" -- ------------------------------------------ -- ");
>              System.out.println(" -- Instancias u Objetos de la clase Aviso -- ");
>      
>              Aviso avisoCuatro;
>              try {
>                  // Respeta el precio positivo.
>                  avisoCuatro = new Aviso("Long Board", -10, "Ruedas de silicona, ideal para competencias.");
>                  System.out.println(avisoCuatro.getTitulo());
>                  System.out.println(avisoCuatro.getPrecio());
>                  System.out.println(avisoCuatro.getDescripcion());
>                  System.out.println(" -- [ERROR]: Test Fallido -- ");
>              } catch (Exception ex) {
>                  System.out.println(" -- [Ok]: Test Correcto por Validacion -- ");
>                  //ex.printStackTrace();
>                  //Logger.getLogger(TestAvisoExcepcion.class.getName()).log(Level.SEVERE, null, ex);
>              }
>      
>              System.out.println(" -- ---------------------------------------- -- ");
>      
>              System.out.println(" -- ------------------------------------------ -- ");
>              System.out.println(" -- Instancias u Objetos de la clase Aviso -- ");
>      
>              Aviso avisoCinco;
>              try {
>                  // Respeta el precio positivo.
>                  avisoCinco = new Aviso(null, 4444, "Ruedas de silicona, ideal para competencias.");
>                  System.out.println(avisoCinco.getTitulo());
>                  System.out.println(avisoCinco.getPrecio());
>                  System.out.println(avisoCinco.getDescripcion());
>                  System.out.println(" -- [ERROR]: Test Fallido -- ");
>              } catch (Exception ex) {
>                  System.out.println(" -- [Ok]: Test Correcto por Validacion -- ");
>                  //ex.printStackTrace();
>                  //Logger.getLogger(TestAvisoExcepcion.class.getName()).log(Level.SEVERE, null, ex);
>              }
>      
>              System.out.println(" -- ---------------------------------------- -- ");
>      
>              System.out.println(" -- ------------------------------------------ -- ");
>              System.out.println(" -- Instancias u Objetos de la clase Aviso -- ");
>      
>              Aviso avisoSeis;
>              try {
>                  // Respeta el precio positivo.
>                  avisoSeis = new Aviso("", 4444, "Ruedas de silicona, ideal para competencias.");
>                  System.out.println(avisoSeis.getTitulo());
>                  System.out.println(avisoSeis.getPrecio());
>                  System.out.println(avisoSeis.getDescripcion());
>                  System.out.println(" -- [ERROR]: Test Fallido -- ");
>              } catch (Exception ex) {
>                  System.out.println(" -- [Ok]: Test Correcto por Validacion -- ");
>                  //ex.printStackTrace();
>                  //Logger.getLogger(TestAvisoExcepcion.class.getName()).log(Level.SEVERE, null, ex);
>              }
>      
>              System.out.println(" -- ---------------------------------------- -- ");
>      
>      
>              System.out.println("[ OK ]TestAvisoExcepcion --------");
>          }
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
##  Patrones, Crear, Singleton.
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
>              "src/java/abc/clases01/Aviso.java",
>              "src/java/abc/clases01/TestAviso.java",
>              "src/java/abc/clases02/README.md",
>              "src/java/abc/clases02/Aviso.java",
>              "src/java/abc/clases02/TestAvisoConstructores.java",
>              "src/java/abc/clases03/README.md",
>              "src/java/abc/clases03/Aviso.java",
>              "src/java/abc/clases03/TestAvisoExcepcion.java",
>              "src/java/abc/clases04/README.md",
>              "src/java/abc/clases04/Aviso.java",
>              "src/java/abc/clases04/TestAvisoColeccion.java",
>              "src/java/abc/clases05/README.md",
>              "src/java/abc/clases05/Aviso.java",
>              "src/java/abc/clases05/Categoria.java",
>              "src/java/abc/clases05/AdministradorAvisos.java",
>              "src/java/abc/clases05/TestAvisoDiccionario.java",
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
>              "src/java/util/README.md",
>              "src/java/util/Readme.java"
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
