<html>
    <style>
              .headertheme
        {
              background-color:rgb(13,71,161);
               width:100%;
               height:340px;
               background-repeat:no-repeat;
               
        }
        a{
            color:white;
            text-decoration: none;
            font-size:14px;
            font-family: arial;
            margin-top:-10px;
            font-weight: bold;
        }
        a:hover
        {
             background-color:graytext;
        }
         .a{
            color:whitesmoke;
            text-decoration: none;
            font-size:20px;
            font-family: arial;
           font-weight: bold;
        }
        .a :hover
        {
            background-color:red;
        }
        .logincode
        {
            
        }
        
        .m
        {
          margin-top:100px;  
        }
       
    </style>
    <body>
        <div class="headertheme">
            <div style="margin-top:-10px">
      <table border="0" width="90%" align="center" border="inset" >
            <tr>
                <td width=20% class="a"><a href="">+91 9479561330</td>
                <td><img src="mailboxf.png" width="25" height="25px" ></td>
                <td width=60% ><a href="mailto:":>Info@gmail.com</a></td>
            </tr>
            </div>
            </div>
        
        </table>
             
        </div>
            <table>
                <tr></tr>
                 <tr></tr>
                  <tr></tr>
                   <tr></tr>
                <tr>
                     <td width=5%></td>
                    <td class="m"><img src="logo.PNG" width="200px" height="130px"></td>
                       <td width=25%></td>
                    <td width=5%><a href="home.jsp">HOME</a></td>
                    <td><select name="tourist">
                            <option><a href="tourist.jsp">TOURIST</a><option>
                                <option><a href="hotels.jsp">HOTELS</a><option>
                                    <option><a href="localguide.jsp">Local Guide</a><option>
                                        <option><a href="restaurets.jsp">RESTAURANTS</a><option>
                                            <option><a href="view.jsp">VIEW TOURIST PLACES</a><option></td>
                    <td><select name="student">
                            <option><a href="student.jsp">STUDENT</a></option>
                            <option><a href="hostels.jsp">HOSTELS</a><option>
                                <option><a href="pg.jsp">PG'S</a><option>
                                    <option><a href="messt.jsp">MESS/TIFFIN CENTER</a><option>
                                        <option><a href="packers.jsp">PACKERS&MOVERS</a><option>
                                           </td>
                       
                    <td><select name="migrant">
                            <option>MIGRANT<option>
                                <option><a href="hor.jsp">House On Rent</a><option>
                                    <option><a href="hos.jsp">House On Sale</a><option>
                                        <option><a href="packers.jsp">PACKERS&MOVERS</a><option>
                                            <option><a href="messt.jsp">MESS/TIFFIN CENTER</a><option></td>
                    <td>
                        <select name="sa">
                            <option>Specially ABLED</a></option>
                                <option><a href="helpers.jsp">Helpers</a><option>
                                    <option><a href="messt.jsp">MESS/TIFFIN CENTER</a><option>
                                        <option><a href="packers.jsp">PACKERS&MOVERS</a><option>  </td>
                </tr>
                <hr>

<form  action="logincode.jsp">
    <table align="center" >
        <tr>
            <td class="a">LOGIN ID</td>
            <td><input type="text" name="loginid"></td>
        </tr>
        <tr>
            <td>  </td>
        </tr>
        <tr>
            <td class="a">Password</td>
        <td><input type="password" name="pass"></td>
       </tr>     
       <tr>
           <td class="a">Login as</td>
                   <td><select name="p">
                          <option>select</option> 
                          <option>Owner/Admin</option>
                          <option>Employee</option>
                          <option>service provider</option>
               </select></td>
       </tr>
       <tr>
        <td><input type="submit" value="Login"></td>
        <td><a href="NewUser.jsp">new user</a></td>
      </tr>
     </table>
</form>
        
    </body>
    </html>