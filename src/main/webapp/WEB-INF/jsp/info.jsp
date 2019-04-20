<%--
  Created by IntelliJ IDEA.
  User: lomovskoy_ky
  Date: 19.04.2019
  Time: 12:07
  To change this template use File | Settings | File Templates.
--%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <!-- Необходимые Мета-теги всегда на первом месте -->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Ваш ИНН</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container ">
    <br>
    <h4 class="text-center text-dark">Ваш ИНН: </h4>
    <hr>
    <a type="button" class="m-1 p-2 btn btn-dark px-md-5" href="/"><- Назад</a>
    <br>
    <h4 class="m-1 p-2 border bg-light">Ваш ИНН: ${inn}</h4>

</div>
<footer class="container"><!--Footer-->
    <hr>
    <p class="text-center">© Lomovskoy 2019</p>
</footer><!--/Footer-->
</body>
</html>