<%@include file="header.jsp"%>

<%
    if(session.getAttribute("type")!=null){
        if(session.getAttribute("type").toString().equals("2")){
            response.sendRedirect("login.jsp");
        }
    }
%>

<h1 class="w3-center w3-jumbo" style="margin-bottom:64px">Admin Panel</h1> 

<p class="w3-xxlarge" style="margin-bottom:16px">Select Option</p> 
<a class="w3-large" href="newfood.jsp">Add New Food Menu Item</a><br/>
<a class="w3-large" href="editfood.jsp">Update Food Menu Items</a><br/>
<a class="w3-large" href="view_feedback.jsp">View User Feedback</a>

<%@include file="footer.jsp"%>