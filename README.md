##  Clases, Objetos o Instancias. Encapsular.
-----
>      abc.clases01.Aviso.java
>      abc.clases01.TestAviso.java

* Ejemplo java de como crear una clase.
* Ejemplo java de como crear un atritubo a la clase.
* Ejemplo java de como crear metodos.
* Ejemplo java de Encapsulamiento de los atributos, con los metodos getters y setters.

----- 
>      package abc.clases01;
>      
>      /**
>       *
>       * @author maximilianou
>       */
>      public class Aviso {
>          private String titulo;
>          private String descripcion;
>          private float precio;
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
>          public void setTitulo(String titulo) {
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
>          public void setPrecio(float precio) {
>              this.precio = precio;
>          }
>      
>      }
----- 
>      package abc.clases01;
>      
>      import abc.clases01.Aviso;
>      
>      /**
>       *
>       * @author maximilianou
>       */
>      public class TestAviso {
>          public static void main(String [] args){
>              System.out.println("[..] "+TestAviso.class.getCanonicalName()+" --------");
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
>              System.out.println("[Ok] "+TestAviso.class.getCanonicalName()+" --------");
>          }
>      }
----- 
##  Constructores, Atributos Obligatorios.
-----
>      abc.clases02.Aviso.java
>      abc.clases02.TestAvisoConstructores.java

* Ejemplo java de Constructor con los Campos Obligatorios.
* Ejemplo java de Constructor con los Campos Obligatorios, mas opcionales.

----- 
>      /*
>       * To change this template, choose Tools | Templates
>       * and open the template in the editor.
>       */
>      package abc.clases02;
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
>          public void setTitulo(String titulo) {
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
>          public void setPrecio(float precio) {
>              this.precio = precio;
>          }
>      }
----- 
>      /*
>       * To change this template, choose Tools | Templates
>       * and open the template in the editor.
>       */
>      package abc.clases02;
>      
>      import abc.clases02.Aviso;
>      
>      /**
>       *
>       * @author maximilianou
>       */
>      public class TestAvisoConstructores {
>             public static void main(String [] args){
>              System.out.println("[..] "+TestAvisoConstructores.class.getCanonicalName()+" --------");
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
>              System.out.println("[Ok] "+TestAvisoConstructores.class.getCanonicalName()+" --------");
>          }
>       
>      }
----- 
##  Excepcion, Validaciones.
-----
>      abc.clases03.Aviso.java
>      abc.clases03.TestAvisoExcepcion.java

* Ejemplo java validacion que lanza Excepcion. No permite campos invalidos.
* Ejemplo java Excepcion muy simple generica, luego se veran especificas.

----- 
>      /*
>       * To change this template, choose Tools | Templates
>       * and open the template in the editor.
>       */
>      package abc.clases03;
>      
>      /**
>       *
>       * @author maximilianou
>       */
>      public class Aviso {
>              private String titulo;
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
>      }
----- 
>      /*
>       * To change this template, choose Tools | Templates
>       * and open the template in the editor.
>       */
>      package abc.clases03;
>      
>      import abc.clases03.Aviso;
>      import java.util.logging.Level;
>      import java.util.logging.Logger;
>      
>      /**
>       *
>       * @author maximilianou
>       */
>      public class TestAvisoExcepcion {
>      
>          public static void main(String[] args) {
>              System.out.println("[..] " + TestAvisoExcepcion.class.getCanonicalName() + " --------");
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
>              System.out.println("[Ok] " + TestAvisoExcepcion.class.getCanonicalName() + " --------");
>          }
>      }
----- 
##  Lista Coleccion, Cargar, recorrer y Vaciar.
-----
>      abc.clases04.Aviso.java
>      abc.clases04.TestAvisoColeccion.java

* Ejemplo java una coleccion, una lista particularmente.
* Ejemplo java de como llenar una coleccion.
* Ejemplo java de como recorrer una coleccion.
* Ejemplo java de como vaciar una coleccion.

----- 
>      package abc.clases04;
>      
>      /**
>       *
>       * @author maximilianou
>       */
>      public class Aviso {
>          
>                  private String titulo;
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
>      
>      
>          
>      }
----- 
>      package abc.clases04;
>      
>      import java.util.ArrayList;
>      import java.util.logging.Level;
>      import java.util.logging.Logger;
>      
>      /**
>       *
>       * @author maximilianou
>       */
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
