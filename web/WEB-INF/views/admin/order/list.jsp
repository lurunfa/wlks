<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <title>order</title>
    <%@ include file="/common/easyui.jsp"%>
</head>

<body class="easyui-layout" data-options="fit:true">
<div data-options="region:'center',href:'admin/order/ordertable',border:true"></div>
</body>
</html>