<html><head>
    <title>Async Chat</title>
    <script type='text/javascript'>
      function $() { 
          return document.getElementById(arguments[0]); 
      }
      function $F() { 
          return document.getElementById(arguments[0]).value; 
      }
      function getKeyCode(ev) { 
          if (window.event){ 
              return window.event.keyCode;
          }else{ 
              return ev.keyCode;
          } 
      } 
      function xhr(method,uri,body,handler) {
        var req=(window.XMLHttpRequest)?new XMLHttpRequest():new ActiveXObject('Microsoft.XMLHTTP');
        req.onreadystatechange=function() { 
            if (req.readyState==4 && handler) { 
                eval('var o='+req.responseText);
                handler(o);
            } 
        }
        req.open(method,uri,true);
        req.setRequestHeader('Content-Type','application/x-www-form-urlencoded');
        req.send(body);
      };
      function send(action,user,message,handler){
        if (message) message=message.replace('%','%25').replace('&','%26').replace('=','%3D');
        if (user) user=user.replace('%','%25').replace('&','%26').replace('=','%3D');
        xhr('POST','talk','action='+action+'&user='+user+'&message='+message,handler);
      };
      
      var room = {
        join: function(name) {
          this._username=name;
          $('join').className='hidden';
          $('joined').className='';
          $('phrase').focus();
          send('join', room._username,null);
          send('talk', room._username,'has joined!');
          send('poll', room._username,null, room._poll);
        },
        talk: function(text) {
          if (text != null && text.length>0 ){
              send('talk',room._username,text);
          }
        },
        _poll: function(m) {
          //console.debug(m);
          if (m.talk){
            var talk=document.getElementById('talk');
            var spanFrom = document.createElement('span');
            spanFrom.className='from';
            spanFrom.innerHTML=m.from+':&nbsp;';
            var spanText = document.createElement('span');
            spanText.className='text';
            spanText.innerHTML=m.talk;
            var lineBreak = document.createElement('br');
            talk.appendChild(spanFrom);
            talk.appendChild(spanText);
            talk.appendChild(lineBreak);
            talk.scrollTop = talk.scrollHeight - talk.clientHeight;
          }
          if (m.action=='poll')
            send('poll', room._username,null, room._poll);
        },
        _end:''
      };
    </script>
    <style type='text/css'>
    div { border: 0px solid black; }
    div#talk { clear: both; width: 40em; height: 20ex; overflow: auto; background-color: #f0f0f0; padding: 4px; border: 1px solid black; }
    div#input { clear: both; width: 40em; padding: 4px; background-color: #e0e0e0; border: 1px solid black; border-top: 0px }
    input#phrase { width:30em; background-color: #e0f0f0; }
    input#username { width:14em; background-color: #e0f0f0; }
    div.hidden { display: none; }
    span.from { font-weight: bold; }
    span.alert { font-style: italic; }
    </style>
</head><body>
<div id='talk'></div>
<div id='input'>
  <div id='join' >
    Username:&nbsp;<input id='username' type='text'/>
    <input id='joinB' class='button' type='submit' name='join' value='Join'/>
  </div>
  <div id='joined' class='hidden'>
    Chat:&nbsp;<input id='phrase' type='text'/>
    <input id='sendB' class='button' type='submit' name='join' value='Send'/>
  </div>
</div>
<script type='text/javascript'>
$('username').setAttribute('autocomplete','OFF');
$('username').onkeyup = function(ev) { 
    var keyc=getKeyCode(ev); 
    if (keyc==13 || keyc==10) { 
        room.join($F('username')); 
        return false; 
    } 
    return true; 
};
$('joinB').onclick = function(event) { 
    room.join($F('username')); 
    return false; 
};
$('phrase').setAttribute('autocomplete','OFF');
$('phrase').onkeyup = function(ev) {   
    var keyc=getKeyCode(ev); 
    if (keyc==13 || keyc==10) { 
        room.talk($F('phrase')); 
        $('phrase').value=''; 
        return false; 
    } 
    return true; 
};
$('sendB').onclick = function(event) { 
    room.talk($F('phrase')); 
    $('phrase').value=''; 
    return false; 
};
</script>
</body></html>