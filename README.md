##  Clases, Objetos o Instancias. Encapsular.
-----
>      abc.clases01.Aviso.java
>      abc.clases01.TestAviso.java

* Ejemplo java de como crear una clase.
* Ejemplo java de como crear un atritubo a la clase.
* Ejemplo java de como crear metodos.
* Ejemplo java de Encapsulamiento de los atributos, con los metodos getters y setters.
>   package abc.clases01;
>   
>   /**
>    *
>    * @author maximilianou
>    */
>   public class Aviso {
>       private String titulo;
>       private String descripcion;
>       private float precio;
>   
>       /**
>        * @return the titulo
>        */
>       public String getTitulo() {
>           return titulo;
>       }
>   
>       /**
>        * @param titulo the titulo to set
>        */
>       public void setTitulo(String titulo) {
>           this.titulo = titulo;
>       }
>   
>       /**
>        * @return the descripcion
>        */
>       public String getDescripcion() {
>           return descripcion;
>       }
>   
>       /**
>        * @param descripcion the descripcion to set
>        */
>       public void setDescripcion(String descripcion) {
>           this.descripcion = descripcion;
>       }
>   
>       /**
>        * @return the precio
>        */
>       public float getPrecio() {
>           return precio;
>       }
>   
>       /**
>        * @param precio the precio to set
>        */
>       public void setPrecio(float precio) {
>           this.precio = precio;
>       }
>   
>   }
>   package abc.clases01;
>   
>   import abc.clases01.Aviso;
>   
>   /**
>    *
>    * @author maximilianou
>    */
>   public class TestAviso {
>       public static void main(String [] args){
>           System.out.println("[..] "+TestAviso.class.getCanonicalName()+" --------");
>           
>           System.out.println(" -- ---------------------------------------- -- ");
>           System.out.println(" -- Una Instancia u Objeto de la clase Aviso -- ");
>           Aviso avisoUno = new Aviso();
>           avisoUno.setTitulo("Bicicleta Plegable");
>           avisoUno.setDescripcion("Bicicleta Plegable, 12 kg, roja, Dahon Eco 3.");
>           avisoUno.setPrecio(2000);
>           
>           System.out.println(avisoUno.getTitulo());
>           System.out.println(avisoUno.getPrecio());
>           System.out.println(avisoUno.getDescripcion());
>           System.out.println(" -- ---------------------------------------- -- ");
>           
>           System.out.println(" -- ------------------------------------------ -- ");
>           System.out.println(" -- Dos Instancias u Objetos de la clase Aviso -- ");
>           Aviso avisoDos = new Aviso();
>           avisoDos.setTitulo("Mountain Bike");
>           avisoDos.setDescripcion("Bicicleta profesional, 7kg, 21 cambios.");
>           avisoDos.setPrecio(7000);
>           
>           System.out.println(avisoDos.getTitulo());
>           System.out.println(avisoDos.getPrecio());
>           System.out.println(avisoDos.getDescripcion());
>           System.out.println(" -- ---------------------------------------- -- ");
>   
>           System.out.println("[Ok] "+TestAviso.class.getCanonicalName()+" --------");
>       }
>   }
##  Constructores, Atributos Obligatorios.
-----
>      abc.clases02.Aviso.java
>      abc.clases02.TestAvisoConstructores.java

* Ejemplo java de Constructor con los Campos Obligatorios.
* Ejemplo java de Constructor con los Campos Obligatorios, mas opcionales.

>   /*
>    * To change this template, choose Tools | Templates
>    * and open the template in the editor.
>    */
>   package abc.clases02;
>   
>   /**
>    *
>    * @author maximilianou
>    */
>   public class Aviso {
>   
>       private String titulo;
>       private String descripcion;
>       private float precio;
>   
>       public Aviso(String titulo, float precio){
>           this.setPrecio(precio);
>           this.setTitulo(titulo);
>       }
>       public Aviso(String titulo, float precio, String descripcion){
>           this.setPrecio(precio);
>           this.setTitulo(titulo);
>           this.setDescripcion(descripcion);
>       }
>       
>       /**
>        * @return the titulo
>        */
>       public String getTitulo() {
>           return titulo;
>       }
>   
>       /**
>        * @param titulo the titulo to set
>        */
>       public void setTitulo(String titulo) {
>           this.titulo = titulo;
>       }
>   
>       /**
>        * @return the descripcion
>        */
>       public String getDescripcion() {
>           return descripcion;
>       }
>   
>       /**
>        * @param descripcion the descripcion to set
>        */
>       public void setDescripcion(String descripcion) {
>           this.descripcion = descripcion;
>       }
>   
>       /**
>        * @return the precio
>        */
>       public float getPrecio() {
>           return precio;
>       }
>   
>       /**
>        * @param precio the precio to set
>        */
>       public void setPrecio(float precio) {
>           this.precio = precio;
>       }
>   }
>   /*
>    * To change this template, choose Tools | Templates
>    * and open the template in the editor.
>    */
>   package abc.clases02;
>   
>   import abc.clases02.Aviso;
>   
>   /**
>    *
>    * @author maximilianou
>    */
>   public class TestAvisoConstructores {
>          public static void main(String [] args){
>           System.out.println("[..] "+TestAvisoConstructores.class.getCanonicalName()+" --------");
>           
>           System.out.println(" -- ---------------------------------------- -- ");
>           System.out.println(" -- Una Instancia u Objeto de la clase Aviso -- ");
>   // No compila sin parametros, de forma de asegurarnos campos obligatorios.
>   //        Aviso avisoUno = new Aviso();
>   // Solo se construyen instancias con campos obligatorios
>           Aviso avisoUno = new Aviso("Bicicleta Plegable", 2000);
>           // atributo opcional descripcion
>           avisoUno.setDescripcion("Bicicleta Plegable, 12 kg, roja, Dahon Eco 3.");
>           
>           System.out.println(avisoUno.getTitulo());
>           System.out.println(avisoUno.getPrecio());
>           System.out.println(avisoUno.getDescripcion());
>           System.out.println(" -- ---------------------------------------- -- ");
>           
>           System.out.println(" -- ------------------------------------------ -- ");
>           System.out.println(" -- Dos Instancias u Objetos de la clase Aviso -- ");
>           
>   // No compila sin parametros, de forma de asegurarnos campos obligatorios.
>   //        Aviso avisoDos = new Aviso();
>   // Solo se construyen instancias con campos obligatorios
>           Aviso avisoDos = new Aviso("Mountain Bike", 7000);
>           // atributo opcional descripcion
>           avisoDos.setDescripcion("Bicicleta profesional, 7kg, 21 cambios.");
>           
>           System.out.println(avisoDos.getTitulo());
>           System.out.println(avisoDos.getPrecio());
>           System.out.println(avisoDos.getDescripcion());
>           System.out.println(" -- ---------------------------------------- -- ");
>   
>           System.out.println(" -- ------------------------------------------ -- ");
>           System.out.println(" -- Tres Instancias u Objetos de la clase Aviso -- ");
>           
>   // Se construyen instancias con campos obligatorios, y con opcionales como agregado.
>           Aviso avisoTres = new Aviso("Long Board", 3000, "Ruedas de silicona, ideal para competencias.");
>           
>           System.out.println(avisoTres.getTitulo());
>           System.out.println(avisoTres.getPrecio());
>           System.out.println(avisoTres.getDescripcion());
>           System.out.println(" -- ---------------------------------------- -- ");
>   
>           System.out.println("[Ok] "+TestAvisoConstructores.class.getCanonicalName()+" --------");
>       }
>    
>   }
##  Excepcion, Validaciones.
-----
>      abc.clases03.Aviso.java
>      abc.clases03.TestAvisoExcepcion.java

* Ejemplo java validacion que lanza Excepcion. No permite campos invalidos.
* Ejemplo java Excepcion muy simple generica, luego se veran especificas.

##  Lista Coleccion, Cargar, recorrer y Vaciar.
-----
>      abc.clases04.Aviso.java
>      abc.clases04.TestAvisoColeccion.java

* Ejemplo java una coleccion, una lista particularmente.
* Ejemplo java de como llenar una coleccion.
* Ejemplo java de como recorrer una coleccion.
* Ejemplo java de como vaciar una coleccion.

