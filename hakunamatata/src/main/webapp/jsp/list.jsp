<%--
  Created by IntelliJ IDEA.
  User: ruoquan
  Date: 2019-07-24
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>数据显示页面</title>
</head>
<body>
    <div align="center">
    <h1>列表显示所有的数据</h1>
    <table>
        <table align="center" border="1px solid red">
            <thead>
            <tr>
                <td>序号</td>
                <td>书籍名称</td>
                <td>作者</td>
                <td>价格</td>
                <td>出版时间</td>
                <td>操作</td>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>1</td>
                <td>红楼梦</td>
                <td>曹雪芹</td>
                <td>188.00元</td>
                <td>1993/2/2</td>
                <td><a href="#">修改</a></td>
            </tr>
            <tr>
                <td>2</td>
                <td>西游记</td>
                <td>吴承恩</td>
                <td>99.00元</td>
                <td>1996/3/3</td>
                <td><a href="#">修改</a></td>
            </tr>
            <tr>
                <td>3</td>
                <td>三国演义</td>
                <td>罗贯中</td>
                <td>299.00元</td>
                <td>2000/4/4</td>
                <td><a href="#">修改</a></td>
            </tr>
            </tbody>
        </table>
    </table>
</div>
</body>
</html>
