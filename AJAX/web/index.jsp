<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="lib/jquery-3.2.1.min.js"></script>
    <style>
        #main {
            margin: auto;
            width: 600px;
            height: 400px;
            border: 10px solid grey;

        }

        tr td:first-child {
            text-align: right;
            font-size: 20px;
            width: 150px;
        }

        tr td:last-child input[type='text'] {
            margin-left: 15px;
            width: 250px;
            border-radius: 5px;
            outline: 0px;
            font-size: 20px;
        }

        body {
            background: darkgray;
        }

        input[type="submit"] {
            margin-left: 15px;
            width: 120px;
            height: 35px;
            font-size: 16px;

        }

        .error {
            color: red;
        }

        .ok {
            color: green;
        }

        span {
            margin-left: 5px;
        }
    </style>
</head>
<body>


<table id="main">
    <tr>
        <td><label>图书编码</label></td>
        <td><input type="text"><span class="error">格式有误</span></td>
    </tr>
    <tr>
        <td><label>图书名称</label></td>
        <td><input type="text"><span class="ok">格式正确</span></td>
    </tr>
    <tr>
        <td><label>图书作者</label></td>
        <td><input type="text"></td>
    </tr>
    <tr>
        <td><label>图书价格</label></td>
        <td><input type="text"></td>
    </tr>

    <tr>
        <td><label>图书出版社</label></td>
        <td><input type="text"></td>
    </tr>
    <tr>
        <td></td>
        <td><input type="button" value="添加图书" onclick="sendAjax()"></td>
    </tr>
</table>
<script>
    function sendAjax() {
        console.log(1);
    }
</script>
</body>
</html>