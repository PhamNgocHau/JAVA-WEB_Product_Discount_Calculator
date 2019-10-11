<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/11/2019
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<form action="/discount" method="post" id="frm">
    <h2>Product Discount Calculator</h2>
    <div id="information">
        <div>Product Description:</div>
        <div>List Price: </div>
        <div>Discount Percent: </div>
    </div>
    <div id="input">
        <div>
            <input type="text" name="description">
        </div>
        <div>
            <input type="text" name="price">
        </div>
        <div>
            <input type="text" name="percent">(%)
        </div>
        <div id="btn">
            <button type="submit">Calculate Discount</button>
        </div>
    </div>
</form>
</body>
</html>
