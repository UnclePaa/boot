<#import "spring.ftl" as spring />
<html lang="en">
<head>
    <title>Welcome!</title>
</head>
<style>
    input {
        margin: 5px;
    }

    button {
        margin: 5px;
        color: darkgreen;
    }

    h1 {
        color: darkgreen;
    }

    h5 {
        color: red;
    }
</style>
<body>
<h1>Welcome!</h1>
<br>
<button name="Registration" type="submit">
    <a href="/register">Registration</a>
</button>
<br>
<button name="Authorisation" type="submit">
    <a href="/authenticate">Authorisation</a>
</button>
</body>
</html>