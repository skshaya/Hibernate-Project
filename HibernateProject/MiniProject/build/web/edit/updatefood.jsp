<%@page import="entities.Food"%>
<%@page import="runner.EditFood"%>  

<jsp:useBean id="obj" class="entities.Food">  
</jsp:useBean>  
<jsp:setProperty property="*" name="obj"/>  
  
<%
EditFood.updateFood(obj);
out.print("Updated!");  
%>  
