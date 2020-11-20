<%@page import="runner.EditFood"%>
<%@page import="java.util.List"%>
<%@page import="entities.Food"%>
        
    <table border="1" class="w3-table">
        <tr class="w3-black"><th>Item Name</th><th>Portion</th><th>Price (Rs.)</th></tr>
    <%
        List<Food> list=EditFood.getAllFood();
        for (Food item : list) {%>
        <tr class="w3-white">
            <td><%=item.getName()%></td>
            <td><%=item.getPortion()%></td>
            <td><%=item.getPrice()%></td>
        </tr>
    <%
        }
    %>
    </table>
