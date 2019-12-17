<#import "spring.ftl" as spring />
<html lang="en">
<head>
    <title>Calculator</title>
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
            color: black;
        }
    </style>
</head>
<body>
<h1>Please enter the data to calculate</h1>
<br>
<@spring.bind "calcData"/>
<form action="/calculator" method="post">
    <fieldset>
        <h5>First number</h5>
        <@spring.formInput "calcData.num1"/>
        <@spring.showErrors "<br>"/>
        <br>
        <h5>Second number</h5>
        <@spring.formInput "calcData.num2"/>
        <@spring.showErrors "<br>" />
        <h5>and now please type one of the following: [sum, sub, mult or div] depending on your wishes...</h5>
        <@spring.formInput "calcData.act"/>
        <@spring.showErrors "<br"/>
    </fieldset>
    <br>
    <h5>Just FIO:
        <br>
        ...sum (+)...sub (-)...mult (*)...div (/)...
        <br>
    </h5>

    <input type="submit" value="Calculate it !!!">
    <br>
    <h5>Check the history of your calculations</h5>
    <button name="History" type="submit">
        <a href="/history">History</a>
    </button>
</form>
</body>
</html>