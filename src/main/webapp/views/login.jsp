<%@ page language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>SD18104</title>
</head>
<body>
<h2>Xin chào, ${ name }</h2>

<form action="/login" method="POST">

<div>
<label>Username</label> <input type="text" name="username" >
</div>
<div>
<label>Password</label> <input type="password" name="password">
</div>
<button>Login</button>
</form>
</body>
</html>