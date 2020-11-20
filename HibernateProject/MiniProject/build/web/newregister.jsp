<%@include file="header.jsp"%>

    <style>
        td{padding:10px;};
        #submit{display:block;margin:auto;};
        table{display:block;margin:auto;};
    </style>

    <h1 class="w3-center w3-jumbo" style="margin-bottom:64px">Registration</h1>
        <form action="edit/adduser.jsp" class="w3-center" method="post">  
            <table class="w3-center" >
                <tr>
                    <td>First Name</td><td><input type="text" name="fname"/></td>
                </tr>
                <tr>
                    <td>Last Name</td><td><input type="text" name="lname"/></td>
                </tr>
                <tr>
                    <td>E-Mail</td><td><input type="email" name="email"/></td>
                </tr>
                <tr>
                    <td>NIC</td><td><input type="text" name="nic"/></td>
                </tr>
                <tr>
                    <td>Username</td><td><input type="text" name="uname"/></td>
                </tr>
                <tr>
                    <td>Password</td><td><input type="password" name="pword"/></td>
                </tr>
                <tr>
                    <td>Address No.</td><td><input type="text" name="address_no"/></td>
                </tr>
                <tr>
                    <td>Address Line 1</td><td><input type="text" name="address1"/></td>
                </tr>
                <tr>
                    <td>Address Line 2</td><td><input type="text" name="address2"/></td>
                </tr>
                <tr>
                    <td>City</td><td><input type="text" name="city"/></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" id="submit" value="Submit"/></td>
                </tr>
            </table>
        </form>  
<%@include file="footer.jsp"%>