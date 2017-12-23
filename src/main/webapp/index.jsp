<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<div>
    this is a blog
</div>
<p th:text="'Hello, ' + ${name} + '!'" />
</body>
</html>
