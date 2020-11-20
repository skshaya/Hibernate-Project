    <%@page import="entities.Feedback"%>
<%@page import="java.util.List"%>
<%@page import="runner.ViewFeedback"%>  

<jsp:useBean id="obj" class="entities.Feedback">  
</jsp:useBean>  
<jsp:setProperty property="*" name="obj"/>  

<%@include file="header.jsp"%>
 <h1 class="w3-center w3-jumbo" style="margin-bottom:64px">Feedback</h1>
 <div class="w3-container w3-gary w3-text-black" style="font-size: 15px">
  <table class="w3-table w3-striped w3-bordered w3-gary">
    <tr class="w3-black">
      <th>Customer Name</th>
      <th>Email</th>
      <th>Feedback </th>
      <th>Date and Time</th>
    </tr>
    <%
        List<Feedback> list=ViewFeedback.getFeedback();
        for(Feedback item : list){ %>
    <tr class="w3-white">
      <td><%= item.getUserId().getFname()+" "+item.getUserId().getLname()  %></td>
      <td><%= item.getUserId().getEmail() %></td>
      <td><%= item.getFeedback() %></td>
      <td><%= item.getDate()%></td>
    </tr> 
    <% }
    %>
  </table>
</div>
        
<%@include file="footer.jsp"%>