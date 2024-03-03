<html>
    <style>
              .headertheme
        {
              background-color:rgb(13,71,161);
               width:100%;
               height:180px;
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
            font-size:10px;
            font-family: arial;
           font-weight: bold;
        }
        .a :hover
        {
            background-color:red;
        }
        .headerthemetwo
        {
           background-image: url('fefe.gif');
           margin-right: 50px;
            width:20000px;
            height:800px; 
            margin-top:-45px;
            margin-left:120px;
            background-repeat:no-repeat;
        }
        .m
        {
          margin-top:100px;  
        }
        .sitetitle{
            font-family: sans-serif;
            color:white;
            font-weight: bold;
            font-size: 40px;
            text-align: center;
        }
      .centerdiv{
            background:	rgb(230,230,250);
               width:100%;
               height:900px;
               border-radius: 10px;
       
    </style>
    <body>
        <div class="headertheme">
            <div style="margin-top:-10px">
      <table border="0" width="90%" align="center" border="inset" >
            <tr>
                <td width=20% class="a"><a href="">+91 9479561330</td>
                <td><img src="mailboxf.png" width="25" height="25px" ></td>
                <td width=60% ><a href="mailto:":>Info@gmail.com</a></td>
                <td width=10%><a href="login.jsp">LOGIN</a></td>
                <td><a href="register.jsp"> REGISTER </a></td>
            </tr>
            </div>
            </div>
        
        </table>
             
        </div>
        
     
            <table>
                <tr>
                     <td width=5% border="0"></td>
                    <td class="m"><img src="logo.PNG" width="200px" height="130px"></td>                 
                    
                </tr></table>
           <div style="margin-top:-90px">
               <form action="regcode.jsp">
        <table border="0" width="100%"  >
            <tr>
               <td class="sitetitle"> Registration Form </td>
            </tr>
        </table>
               </div>
        <div class="centerdiv">
        <table align="center" cellspacing="20" border="1" style=" margintop:500px;padding-left:50px;">
            <tr>
                <td> Choose an Option : </td>
                <td><select name="regop">
                        <option>1. Broker</option>
                        <option>2. Local Guide</option>
                        <option>3. Helper</option>
                        <option>4. Food Producing Agency</option>
                        <option>5. Transport Agency</option>
                    </select>
                        </td>
                        <tr>
            <td>FULL NAME</td>
            <td><input type="text" name="fNm" placeholder="enter full name"></td>
        </tr>
        <tr>
                    <td>password</td>
                    <td><input type="password" name="pass"></td>
            </tr>
         <tr>
            <td>ADDRESS</td>
            <td><textarea name="address" placeholder="enter address"></textarea> </td>
       </tr>  
       <tr>
       <td>Contact NO 1</td>
       <td><input type="text" name="cn1" placeholder="enter Contact Number 1"></textarea> </td>
       </tr> 
       <tr>
       <td>Contact NO 2</td>
       <td><input type="text" name="cn2" placeholder="enter Contact Number 2"></textarea> </td>
       </tr> 
       <tr>
       <td>City</td>
                   <td><select name="city">
                          <option>select city</option> 
                          <option>Indore</option>
                          <option>Bhopal</option>
                          <option>Pune</option>
                       </select></td></tr>
        <tr>
            <td>DOB</td>
            <td><input type="date" name="dOB"></td>
        </tr>
         <tr align="center">
        <td colspan="2">
        <input type="submit" value="Register">
        <input type="reset" value="Clear">
        </td>
      </tr>
       </table>
            </form>
        </div>
    </body>
    </html>