<%@page import="java.util.List"%>
<%@page import="entities.User"%>
<%@page import="runner.CommonOperations"%>
<jsp:useBean id="obj" class="entities.User">  
</jsp:useBean>  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
List<User> a=CommonOperations.getLoginDetails(obj);
if(!a.isEmpty()){
    User u=a.get(0);
    session.setAttribute("id",u.getUserId());
    session.setAttribute("type",u.getUser_category());
    out.print("<script>alert('Succesfully Logged In!');</script>");
    if(u.getUser_category()==1){
        response.sendRedirect("../adminpanel.jsp");
    }else{
        response.sendRedirect("../newfeedback.jsp");
    }
    
} else{
    out.print("<script>alert('Invalid Login');</script>");
} 
  
%>  