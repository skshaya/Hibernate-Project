<%@page import="entities.User"%>
<%@page import="runner.CommonOperations"%>  

<jsp:useBean id="obj" class="entities.User">  
</jsp:useBean>  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
int i=CommonOperations.register(obj);  
if(i>0)  
out.print("<script>alert('Successfully Registered!');window.location='../newfeedback.jsp';</script>");  
%>  
