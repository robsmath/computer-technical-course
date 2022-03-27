<%-- 
    Document   : index
    Created on : 12/07/2015, 11:39:52
    Author     : Robson
--%>

<%@page import="codigos.metodos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script>
 function SomenteNumero( e){  
    var tecla=(window.event)?event.keyCode:e.which;   
    if((tecla>47 && tecla<58)) return true;
    else{
        if (tecla==8 || tecla==0) return true;
    else  return false;
    }
}
</script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
        <style>
            body{
                font-family: century gothic;
                color: #fff;
                font-size:30px;
                background-image: url(imagens/background.jpg);
                
            }
            
            input[type=submit]{
                width:60px;
                height: 60px;
                background:#0099CC;
                font-size:30px;
                font-family: century gothic;
                border-radius:10px;
                border:2px solid white;
              
            } 
            input[type=text]{
                border-radius:10px;
                border:4px solid #0099CC;
                padding-top: 10px;
                margin:10px;
                font-family: century gothic;
                text-align: center;
                font-size: 30px;
                width: 350px;
            }
            h1{
                font-family: century gothic;
                color: #0099CC;
                
            }
            #pagina{
                background:#000000;
                border: 6px solid #0099CC;
                width:600px;
                height: 600px;
                border-radius:20px;
            }
            
        </style>
    </head>
    <body>
        <%
            double result=0;
           try{
                result= Double.parseDouble(request.getParameter("result"));
           }catch(NullPointerException e){
               
               }
            %>
    <center><br/>
        <div id="pagina">
    <center>
       <h1> Calculadora </h1>
            Digite o primeiro número: <br/>
            <form name="calc" action="calculadora" method="get">
             <input type="text" size="50" name="primeiro" required onkeypress='return SomenteNumero(event)'/> <br/>
            Digite o segundo número: <br/>
            <input type="text" size="50" name="segundo" required onkeypress='return SomenteNumero(event)' /> <br/>
            <input type="submit" name="operacao" value="+"/>
            <input type="submit" name="operacao" value="-"/>
            <input type="submit" name="operacao" value="x"/>
            <input type="submit" name="operacao" value="/"/>
            </form><br />
             Resultado: <br/>
             <input type="text" size="50" name="resultado" value="<%=result%>" onkeypress='return SomenteNumero(event)'/>
    </center>
    </center>
        </div>
    </body>
</html>
