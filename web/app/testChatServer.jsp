<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="" method="">
	Desde <input type="text" name="desde" id="desde"><br />
	Hasta <input type="text" name="hasta" id="hasta"><br />
	Mensaje<input type="text" name="mensaje" id="msg"><br />
	<input type="button" name="enviar" value="Enviar" id="boton"><br />
</form>

<div id="respuestas"></div>
<div id="status"></div>

<script type="text/javascript">
	var xhr1;
	function enviarAjax() {
		var hasta = document.getElementById("hasta").value;
		var msg = document.getElementById("msg").value;
		xhr1 = new XMLHttpRequest();		
		xhr1.open("GET", "enviar.jsp?hasta="+hasta+"&msg="+msg);
		xhr1.onreadystatechange = callbackEnviar;
		xhr1.send(null);				
	}
	function callbackEnviar() {	
		if( xhr1.readyState == 4 && xhr1.status == 200 ){
			var st = document.getElementById("status");
			st.innerHTML += xhr1.responseText+"<br/>";
		}
	}
	var xhr2;
	
	function recibirAjax() {
		var desde = document.getElementById("desde").value;
		xhr2 = new XMLHttpRequest();
		xhr2.open("GET", "recibir.jsp?desde="+desde);
		xhr2.onreadystatechange = callbackRecibir;
		xhr2.send(null);
	}
	var lasRespuestas = document.getElementById("respuestas");
	
	function callbackRecibir() {
		if (xhr2.readyState == 4 && xhr2.status== 200) {
			lasRespuestas.innerHTML += xhr2.responseText+ "<br/>"; 
		}		
	}

	var elBoton = document.getElementById("boton");
	elBoton.setAttribute("onClick","enviarAjax();");
	var intervalo = setInterval("recibirAjax();",4000);
</script>
</body>
</html>