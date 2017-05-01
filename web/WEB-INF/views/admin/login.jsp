<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/easyui.jsp" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>物流课设登录页面</title>
    <script type="text/javascript" src="resources/js/admin/login.js"></script>
    <link rel="stylesheet" href="resources/css/admin/login.css"/>
</head>
<body>
<div id="login-dialog" class="easyui-dialog" title="登录" style="width:400px;height:200px;padding:10px"
     data-options="
                modal:true,
                closable:false,
				iconCls: 'icon-save',
				buttons: [{
					text:'Ok',
					iconCls:'icon-ok',
					handler:function(){
						ok();
					}
				},{
					text:'Cancel',
					handler:function(){

					}
				}]
			">
    <form id="loginForm" class="easyui-form" method="post" data-options="novalidate:true">
        <table>
            <tr>
                <th align="right">用户名：</th>
                <td><input class="easyui-validatebox" type="text" name="name" data-options="required:true,novalidate:true"/></td>
            </tr>
            <tr>
                <th align="right">密码：</th>
                <td><input class="easyui-validatebox" type="text" name="password" data-options="required:true,novalidate:true"/></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
