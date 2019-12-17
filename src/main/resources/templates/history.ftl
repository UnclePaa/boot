<#import "spring.ftl" as spring />
<html lang="en">
<head><title>History</title></head>
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
<h1>History of your calculations</h1>
<body>
<button type="submit" name="Calculator">
    <a href="/calculator" style="color: brown">Calculator</a>
</button>
<br>
<button>
    <a href="/myroom" style="color: brown">Personal chamber</a>
</button>
<br>
<br>
<fieldset>
    <#list history as item>
        The result ${item.result} <br>
    </#list>
    <br>
</fieldset>
</body>
</html>