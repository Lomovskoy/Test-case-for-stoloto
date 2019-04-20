<%--
  Страница содержащая ответ от сервера.
  User: lomovskoy_ky
  Date: 19.04.2019
  Time: 12:07
--%>
<%@include file = "layouts/header.jsp" %>

<div class="container ">
    <br>
    <h4 class="text-center text-dark">Ваш ИНН: </h4>
    <hr>
    <a type="button" class="m-1 p-2 btn btn-dark px-md-5" href="/"><- Назад</a>
    <br>
    <h4 class="m-1 p-2 border bg-light">Ваш ИНН: ${inn}</h4>
</div>

<%@include file = "layouts/footer.jsp" %>