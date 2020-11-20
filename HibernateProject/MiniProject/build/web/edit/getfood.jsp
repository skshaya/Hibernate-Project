<%@page import="runner.EditFood"%>
<%@page import="java.util.List"%>
<%@page import="entities.Food"%>

<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8/jquery.js"></script>
<script type="text/javascript" src="jquery-3.3.1.min.js"></script>
<script src="http://code.jquery.com/ui/1.9.0/jquery-ui.min.js"></script>
        
    <table border="1" class="w3-table">
        <tr class="w3-black"><th>Item Name</th><th>Portion</th><th>Price (Rs.)</th><th></th></tr>
    <%
        List<Food> list=EditFood.getAllFood();
        for (Food item : list) {%>
        <tr class="w3-white">
            <td><%=item.getName()%></td>
            <td><%=item.getPortion()%></td>
            <td><%=item.getPrice()%></td>
            <td><input type="button" value="Edit" style="margin:auto;display:block;" onclick="showDialog(<%=item.getFoodId()%>,'<%=item.getName()%>','<%=item.getPortion()%>',<%=item.getPrice()%>)"/></td>
        </tr>
    <%
        }
    %>
    </table> 
    <div class="w3-padding w3-card w3-center" style="display:none;" id="popup"><form action="updatefood.jsp" method="post">
        <table class="w3-center" style="display:block;margin:auto;">    
            <tr style="display:none;"><td>Name</td><td><input type="number" id="id" name="foodId" value=""/></td></tr>
            <tr><td>Name</td><td><input type="text" id="name" name="name" value="name"/></td></tr>
            <tr><td>Portion</td><td><input type="text" id="por" name="portion" value="portion"/></td></tr>
            <tr><td>Price</td><td><input type="number" step="0.01" id="price" name="price" value=""/></td></tr>
            <tr><td colspan="2"><input type="button" value="Update" id="button" onclick="myfunc()"/></td></tr>
        </table>   
        </form>
    </div>
    

<script>
    gid=0;
   function myfunc(){
        name=$("#name").val();
        portion=$("#por").val();
        price=$("#price").val();
        //alert("hello");
        $.ajax({
            url: "edit/updatefood.jsp",
            data: { 
                "foodId":gid,
                "name": name, 
               "portion": portion, 
                "price": price
            },
            cache: false,
            type: "POST",
            success: function(response) {
                alert("Successfully Updated!");
                window.location="editfood.jsp";
            },
            error: function(xhr) {
                alert(xhr+"An error occured..");
            }
        });
    }
    
    
    function showDialog(id,name,portion,price){
        gid=id;
        document.getElementById("name").value=name;
        document.getElementById("por").value=portion;
        document.getElementById("price").value=price;
        document.getElementById("popup").style="dispay:block";
        $("#id").val(gid);
    }
    
</script>