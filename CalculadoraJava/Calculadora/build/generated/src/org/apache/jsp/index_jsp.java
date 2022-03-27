package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import codigos.metodos;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script>\n");
      out.write(" function SomenteNumero( e){  \n");
      out.write("    var tecla=(window.event)?event.keyCode:e.which;   \n");
      out.write("    if((tecla>47 && tecla<58)) return true;\n");
      out.write("    else{\n");
      out.write("        if (tecla==8 || tecla==0) return true;\n");
      out.write("    else  return false;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Calculadora</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                font-family: century gothic;\n");
      out.write("                color: #fff;\n");
      out.write("                font-size:30px;\n");
      out.write("                background-image: url(imagens/background.jpg);\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input[type=submit]{\n");
      out.write("                width:60px;\n");
      out.write("                height: 60px;\n");
      out.write("                background:#0099CC;\n");
      out.write("                font-size:30px;\n");
      out.write("                font-family: century gothic;\n");
      out.write("                border-radius:10px;\n");
      out.write("                border:2px solid white;\n");
      out.write("              \n");
      out.write("            } \n");
      out.write("            input[type=text]{\n");
      out.write("                border-radius:10px;\n");
      out.write("                border:4px solid #0099CC;\n");
      out.write("                padding-top: 10px;\n");
      out.write("                margin:10px;\n");
      out.write("                font-family: century gothic;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 30px;\n");
      out.write("                width: 350px;\n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                font-family: century gothic;\n");
      out.write("                color: #0099CC;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            #pagina{\n");
      out.write("                background:#000000;\n");
      out.write("                border: 6px solid #0099CC;\n");
      out.write("                width:600px;\n");
      out.write("                height: 600px;\n");
      out.write("                border-radius:20px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            double result=0;
           try{
                result= Double.parseDouble(request.getParameter("result"));
           }catch(NullPointerException e){
               
               }
            
      out.write("\n");
      out.write("    <center><br/>\n");
      out.write("        <div id=\"pagina\">\n");
      out.write("    <center>\n");
      out.write("       <h1> Calculadora </h1>\n");
      out.write("            Digite o primeiro número: <br/>\n");
      out.write("            <form name=\"calc\" action=\"calculadora\" method=\"get\">\n");
      out.write("             <input type=\"text\" size=\"50\" name=\"primeiro\" required onkeypress='return SomenteNumero(event)'/> <br/>\n");
      out.write("            Digite o segundo número: <br/>\n");
      out.write("            <input type=\"text\" size=\"50\" name=\"segundo\" required onkeypress='return SomenteNumero(event)' /> <br/>\n");
      out.write("            <input type=\"submit\" name=\"operacao\" value=\"+\"/>\n");
      out.write("            <input type=\"submit\" name=\"operacao\" value=\"-\"/>\n");
      out.write("            <input type=\"submit\" name=\"operacao\" value=\"x\"/>\n");
      out.write("            <input type=\"submit\" name=\"operacao\" value=\"/\"/>\n");
      out.write("            </form><br />\n");
      out.write("             Resultado: <br/>\n");
      out.write("             <input type=\"text\" size=\"50\" name=\"resultado\" value=\"");
      out.print(result);
      out.write("\" onkeypress='return SomenteNumero(event)'/>\n");
      out.write("    </center>\n");
      out.write("    </center>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
