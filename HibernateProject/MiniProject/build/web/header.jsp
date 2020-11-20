<!DOCTYPE html>
<html>
<title>W3.CSS Template</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Indie+Flower">
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8/jquery.js"></script>
	<script type="text/javascript" src="jquery-3.3.1.min"></script>
	<script src="http://code.jquery.com/ui/1.9.0/jquery-ui.min.js"></script>
<style>
body, html {height: 100%}
h1,h2,h3,h4,h5,h6,.heading,footer {font-family: "Amatic SC", sans-serif}
.menu {display: none}
.bgimg {
    background-repeat: no-repeat;
    background-size: cover;
    background-image: url("/w3images/pizza.jpg");
    min-height: 90%;
}
</style>
<body bgcolor="black">
<!-- Navbar (sit on top) -->
<div class="w3-top w3-hide-small heading">
  <div class="w3-bar w3-xlarge w3-black w3-opacity w3-hover-opacity-off" id="myNavbar">
    <a href="index.html" class="w3-bar-item w3-button">HOME</a>
    <a href="menu.jsp" class="w3-bar-item w3-button">MENU</a>
    <a href="newfeedback.jsp" class="w3-bar-item w3-button">CONTACT US</a>
    <%
    if(session.getAttribute("id")!=null)
    out.print("<a href='edit/logout.jsp' class='w3-bar-item w3-right w3-button'>LOGOUT</a>");
    else
    out.print("<a href='login.jsp' class='w3-bar-item w3-right w3-button'>LOGIN</a>");
    
    if(session.getAttribute("id")!=null){
        if(session.getAttribute("type").toString().equals("1")){
            out.print("<a href='adminpanel.jsp' class='w3-bar-item w3-right w3-button'>ADMIN</a>");
        }
    }

    %>
  </div>
</div>
<div class="w3-container w3-padding-64 w3-red w3-grayscale w3-xlarge" id="about">
  <div class="w3-content">