<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
<style>
    body {
        font-family: Arial, sans-serif;
    }
    .container {
        max-width: 500px;
        margin: 0 auto;
        padding: 20px;
        text-align: center;
    }
    h1 {
        margin-bottom: 30px;
    }
    input[type="text"] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        box-sizing: border-box;
        border: 2px solid #ccc;
        border-radius: 4px;
    }
    input[type="submit"] {
        width: 100%;
        background-color: #4CAF50;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }
    input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
<div class="container">
    <h1>Student Form</h1>
    <form action="myservlet" method="post">
        <label for="name">Name:</label><br>
        <input type="text" id="name" name="name"><br><br>
        <label for="rollnumber">Roll Number:</label><br>
        <input type="text" id="rollnumber" name="roll"><br><br>
        <input type="submit" value="Submit">
    </form> 
</div>
</body>
</html> 
