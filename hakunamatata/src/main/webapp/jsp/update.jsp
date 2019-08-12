<%--
  Created by IntelliJ IDEA.
  User: ruoquan
  Date: 2019-07-25
  Time: 08:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
    <div align="center">
    <h1>修改表单</h1>
    <form action="list.html" method="post">
        <table>
            <tr>
                <td>书籍名称</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>作者</td>
                <td><input type="text" name="author"></td>
            </tr>
            <tr>
                <td>price</td>
                <td><input type="text" name="price"></td>
            </tr>
            <tr>
                <td>出版时间</td>
                <td><input type="date" name="publish_time"></td>
            </tr>
            <tr>
                <td><input type="reset" value="重置"></td>
                <td><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
