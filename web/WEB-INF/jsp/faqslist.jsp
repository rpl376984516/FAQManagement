<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>常见问题检索</title>
    <link rel="stylesheet" href="statics/css/main.css">
</head>
<body>

<table cellpadding="3" cellspacing="3">
    <tr>
        <th colspan="5">常见问题检索</th>
    </tr>
    <tr>
        <td colspan="5">
            <a href="faqsadd">添加常见问题</a>
        </td>
    </tr>
    <tr style="background-color: aquamarine;">
        <td width="60px">编号</td>
        <td width="250px">标题</td>
        <td width="80px">分类</td>
        <td width="90px">创建时间</td>
        <td width="60px">操作</td>
    </tr>
    <c:forEach var="list" items="${faqsList}" varStatus="i">
        <tr <c:if test="${i.count%2==0}">style="background-color: lightskyblue;" </c:if>>
            <td>${list.id}</td>
            <td>${list.title}</td>
            <td>${list.cname}</td>
            <td><fm:formatDate value="${list.createdate}" pattern="yyyy-MM-dd"/></td>
            <td><a href="deleteFaqs?id=${list.id}" onclick="return confirm('你确定要删除吗？')">删除</a></td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="5">
            <p>
                <c:if test="${page.currentPageNo>1}">
                    <a href="faqsList?pageIndex=1">首页</a>
                    <a href="faqsList?pageIndex=${page.currentPageNo-1}">上一页</a>
                </c:if>
                <c:if test="${page.currentPageNo<page.totalPageCount}">
                    <a href="faqsList?pageIndex=${page.currentPageNo+1}">下一页</a>
                    <a href="faqsList?pageIndex=${page.totalPageCount}">尾页</a>
                </c:if>
            </p>
        </td>
    </tr>
</table>

</body>
</html>
