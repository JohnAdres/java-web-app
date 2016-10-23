<!--Ajax example-->


<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>

<script type="text/javascript">
function show(){
 var xmlhttp;
 var my_JSON_object = {};
    if(window.XMLHttpRequest){
  
     xmlhttp=new XMLHttpRequest(); 
    }else{
     xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange=function(){
     if (xmlhttp.readyState === 4) {
         if (xmlhttp.status === 200) {
          JSON_object = JSON.parse(xmlhttp.responseText);
          document.getElementById("Name").innerHTML =JSON_object.outer;
          document.getElementById("SurName").innerHTML =JSON_object.lastname;
          } else {
           alert("HTTP error " + xmlhttp.status + ": " + xmlhttp.statusText);
         }
       }
    
    };
 
    xmlhttp.open("GET","index.jsp");
    xmlhttp.send();
   
}
</script>

<body>
  <a href="#" onclick="show()"> Click here to get JSON data from the server side</a>
 
  <font id="Name"></font>
  <font id="SurName"></font>
</html>