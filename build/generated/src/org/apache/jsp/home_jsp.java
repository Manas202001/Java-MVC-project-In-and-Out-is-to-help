package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("    <style>\r\n");
      out.write("              .headertheme\r\n");
      out.write("        {\r\n");
      out.write("              background-color:rgb(13,71,161);\r\n");
      out.write("               width:100%;\r\n");
      out.write("               height:340px;\r\n");
      out.write("               background-repeat:no-repeat;\r\n");
      out.write("               \r\n");
      out.write("        }\r\n");
      out.write("        a{\r\n");
      out.write("            color:white;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            font-size:14px;\r\n");
      out.write("            font-family: arial;\r\n");
      out.write("            margin-top:-10px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("        a:hover\r\n");
      out.write("        {\r\n");
      out.write("             background-color:graytext;\r\n");
      out.write("        }\r\n");
      out.write("         .a{\r\n");
      out.write("            color:whitesmoke;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            font-size:10px;\r\n");
      out.write("            font-family: arial;\r\n");
      out.write("           font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("        .a :hover\r\n");
      out.write("        {\r\n");
      out.write("            background-color:red;\r\n");
      out.write("        }\r\n");
      out.write("        .headerthemetwo\r\n");
      out.write("        {\r\n");
      out.write("           background-image: url('fefe.gif');\r\n");
      out.write("           margin-right: 50px;\r\n");
      out.write("            width:20000px;\r\n");
      out.write("            height:800px; \r\n");
      out.write("            margin-top:-45px;\r\n");
      out.write("            margin-left:120px;\r\n");
      out.write("            background-repeat:no-repeat;\r\n");
      out.write("        }\r\n");
      out.write("        .m\r\n");
      out.write("        {\r\n");
      out.write("          margin-top:100px;  \r\n");
      out.write("        }\r\n");
      out.write("                .sitetitle{\r\n");
      out.write("            font-family: sans-serif;\r\n");
      out.write("            color:black;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            font-size: 40px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("       \r\n");
      out.write("    </style>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"headertheme\">\r\n");
      out.write("            <div style=\"margin-top:-10px\">\r\n");
      out.write("      <table border=\"0\" width=\"90%\" align=\"center\" border=\"inset\" \r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=20% class=\"a\"><a href=\"\">+91 9479561330</td>\r\n");
      out.write("                <td><img src=\"mailboxf.png\" width=\"25\" height=\"25px\" ></td>\r\n");
      out.write("                <td width=60% ><a href=\"mailto:\":>Info@gmail.com</a></td>\r\n");
      out.write("                <td width=10%><a href=\"login.jsp\">LOGIN</a></td>\r\n");
      out.write("                <td><a href=\"register.jsp\"> REGISTER </a></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("        </table>\r\n");
      out.write("             \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("      \r\n");
      out.write("            <table>\r\n");
      out.write("                <tr></tr>\r\n");
      out.write("                 <tr></tr>\r\n");
      out.write("                  <tr></tr>\r\n");
      out.write("                   <tr></tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                     <td width=5%></td>\r\n");
      out.write("                    <td class=\"m\"><img src=\"logo.PNG\" width=\"200px\" height=\"130px\"></td>\r\n");
      out.write("                       <td width=25%></td>\r\n");
      out.write("                    <td width=5%><a href=\"home.jsp\">HOME</a></td>\r\n");
      out.write("                    \r\n");
      out.write("        <form action=\"NextPage.jsp\">\r\n");
      out.write("                    <td><select name=\"tourist\" name=\"tour\">\r\n");
      out.write("                    <option>TOURIST</option>\r\n");
      out.write("                    <option>HOTELS</option>\r\n");
      out.write("                    <option>LOCAL GUIDE</option>\r\n");
      out.write("                    <option>RESTAURANTS</option>\r\n");
      out.write("                    <option>VIEW TOURIST PLACES</option></td>\r\n");
      out.write("                    \r\n");
      out.write("         </form>\r\n");
      out.write("         \t\t\t<tr>\r\n");
      out.write("                    <td><select name=\"student\">\r\n");
      out.write("                            <option><a href=\"student.jsp\">STUDENT</a></option>\r\n");
      out.write("                            <option><a href=\"hostels.jsp\">HOSTELS</a></option>\r\n");
      out.write("                            <option><a href=\"pg.jsp\">PG'S</a></option>\r\n");
      out.write("                    <option><a href=\"messt.jsp\">MESS/TIFFIN CENTER</a></option>\r\n");
      out.write("                    <option><a href=\"packers.jsp\">PACKERS&MOVERS</a></option>\r\n");
      out.write("                                           </td>\r\n");
      out.write("                       \r\n");
      out.write("                    <td><select name=\"migrant\">\r\n");
      out.write("                            <option>MIGRANT</option>\r\n");
      out.write("                            <option><a href=\"hor.jsp\">HOUSE ON RENT</a></option>\r\n");
      out.write("                        <option><a href=\"hos.jsp\">HOUSE ON SALE</a></option>\r\n");
      out.write("                    <option><a href=\"packers.jsp\">PACKERS&MOVERS</a></option>\r\n");
      out.write("                    <option><a href=\"messt.jsp\">MESS/TIFFIN CENTER</a></option></td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <select name=\"sa\">\r\n");
      out.write("                            <option>Specially ABLED</a></option>\r\n");
      out.write("            <option><a href=\"helpers.jsp\">HELPERS</a></option>\r\n");
      out.write("      <option><a href=\"messt.jsp\">MESS/TIFFIN CENTER</a></option>\r\n");
      out.write("      <option><a href=\"packers.jsp\">PACKERS&MOVERS</a></option> </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("              <div class=\"headerthemetwo\"></div>\r\n");
      out.write("              \r\n");
      out.write("       <table width=\"100%\" border=\"0\">\r\n");
      out.write("        <tr>\r\n");
      out.write("         <td colspan=\"5\"  class=\"sitetitle\">OUR SERVICES</td>\r\n");
      out.write("         <hr>\r\n");
      out.write("        </tr>  \r\n");
      out.write("       </table>  \r\n");
      out.write("                \r\n");
      out.write("      \r\n");
      out.write("            <table border=\"0\" width=\"100%\">\r\n");
      out.write("                <td  width=\"8%\">\r\n");
      out.write("            <td ><img src=\"guide.jpg\" align=\"left\" width=\"200px\" height=\"130px\"></td>  \r\n");
      out.write("            <td  width=9%\"></td>\r\n");
      out.write("            <td><img src=\"pngtree-hotel-icon-png-image_3570109.jpg\"  align=\"center\" width=\"200px\" height=\"130px\"></td>\r\n");
      out.write("            <td  width=10%\"></td>\r\n");
      out.write("            <td ><img src=\"helper.png\" width=\"200px\" height=\"130px\"></td>  \r\n");
      out.write("            </table>    \r\n");
      out.write("              <table border=\"0\" width=\"100%\" >\r\n");
      out.write("             <td width=\"4.5%\" align=\"center\"><a href=\"localguide.jsp\" style=\"color:blue;\">Local Guide</a></td>  \r\n");
      out.write("            <td width=\"5%\" align=\"center\"><a href=\"hotels.jsp\" style=\"color:blue;\">HOTELS</a></td>\r\n");
      out.write("            <td width=\"5%\" align=\"center\"><a href=\"helpers.jsp\" style=\"color:blue;\">Helpers</a></td>  \r\n");
      out.write("            </table>    \r\n");
      out.write("              <hr>\r\n");
      out.write("              <table border=\"0\" width=\"100%\">\r\n");
      out.write("                <td  width=\"8%\">\r\n");
      out.write("            <td ><img src=\"restaurent.jpg\" align=\"left\" width=\"200px\" height=\"130px\"></td>  \r\n");
      out.write("            <td  width=\"9%\"></td>\r\n");
      out.write("            <td><img src=\"tourist.jpg\"  align=\"center\" width=\"200px\" height=\"130px\"></td>\r\n");
      out.write("            <td  width=\"10%\"></td>\r\n");
      out.write("            <td ><img src=\"pg.jpg\" width=\"200px\" height=\"130px\"></td>  \r\n");
      out.write("            </table>    \r\n");
      out.write("              <table border=\"0\" width=\"100%\">\r\n");
      out.write("            <td width=\"4%\" align=\"center\"><a href=\"restaurets.jsp\" style=\"color:blue;\">RESTAURANTS</a></td>  \r\n");
      out.write("            <td  width=\"4.5%\" align=\"center\"><a href=\"tourist.jsp\" style=\"color:blue;\">TOURIST</a></a> </td>\r\n");
      out.write("            <td width=\"5%\" align=\"center\"><a href=\"pg.jsp\" style=\"color:blue;\">PG'S</a></td>  \r\n");
      out.write("            </table>  \r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("              <hr>\r\n");
      out.write("              <table border=\"0\" width=\"100%\">\r\n");
      out.write("                <td  width=\"8%\">\r\n");
      out.write("            <td ><img src=\"hostel.png\" align=\"left\" width=\"200px\" height=\"130px\"></td>  \r\n");
      out.write("            <td  width=\"9%\"></td>\r\n");
      out.write("            <td><img src=\"packers.png\"  align=\"center\" width=\"200px\" height=\"130px\"></td>\r\n");
      out.write("            <td  width=\"10%\"></td>\r\n");
      out.write("            <td ><img src=\"houserenr.jpg\" width=\"200px\" height=\"130px\"></td>  \r\n");
      out.write("            </table>    \r\n");
      out.write("              <table border=\"0\" width=\"100%\">\r\n");
      out.write("            <td width=\"4.5%\" align=\"center\"><a href=\"hostel.jsp\" style=\"color:blue;\">HOSTELS</a></td>  \r\n");
      out.write("            <td width=\"5%\" align=\"center\"><a href=\"Packers.jsp\" style=\"color:blue;\">Packers & Movers</a></td>\r\n");
      out.write("            <td width=\"5%\" align=\"center\"><a href=\"pg.jsp\" style=\"color:blue;\">House on rent </a></td>  \r\n");
      out.write("            </table>  \r\n");
      out.write("          <hr>\r\n");
      out.write("            <hr>\r\n");
      out.write("    </body>\r\n");
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
