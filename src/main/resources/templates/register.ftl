<#import "spring.ftl" as spring />
<html lang="en">
<head>
    <title>Registration</title>
</head>
<style>
    main {
        background: blueviolet;
    }

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
<@spring.bind "user"/>
<form action="/register" method="post">
    <h5>Name</h5>
    <@spring.formInput "user.name"/>
    <@spring.showErrors "<br>"/>
    <h5>Age</h5>
    <@spring.formInput "user.age"/>
    <@spring.showErrors "<br>" />
    <h5>E-mail</h5>
    <@spring.formInput "user.email"/>
    <h5>Password</h5>
    <@spring.formPasswordInput "user.pass"/>
    <@spring.showErrors "<br>"/>
    <br>
    <br>
    <button name="Finish" type="submit">Complete the registration</button>
</form>
</body>
</html>