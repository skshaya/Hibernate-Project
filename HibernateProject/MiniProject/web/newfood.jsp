<%@include file="header.jsp"%>

    <style>
        td{padding:10px;};
        #submit{display:block;margin:auto;};
        table{display:block;margin:auto;};
    </style>

    <h1 class="w3-center w3-jumbo" style="margin-bottom:64px">Add New Food</h1>
        <form action="edit/addfood.jsp" class="w3-center" method="post">  
            <table class="w3-center" >
                <tr>
                    <td>Name</td><td><input type="text" name="name"/></td>
                </tr>
                <tr>
                    <td>Portion</td><td><input type="text" name="portion"/></td>
                </tr>
                <tr>
                    <td>Price</td><td><input type="number" step="0.01" name="price"/></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" id="submit" value="Add New Food"/></td>
                </tr>
            </table>
        </form>  
<%@include file="footer.jsp"%>