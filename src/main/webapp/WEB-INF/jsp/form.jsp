<%--
  Created by IntelliJ IDEA.
  User: Lomovskoy
  Date: 15.04.2019
  Time: 12:42
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
    <title>Узнать свой ИНН</title>
    <link rel="shortcut icon" href="/webapp/WEB-INF/template/icon/java.png" type="image/png">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
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
            <label for="bplace">Место рождения:</label>
            <input type="text" class="form-control" id="bplace" name="bplace">
        </div>
        <div class="form-group">
            <label for="docno">Серия и номер паспорта: *</label>
            <input type="text" class="form-control" id="docno" name="docno" required>
        </div>
        <div class="form-group">
            <label for="docdt">Дата выдачи паспорта:</label>
            <input type="date" class="form-control" id="docdt" name="docdt">
        </div>

        <div class="row m-0 mt-2">
            <input type="submit" class="btn btn-primary ml-auto" value="Отправить запрос"></input>
        </div>
    </form>
</div>

<footer class="container"><!--Footer-->
    <hr>
    <p class="text-center">© Lomovskoy 2019</p>
</footer><!--/Footer-->

<script type="application/ecmascript">
    const $individualForm = document.getElementById('individual-form')

    $individualForm.addEventListener('submit', event => {
        event.preventDefault()

        const formValues = [].reduce.call(
            document.querySelectorAll('#individual-form input'),
            (result, it) => {
                if (it.name === 'submit') return result

                const encodedKey = encodeURIComponent(it.name)
                const encodedValue = encodeURIComponent(it.value)
                const encodedKeyValue = encodedKey + '=' + encodedValue
                return result ? result + '&' + encodedKeyValue : encodedKeyValue
            },
            '')

        fetch('/inn', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded;charset=UTF-8'
            },
            body: formValues
        })
            .then(data => data.json())
            .then(({inn}) => {
                let result = document.getElementById('result')

                const successComponent = document.createElement('div')
                successComponent.innerHTML = "Ваш ИНН" + inn

                const noInnComponent = document.createElement('div')
                noInnComponent.innerHTML = "Не найден"

                const newResult = inn ? successComponent : noInnComponent

                if(result) {
                    result.innerHTML = newResult.innerHTML
                } else {
                    const buf = document.createElement('div')
                    buf.setAttribute('id', 'result')
                    buf.innerHTML = newResult.innerHTML

                    result = buf
                }

                $individualForm.appendChild(result)
            })
    })
</script>
</body>
</html>
