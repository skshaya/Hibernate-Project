<%@include file="header.jsp"%>
<h1 class="w3-jumbo w3-center">Login</h1>
 
<%
    if(session.getAttribute("id")!=null){
        response.sendRedirect("index.html");
    }

%>

   <form action="edit/validatelogin.jsp" method="POST">
    Enter Username : 
    <input type="text" name="uname" required="required"> <br> <br> 
    Enter Password :
    <input type="password" name="pword" required="required"> <br> <br> 
    <input type="submit" value="Login">
   </form><br/>
<h2 class="w3-xlarge">Not a user? <a href="newregister.jsp">Register Now</a></h2>
<%@include file="footer.jsp"%>

