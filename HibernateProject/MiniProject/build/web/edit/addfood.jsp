<%@page import="runner.EditFood"%>  

<jsp:useBean id="obj" class="entities.Food">  
</jsp:useBean>  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
int i=EditFood.addFood(obj);  
if(i>0)  
out.print("<script>alert('New Food Added!');window.location='../newfood.jsp';</script>");  
%>  