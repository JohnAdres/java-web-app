<%-- 
    Document   : headers
    Created on : Sep 25, 2016, 8:10:16 AM
    Author     : Hasan
--%>
<%@attribute  name = "title"%>
<html>
    <head>
        <title>${title}</title>
        <style>
            body{
                margin:0;
                padding:0;
            }
            #header{
                background-size: cover;
                background: lightblue;
                height:150px;
                border-bottom: 4px solid gray;
              
            }
            h1{
                text-align: center;
                vertical-align: middle;
                line-height: 90px;       /* the same as your div height */
                font-size: 50px;

            }
           
        </style>
    </head>
    <body>

        <div id ="header"><h1>President Java Bank</h1></div>



