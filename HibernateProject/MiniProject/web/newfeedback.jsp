<%@include file="header.jsp"%>
<%
    if(session.getAttribute("id")==null){
        response.sendRedirect("login.jsp");
    }
%>
    <style>
        td{padding:10px;};
        #submit{display:block;margin:auto;};
        table{display:block;margin:auto;};
    </style>

    <h1 class="w3-center w3-jumbo" style="margin-bottom:64px">Add New Food</h1>
        <form action="edit/addfeedback.jsp" class="w3-center" method="post">  
            <table class="w3-center">
                <tr>
                    <td>Your Feedback</td><td><input type="text" name="feedback"/></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" id="submit" value="Add Feedback"/></td>
                </tr>
            </table>
        </form>  
<%@include file="footer.jsp"%>