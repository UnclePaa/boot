<#import "spring.ftl" as spring />
<html lang="en">
<head>
    <title>Authentication</title>
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
<h1>Please fill the form below</h1>
<br>
<@spring.bind "authuser"/>
<form action="/authenticate" method="post">
    <h5>E-mail</h5>
    <@spring.formInput "authuser.email"/>
    <br>
    <@spring.showErrors "<br>"/>
    <br>
    <h5>Password</h5>
    <@spring.formPasswordInput "authuser.pass"/>
    <@spring.showErrors "<br>"/>
    <br>
    <br>
    <button name="Finish" type="submit">Authorise me</button>
    <br>
    <br>
    <br>
    <button name="My Room" type="submit">
        <a href="/myroom">Go to personal chamber</a>
    </button>
</form>
</body>
</html>