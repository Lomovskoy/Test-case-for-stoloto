<%--
  Стартовая страница приложения, содержит форму ввода данных.
  User: lomovskoy_ky
  Date: 15.04.2019
  Time: 12:42
--%>
<%@include file = "layouts/header.jsp" %>

<div class="container ">
    <br>
    <h4 class="text-center text-dark">Сведения о физическом лице</h4>
    <hr>
    <form id='individual-form' class="col-4 mt-4 p-4 border border-secondary rounded container" action="/inn"
          method="POST" enctype="application/x-www-form-urlencoded">
        <div class="form-group">
            <label for="fam">Фамилия: *</label>
            <input type="text" class="form-control" id="fam" name="fam" required>
        </div>
        <div class="form-group">
            <label for="nam">Имя: *</label>
            <input type="text" class="form-control" id="nam" name="nam" required>
        </div>
        <div class="form-group">
            <label for="otch">Отчество: *</label>
            <input type="text" class="form-control" id="otch" name="otch" required>
        </div>
        <div class="form-group">
            <label for="bdate">Дата рождения: *</label>
            <input type="date" class="form-control" id="bdate" name="bdate" required>
        </div>
        <div class="form-group">
            <label for="docno">Серия и номер паспорта: *</label>
            <input type="text" class="form-control" id="docno" name="docno" pattern="[0-9]{2} [0-9]{2} [0-9]{6}"
                   placeholder="__ __ ______" required>
        </div>
        <div class="form-group">
            <label for="docno">Капча:</label>
            <input type="text" class="form-control" id="captcha" name="captcha">
        </div>
        <img src="https://service.nalog.ru/static/captcha.bin?r=50000&a=${token}&version=3"
             class="rounded mx-auto d-block" alt="Капча">

        <div class="form-group">
            <input type="hidden" class="form-control" id="captchaToken" name="captchaToken" value="${token}">
        </div>
        <div class="row m-0 mt-2">
            <input type="submit" class="btn btn-primary ml-auto" value="Отправить запрос"/>
        </div>
    </form>

<%@include file = "layouts/footer.jsp" %>