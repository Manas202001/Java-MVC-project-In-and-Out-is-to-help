<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="static java.lang.System.out" %>
<%
    String id=request.getParameter("loginid");
    String pwd=request.getParameter("pass");
    String post=request.getParameter("p");
    
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
PreparedStatement st=con.prepareStatement("select * from classpro where userid=? and pass=?");
st.setString(1,id);
st.setString(2,pwd);
ResultSet rs=st.executeQuery();
if(rs.next())
{
    response.sendRedirect("menu.jsp");
   // String e=rs.getString(3);
  //System.out.println(e);
}
else
{
    out.println("Invalid ID or password");
}
%>