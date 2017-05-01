<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<%@include file="/common/easyui.jsp" %>
<html>
<head>
    <base href="<%=basePath%>">
    <title>后台管理首页</title>
    <script type="text/javascript">
        $(function () {
            var tabs_content = $('#content');
            tabs_content.tabs({
                border:false,
                fit:true
            });
        })
    </script>
</head>
<body class="easyui-layout">>
    <div data-options="region:'north',href:'resources/views/layout/north.jsp'" style="overflow: hidden; height: 70px;"></div>

    <div data-options="region:'south',href:'resources/views/layout/south.jsp'" style="overflow: hidden; height: 30px;"></div>

    <div data-options="region:'west',href:'resources/views/layout/west.jsp',split:true" title="导航模块" style="overflow: hidden; width: 200px;"></div>

    <div data-options="region:'center'" title='欢迎使用 : 物流课设管理系统' style="overflow: hidden;">
        <div class="easyui-tabs" id="content"></div>
    </div>


</body>
</html>
