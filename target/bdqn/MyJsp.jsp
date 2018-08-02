<%--
  Created by IntelliJ IDEA.
  User: 丶安沫轩
  Date: 2018/8/2
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${goodz==null?'addGood':'updGood'}" method="post" enctype="multipart/form-data">
        <input hidden value="${goodz.gid}" name="gid">
        商品名称：<input value="${goodz.gname}" name="gname"><br>
        商品价格：<input value="${goodz.price}" name="price"><br>
        商品图片：<input value="${goodz.picture}" name="pic" type="file"><br>
        出产日期：<input value="${goodz.yieldtime}" name="yieldtime"><br>
        商品类型：<select id="typez.gid">
                        <c:forEach items="${typez}" var="temp">
                            <option <c:if test="${temp.tid==goodz.typez.tid}">selected</c:if>
                                    value="${temp.tid}">${temp.tname}</option>
                        </c:forEach>
                 </select><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
