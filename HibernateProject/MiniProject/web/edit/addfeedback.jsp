<%@page import="entities.User"%>
<%@page import="runner.ViewFeedback"%>  

<jsp:useBean id="obj" class="entities.Feedback">  
</jsp:useBean>  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
User u=new User();
String id=session.getAttribute("id").toString();
u.setUserId(Integer.parseInt(id));
obj.setUserId(u);
int i=ViewFeedback.addFeedback(obj);  
if(i>0)  
out.print("<script>alert('Thank You for your Feedback!');window.location='../newfeedback.jsp';</script>");  
%>  