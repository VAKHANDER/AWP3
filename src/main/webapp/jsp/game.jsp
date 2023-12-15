<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Vakhaev A.R. Lab 3</title>
</head>
<body>
<h1 align="center">Игровое поле</h1>
<h3 align="center">Your move (X):</h3>
    <style>
    table,
    tr > * {
    border: 1px solid;
    }
    </style>
    <table align="center">
        <caption>Игровое поле</caption>
        <thead>
        <form method="post" action="/MainServlet_war/game">
        <tr>
            <th><button type="submit" name="button" value="a11">${a11}</button></th>
            <th><button type="submit" name="button" value="a12">${a12}</button></th>
            <th><button type="submit" name="button" value="a13">${a13}</button></th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th><button type="submit" name="button" value="a21">${a21}</button></th>
            <td><button type="submit" name="button" value="a22">${a22}</button></td>
            <td><button type="submit" name="button" value="a23">${a23}</button></td>
        </tr>
        <tr>
            <th><button type="submit" name="button" value="a31">${a31}</button></th>
            <td><button type="submit" name="button" value="a32">${a32}</button></td>
            <td><button type="submit" name="button" value="a33">${a33}</button></td>
        </tr>
        </form>
        </tbody>
    </table>
</form>
<p align="center">Победа: ${Win}</p>
</body>
</html>