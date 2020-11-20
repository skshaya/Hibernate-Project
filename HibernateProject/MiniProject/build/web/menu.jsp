<%
    if (session.getAttribute("id")==null){
      //  response.sendRedirect("login.jsp");
    }

%>
<%@include file="header.jsp"%>
    <h1 class="w3-center w3-jumbo" style="margin-bottom:64px">Food Menu</h1> 
    <%@include file="showmenu.jsp"%>
<%@include file="footer.jsp"%>