package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("              .headertheme\n");
      out.write("        {\n");
      out.write("              background-color:rgb(13,71,161);\n");
      out.write("               width:100%;\n");
      out.write("               height:180px;\n");
      out.write("               background-repeat:no-repeat;       \n");
      out.write("        }\n");
      out.write("        a{\n");
      out.write("            color:white;\n");
      out.write("            text-decoration: none;\n");
      out.write("            font-size:14px;\n");
      out.write("            font-family: arial;\n");
      out.write("            margin-top:-10px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        a:hover\n");
      out.write("        {\n");
      out.write("             background-color:graytext;\n");
      out.write("        }\n");
      out.write("         .a{\n");
      out.write("            color:whitesmoke;\n");
      out.write("            text-decoration: none;\n");
      out.write("            font-size:10px;\n");
      out.write("            font-family: arial;\n");
      out.write("           font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .a :hover\n");
      out.write("        {\n");
      out.write("            background-color:red;\n");
      out.write("        }\n");
      out.write("        .headerthemetwo\n");
      out.write("        {\n");
      out.write("           background-image: url('fefe.gif');\n");
      out.write("           margin-right: 50px;\n");
      out.write("            width:20000px;\n");
      out.write("            height:800px; \n");
      out.write("            margin-top:-45px;\n");
      out.write("            margin-left:120px;\n");
      out.write("            background-repeat:no-repeat;\n");
      out.write("        }\n");
      out.write("        .m\n");
      out.write("        {\n");
      out.write("          margin-top:100px;  \n");
      out.write("        }\n");
      out.write("        .sitetitle{\n");
      out.write("            font-family: sans-serif;\n");
      out.write("            color:white;\n");
      out.write("            font-weight: bold;\n");
      out.write("            font-size: 40px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("      .centerdiv{\n");
      out.write("            background:\trgb(230,230,250);\n");
      out.write("               width:100%;\n");
      out.write("               height:900px;\n");
      out.write("               border-radius: 10px;\n");
      out.write("       \n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"headertheme\">\n");
      out.write("            <div style=\"margin-top:-10px\">\n");
      out.write("      <table border=\"0\" width=\"90%\" align=\"center\" border=\"inset\" >\n");
      out.write("            <tr>\n");
      out.write("                <td width=20% class=\"a\"><a href=\"\">+91 9479561330</td>\n");
      out.write("                <td><img src=\"mailboxf.png\" width=\"25\" height=\"25px\" ></td>\n");
      out.write("                <td width=60% ><a href=\"mailto:\":>Info@gmail.com</a></td>\n");
      out.write("                <td width=10%><a href=\"login.jsp\">LOGIN</a></td>\n");
      out.write("                <td><a href=\"register.jsp\"> REGISTER </a></td>\n");
      out.write("            </tr>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("             \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("     \n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                     <td width=5% border=\"0\"></td>\n");
      out.write("                    <td class=\"m\"><img src=\"logo.PNG\" width=\"200px\" height=\"130px\"></td>                 \n");
      out.write("                    \n");
      out.write("                </tr></table>\n");
      out.write("           <div style=\"margin-top:-90px\">\n");
      out.write("               <form action=\"regcode.jsp\">\n");
      out.write("        <table border=\"0\" width=\"100%\"  >\n");
      out.write("            <tr>\n");
      out.write("               <td class=\"sitetitle\"> Registration Form </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("               </div>\n");
      out.write("        <div class=\"centerdiv\">\n");
      out.write("        <table align=\"center\" cellspacing=\"20\" border=\"1\" style=\" margintop:500px;padding-left:50px;\">\n");
      out.write("            <tr>\n");
      out.write("                <td> Choose an Option : </td>\n");
      out.write("                <td><select name=\"regop\">\n");
      out.write("                        <option>1. Broker</option>\n");
      out.write("                        <option>2. Local Guide</option>\n");
      out.write("                        <option>3. Helper</option>\n");
      out.write("                        <option>4. Food Producing Agency</option>\n");
      out.write("                        <option>5. Transport Agency</option>\n");
      out.write("                    </select>\n");
      out.write("                        </td>\n");
      out.write("                        <tr>\n");
      out.write("            <td>FULL NAME</td>\n");
      out.write("            <td><input type=\"text\" name=\"fNm\" placeholder=\"enter full name\"></td>\n");
      out.write("        </tr>\n");
      out.write("         <tr>\n");
      out.write("            <td>ADDRESS</td>\n");
      out.write("            <td><textarea name=\"address\" placeholder=\"enter address\"></textarea> </td>\n");
      out.write("       </tr>  \n");
      out.write("       <tr>\n");
      out.write("       <td>Contact NO 1</td>\n");
      out.write("       <td><input type=\"text\" name=\"cn1\" placeholder=\"enter Contact Number 1\"></textarea> </td>\n");
      out.write("       </tr> \n");
      out.write("       <tr>\n");
      out.write("       <td>Contact NO 2</td>\n");
      out.write("       <td><input type=\"text\" name=\"cn2\" placeholder=\"enter Contact Number 2\"></textarea> </td>\n");
      out.write("       </tr> \n");
      out.write("       <tr>\n");
      out.write("       <td>City</td>\n");
      out.write("                   <td><select name=\"city\">\n");
      out.write("                          <option>select city</option> \n");
      out.write("                          <option>Indore</option>\n");
      out.write("                          <option>Bhopal</option>\n");
      out.write("                          <option>Pune</option>\n");
      out.write("                       </select></td></tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>DOB</td>\n");
      out.write("            <td><input type=\"date\" name=\"dOB\"></td>\n");
      out.write("        </tr>\n");
      out.write("         <tr align=\"center\">\n");
      out.write("        <td colspan=\"2\">\n");
      out.write("        <input type=\"submit\" value=\"Register\">\n");
      out.write("        <input type=\"reset\" value=\"Clear\">\n");
      out.write("        </td>\n");
      out.write("      </tr>\n");
      out.write("       </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    </html>");
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
