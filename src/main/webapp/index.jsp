<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*"  %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false"%>
<html>
<body>
    <a href="/findTypez"><h1>添加商品</h1></a>
    <table border="1" cellpadding="0" width="100%">
        <tr>
            <td>商品编号</td>
            <td>商品名称</td>
            <td>商品价格</td>
            <td>商品图片</td>
            <td>出产日期</td>
            <td>商品类型</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${goods}" var="temp">
            <tr>
                <td>${temp.gid}</td>
                <td>${temp.gname}</td>
                <td>${temp.price}</td>
                <td>${temp.picture}</td>
                <td><f:formatDate value="${temp.yieldtime}"></f:formatDate></td>
                <td>${temp.typez.tname}</td>
                <td><a href="delGoods?gid=${temp.gid}">删除</a>&nbsp;<i>|</i>&nbsp;<a href="findOne?gid=${temp.gid}">修改</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
