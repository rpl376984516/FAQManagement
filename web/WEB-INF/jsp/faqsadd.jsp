
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>添加常见问题</title>
    <link rel="stylesheet" href="statics/css/main.css">
    <script type="text/javascript" src="statics/js/jquery-1.12.4.js"></script>
    <script type="text/javascript">
        jQuery(document).ready(function () {
            if(${flag!=null}){
                alert("添加常见问题失败！")
            }
        })

        function yz() {
            var classid=$("#classid").val();
            var title=$("#title").val();
            var content=$("#content").val();
            if (classid==null||classid==0){
                alert("请选择分类!");
                return false;
            } else if (title==null||title==""){
                alert("请填写标题!");
                return false;
            } else if (content==null||content==""){
                alert("请填写内容!");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>

<form id="tj" action="saveFaqs" onsubmit="return yz();">
    <p>
    <h2>添加常见问题</h2>
    </p>
    <p>
        <span>分类:</span>
        <select name="classid" id="classid">
            <option value="0">---请选择分类---</option>
            <c:forEach var="list" items="${classes}">
                <option value="${list.id}">${list.cname}</option>
            </c:forEach>
        </select>
    </p>
    <p>
        <span>标题:</span>
        <input type="text" name="title" id="title">
    </p>
    <p>
        <span style="vertical-align: top;">内容:</span>
        <textarea rows="6" cols="25" name="content" id="content"></textarea>
    </p>
    <p class="p">
        <input type="submit" value="保存">
        <input type="reset" value="重置">
        <input type="button" onclick="javascript:history.go(-1);" value="返回">
    </p>
</form>

</body>
</html>
