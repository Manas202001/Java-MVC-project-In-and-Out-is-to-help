package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("               height:340px;\n");
      out.write("               background-repeat:no-repeat;\n");
      out.write("               \n");
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
      out.write("            font-size:20px;\n");
      out.write("            font-family: arial;\n");
      out.write("           font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .a :hover\n");
      out.write("        {\n");
      out.write("            background-color:red;\n");
      out.write("        }\n");
      out.write("        .logincode\n");
      out.write("        {\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .m\n");
      out.write("        {\n");
      out.write("          margin-top:100px;  \n");
      out.write("        }\n");
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
      out.write("            </tr>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("             \n");
      out.write("        </div>\n");
      out.write("            <table>\n");
      out.write("                <tr></tr>\n");
      out.write("                 <tr></tr>\n");
      out.write("                  <tr></tr>\n");
      out.write("                   <tr></tr>\n");
      out.write("                <tr>\n");
      out.write("                     <td width=5%></td>\n");
      out.write("                    <td class=\"m\"><img src=\"logo.PNG\" width=\"200px\" height=\"130px\"></td>\n");
      out.write("                       <td width=25%></td>\n");
      out.write("                    <td width=5%><a href=\"home.jsp\">HOME</a></td>\n");
      out.write("                    <td><select name=\"tourist\">\n");
      out.write("                            <option><a href=\"tourist.jsp\">TOURIST</a><option>\n");
      out.write("                                <option><a href=\"hotels.jsp\">HOTELS</a><option>\n");
      out.write("                                    <option><a href=\"localguide.jsp\">Local Guide</a><option>\n");
      out.write("                                        <option><a href=\"restaurets.jsp\">RESTAURANTS</a><option>\n");
      out.write("                                            <option><a href=\"view.jsp\">VIEW TOURIST PLACES</a><option></td>\n");
      out.write("                    <td><select name=\"student\">\n");
      out.write("                            <option><a href=\"student.jsp\">STUDENT</a></option>\n");
      out.write("                            <option><a href=\"hostels.jsp\">HOSTELS</a><option>\n");
      out.write("                                <option><a href=\"pg.jsp\">PG'S</a><option>\n");
      out.write("                                    <option><a href=\"messt.jsp\">MESS/TIFFIN CENTER</a><option>\n");
      out.write("                                        <option><a href=\"packers.jsp\">PACKERS&MOVERS</a><option>\n");
      out.write("                                           </td>\n");
      out.write("                       \n");
      out.write("                    <td><select name=\"migrant\">\n");
      out.write("                            <option>MIGRANT<option>\n");
      out.write("                                <option><a href=\"hor.jsp\">House On Rent</a><option>\n");
      out.write("                                    <option><a href=\"hos.jsp\">House On Sale</a><option>\n");
      out.write("                                        <option><a href=\"packers.jsp\">PACKERS&MOVERS</a><option>\n");
      out.write("                                            <option><a href=\"messt.jsp\">MESS/TIFFIN CENTER</a><option></td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"sa\">\n");
      out.write("                            <option>Specially ABLED</a></option>\n");
      out.write("                                <option><a href=\"helpers.jsp\">Helpers</a><option>\n");
      out.write("                                    <option><a href=\"messt.jsp\">MESS/TIFFIN CENTER</a><option>\n");
      out.write("                                        <option><a href=\"packers.jsp\">PACKERS&MOVERS</a><option>  </td>\n");
      out.write("                </tr>\n");
      out.write("                <hr>\n");
      out.write("\n");
      out.write("<form  action=\"logincode.jsp\">\n");
      out.write("    <table align=\"center\" >\n");
      out.write("        <tr>\n");
      out.write("            <td class=\"a\">LOGIN ID</td>\n");
      out.write("            <td><input type=\"text\" name=\"loginid\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>  </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td class=\"a\">Password</td>\n");
      out.write("        <td><input type=\"password\" name=\"pass\"></td>\n");
      out.write("       </tr>     \n");
      out.write("       <tr>\n");
      out.write("           <td class=\"a\">Login as</td>\n");
      out.write("                   <td><select name=\"p\">\n");
      out.write("                          <option>select</option> \n");
      out.write("                          <option>Owner/Admin</option>\n");
      out.write("                          <option>Employee</option>\n");
      out.write("                          <option>service provider</option>\n");
      out.write("               </select></td>\n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("        <td><input type=\"submit\" value=\"Login\"></td>\n");
      out.write("        <td><a href=\"NewUser.jsp\">new user</a></td>\n");
      out.write("      </tr>\n");
      out.write("     </table>\n");
      out.write("</form>\n");
      out.write("       </table>\n");
      out.write("        \n");
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
