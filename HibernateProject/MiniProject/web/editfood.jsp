<%
    if (session.getAttribute("id")==null){
      //  response.sendRedirect("login.jsp");
    }

%>
<%@include file="header.jsp"%>
    <h1 class="w3-center w3-jumbo" style="margin-bottom:64px">Edit Food Details</h1>
    <div id="addfood" style="display:none">
            <form action="addfood.jsp" method="post">  
            Name:<input type="text" name="name"/><br><br/>  
            Portion:<input type="text" name="portion"/><br><br/>  
            Price :<input type="number" step="0.01" name="price"/><br><br/>  
            <input type="submit" value="test"/>  
            </form>  
    </div>
    
    <%@include file="edit/getfood.jsp"%>
    
<%@include file="footer.jsp"%>