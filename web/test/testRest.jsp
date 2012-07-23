<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Test Rest!</h1>
        <script src="../js/rest.js" type="text/javascript"></script>
        <script type="text/javascript">
            var restCon = new RestfulResource('../productos');
        </script>
        <div onclick="restCon.retrieve({})">hacer GET</div>
        <div onclick="restCon.update({})">hacer POST</div>
        <div onclick="restCon.create({})">hacer PUT</div>
        <div onclick="restCon.remove({});">hacer DELETE</div>
        <div id="msg">Respuesta:</div>
        <script type="text/javascript">
            function refreshMsg(responseText){
                var lista = document.getElementById("msg");
                lista.innerHTML = responseText;
            }
            restCon.onCreateSuccess = refreshMsg;
            restCon.onUpdateSuccess = refreshMsg;
            restCon.onRemoveSuccess = refreshMsg;
            restCon.onRetrieveSuccess = refreshMsg;
        </script>
    </body>
</html>
