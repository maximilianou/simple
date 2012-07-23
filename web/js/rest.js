function RestfulResource(resource_url){
 
    this.resource_url = resource_url;
 
    this.xmlhttp = new XMLHttpRequest();
 
    /**
    * Get the resource or a list of resources calling the RESTful web service with the GET http method
    * @param id The id of the resource, if is null a list of resources will be retrieved.
    */
    this.retrieve = function(id){
        var url = this.resource_url
        if(id != null)
            url = this.resource_url.concat("/"+id)
 
        var self = this;
        this.xmlhttp.onreadystatechange=function(){
            if (self.xmlhttp.readyState==4){
                if (self.xmlhttp.status==200){
                    self.onRetrieveSuccess.call(self,self.xmlhttp.responseText);
                }else{
                    self.onRetrieveError.call(self,self.xmlhttp.statusText);
                }
            }
        }
        this.xmlhttp.open("GET",url,true);
        this.xmlhttp.send(null);
    }
 
    this.onRetrieveSuccess = function(responseText){
        alert("onRetrieveSuccess method "+responseText);
    }
 
    this.onRetrieveError = function(statusText){
        alert("onRetrieveError method "+statusText);
    }
 
    this.create = function(jsonObject){
        var jsonString = JSON.stringify(jsonObject);
        var self = this;
        this.xmlhttp.onreadystatechange=function(){
            if (self.xmlhttp.readyState==4){
                if (self.xmlhttp.status==200){
                    self.onCreateSuccess.call(self,self.xmlhttp.responseText);
                }else{
                    self.onCreateError.call(self,self.xmlhttp.statusText);
                }
            }
        }
        this.xmlhttp.open("PUT",this.resource_url+"/"+jsonString,true);
        this.xmlhttp.setRequestHeader("Content-type", "application/json");
        this.xmlhttp.setRequestHeader("Content-length", jsonString.length);
        this.xmlhttp.setRequestHeader("Connection", "close");
        this.xmlhttp.send(jsonString);
    }
 
    this.onCreateSuccess = function(responseText){
        alert("onCreateSuccess method "+responseText);
    }
 
    this.onCreateError = function(statusText){
        alert("onCreateError method "+statusText);
    }
 
    this.update = function(jsonObject){
        var jsonString = JSON.stringify(jsonObject);
        var self = this;
        this.xmlhttp.onreadystatechange=function(){
            if (self.xmlhttp.readyState==4){
                if (self.xmlhttp.status==200){
                    self.onUpdateSuccess.call(self,self.xmlhttp.responseText);
                }else{
                    self.onUpdateError.call(self,self.xmlhttp.statusText);
                }
            }
        }
        this.xmlhttp.open("POST",this.resource_url,true);
        this.xmlhttp.setRequestHeader("Content-type", "application/json");
        this.xmlhttp.setRequestHeader("Content-length", jsonString.length);
        this.xmlhttp.setRequestHeader("Connection", "close");
        this.xmlhttp.send(jsonString);
    }
 
    this.onUpdateSuccess = function(responseText){
        alert("onUpdateSuccess method "+responseText);
    }
 
    this.onUpdateError = function(statusText){
        alert("onUpdateError method "+statusText);
    }
 
    this.remove = function(id){
        var url = this.resource_url.concat("/"+id);
        var self = this;
        this.xmlhttp.onreadystatechange=function(){
            if (self.xmlhttp.readyState==4){
                if (self.xmlhttp.status==200){
                    self.onRemoveSuccess.call(self,self.xmlhttp.responseText);
                }else{
                    self.onRemoveError.call(self,self.xmlhttp.statusText);
                }
            }
        }
        this.xmlhttp.open("DELETE",url,true);
        this.xmlhttp.send(null);
    }
 
    this.onRemoveSuccess = function(responseText){
        alert("onRemoveSuccess method "+responseText);
    }
 
    this.onRemoveError = function(statusText){
        alert("onRemoveError method "+statusText);
    }
 
}

