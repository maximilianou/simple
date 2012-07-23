<%-- 
    Document   : testMoo
    Created on : Jul 15, 2012, 9:09:01 PM
    Author     : maximilianou
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Test Rest! JQ</h1>
        <script src="../js/mootools-core-1.4.5-full-nocompat.js" type="text/javascript"></script>
        <script type="text/javascript">
var restCon={};
restCon.remove = function(info){            
  $.ajax({
    type: "DELETE", url: "../productos", data: info
  }).done(function( msg ) {
    refreshMsg( msg );
  });
}
restCon.retrieve = function(info){            
  $.ajax({
    type: "GET", url: "../productos", data: info
  }).done(function( msg ) {
    refreshMsg( msg );
  });
}
restCon.update = function(info){            
  $.ajax({
    type: "POST", url: "../productos", data: info
  }).done(function( msg ) {
    refreshMsg( msg );
  });
}
restCon.create = function(info){            
  $.ajax({
    type: "PUT", url: "../productos", data: info
  }).done(function( msg ) {
    refreshMsg( msg );
  });
}

var myElement = document.id('myElement');
 
var myRequest = new Request({
    url: 'getMyText.php',
    method: 'get',
    onRequest: function(){
        myElement.set('text', 'loading...');
    },
    onSuccess: function(responseText){
        refreshMsg( responseText );    
    },
    onFailure: function(){
        myElement.set('text', 'Sorry, your request failed :(');
    }
});
 
document.id('myLink').addEvent('click', function(event){
    event.stop();
    myRequest.send('userid=' + this.get('data-userid'));
});
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
        </script>
    </body>
</html>
