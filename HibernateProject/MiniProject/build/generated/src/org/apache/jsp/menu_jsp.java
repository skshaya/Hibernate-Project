package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import runner.EditFood;
import java.util.List;
import entities.Food;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/getfood.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");


    if (session.getAttribute("id")==null){
      //  response.sendRedirect("login.jsp");
    }


      out.write('\n');
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<title>W3.CSS Template</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Indie+Flower\">\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8/jquery.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"http://code.jquery.com/ui/1.9.0/jquery-ui.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("body, html {height: 100%}\n");
      out.write("h1,h2,h3,h4,h5,h6,.heading,footer {font-family: \"Indie Flower\", \"Roboto\"}\n");
      out.write(".menu {display: none}\n");
      out.write(".bgimg {\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: cover;\n");
      out.write("    background-image: url(\"/w3images/pizza.jpg\");\n");
      out.write("    min-height: 90%;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body bgcolor=\"black\">\n");
      out.write("<!-- Navbar (sit on top) -->\n");
      out.write("<div class=\"w3-top w3-hide-small heading\">\n");
      out.write("  <div class=\"w3-bar w3-xlarge w3-black w3-opacity w3-hover-opacity-off\" id=\"myNavbar\">\n");
      out.write("    <a href=\"#\" class=\"w3-bar-item w3-button\">HOME</a>\n");
      out.write("    <a href=\"#menu\" class=\"w3-bar-item w3-button\">MENU</a>\n");
      out.write("    <a href=\"#about\" class=\"w3-bar-item w3-button\">ABOUT</a>\n");
      out.write("    <a href=\"#googleMap\" class=\"w3-bar-item w3-button\">CONTACT</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"w3-container w3-padding-64 w3-red w3-grayscale w3-xlarge\" id=\"about\">\n");
      out.write("  <div class=\"w3-content\">");
      out.write("\n");
      out.write("    <h1 class=\"w3-center w3-jumbo\" style=\"margin-bottom:64px\">Edit Food Details</h1>\n");
      out.write("    <div id=\"addfood\" style=\"display:none\">\n");
      out.write("            <form action=\"addfood.jsp\" method=\"post\">  \n");
      out.write("            Name:<input type=\"text\" name=\"name\"/><br><br/>  \n");
      out.write("            Portion:<input type=\"text\" name=\"portion\"/><br><br/>  \n");
      out.write("            Price :<input type=\"number\" step=\"0.01\" name=\"price\"/><br><br/>  \n");
      out.write("            <input type=\"submit\" value=\"test\"/>  \n");
      out.write("            </form>  \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8/jquery.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"jquery-3.3.1.min.js\"></script>\n");
      out.write("<script src=\"http://code.jquery.com/ui/1.9.0/jquery-ui.min.js\"></script>\n");
      out.write("        \n");
      out.write("    <table border=\"1\" class=\"w3-table\">\n");
      out.write("        <tr><th>Item Name</th><th>Portion</th><th>Price (Rs.)</th><th></th></tr>\n");
      out.write("    ");

        List<Food> list=EditFood.getAllFood();
        for (Food item : list) {
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(item.getName());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(item.getPortion());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(item.getPrice());
      out.write("</td>\n");
      out.write("            <td><input type=\"button\" value=\"Edit\" onclick=\"showDialog(");
      out.print(item.getFoodId());
      out.write(',');
      out.write('\'');
      out.print(item.getName());
      out.write("','");
      out.print(item.getPortion());
      out.write('\'');
      out.write(',');
      out.print(item.getPrice());
      out.write(")\"/></td>\n");
      out.write("        </tr>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("    </table> \n");
      out.write("    <div style=\"display:none;\" id=\"popup\"><form action=\"updatefood.jsp\" method=\"post\">\n");
      out.write("        <table>    \n");
      out.write("            <tr><td>Name</td><td><input type=\"number\" id=\"name\" name=\"foodId\" value=1/></td></tr>\n");
      out.write("            <tr><td>Name</td><td><input type=\"text\" id=\"name\" name=\"name\" value=\"name\"/></td></tr>\n");
      out.write("            <tr><td>Portion</td><td><input type=\"text\" id=\"por\" name=\"portion\" value=\"portion\"/></td></tr>\n");
      out.write("            <tr><td>Price</td><td><input type=\"number\" step=\"0.01\" id=\"price\" name=\"price\" value=\"\"/></td></tr>\n");
      out.write("            <tr><td colspan=\"2\"><input type=\"button\" value=\"kek\" id=\"button\" onclick=\"myfunc()\"/></td></tr>\n");
      out.write("            <input type=\"submit\" value=\"submit\" name=\"submit\"/>\n");
      out.write("        </table>   \n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    gid=0;\n");
      out.write("   function myfunc(){\n");
      out.write("        name=$(\"name\").val();\n");
      out.write("        portion=$(\"por\").val();\n");
      out.write("        price=$(\"price\").val();\n");
      out.write("        alert(\"hello\");\n");
      out.write("        $.ajax({\n");
      out.write("            url: \"updatefood.jsp\",\n");
      out.write("            data: { \n");
      out.write("                \"foodId\":gid,\n");
      out.write("                \"name\": name, \n");
      out.write("               \"portion\": portion, \n");
      out.write("                \"price\": price\n");
      out.write("            },\n");
      out.write("            cache: false,\n");
      out.write("            type: \"POST\",\n");
      out.write("            success: function(response) {\n");
      out.write("                alert(response+\"r\");\n");
      out.write("            },\n");
      out.write("            error: function(xhr) {\n");
      out.write("                alert(xhr+\"x\");\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function showDialog(id,name,portion,price){\n");
      out.write("        gid=id;\n");
      out.write("        alert(gid);\n");
      out.write("        document.getElementById(\"name\").value=name;\n");
      out.write("        document.getElementById(\"por\").value=portion;\n");
      out.write("        document.getElementById(\"price\").value=price;\n");
      out.write("        document.getElementById(\"popup\").style=\"dispay:block\";\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("</script>");
      out.write("\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("<!-- Footer --><br/>\n");
      out.write("<footer class=\"w3-container w3-black w3-large\">\n");
      out.write("  <p style=\"text-align:center;\">&copy;<b>RMS powered by CST Group 10</b></p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("$(window).scroll(function() {\n");
      out.write("   if(!$(window).scrollTop() + $(window).height() == $(document).height()) {\n");
      out.write("       $(\"footer\").addClass('footer');\n");
      out.write("   }\n");
      out.write("});\n");
      out.write("\n");
      out.write("if($(window).height() >= $(document).height()) {\n");
      out.write("\t\t$(\"footer\").addClass('footer');\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
