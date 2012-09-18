<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editor</title>
    </head>
    <body>
        <h1>Editor</h1>
        <form method="" action="">
            <input type="text" name="clase" value="" />
            <input type="text" name="metodo" value="" />
            <textarea name="texto" id="texto" rows="30" cols="100">
                package scripting;
                public class Calculator { 
                  public void testAdd() { 
                    System.out.println(200+300); 
                  } 
                  public static void main(String[] args) { 
                    Calculator cal = new Calculator(); 
                    cal.testAdd(); 
                    System.out.println(777); 
                  } 
                } 

            </textarea>
            <br/>
            <input type="button" value="Activar" id="comando"/>
        </form>
        <div id="out" style="background-color: #003300;">
        </div>
        <div id="err" style="background-color: #330000;">
        </div>
    </body>
</html>
