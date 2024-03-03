<%
   String value=request.getParameter("tour");
   if(value.equals("TOURIST"))
   {
       response.sendRedirect("login.jsp");
   }
%>
