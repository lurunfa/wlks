<%@ page language="java" pageEncoding="UTF-8" %>

<!-- EasyUI -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/easyUI/themes/bootstrap/easyui.css"/>

<style>
.datagrid-header-row td {
	background-color: gray;
	color: #fff;
}

.datagrid-header .datagrid-cell span {
	font-size: 14px;
}

.datagrid-cell, .datagrid-cell-group, .datagrid-header-rownumber, .datagrid-cell-rownumber {
	font-size: 14px;
	font-family: 微软雅黑;
}

.tree-title {
	font-size: 14px;
	font-family: 微软雅黑;
}
</style>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/easyUI/themes/icon.css"></link>

<!-- 加载扩展自定义图标按钮 -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/easyUI/themes/myicon.css"></link>

<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery.js"></script>

<script type="text/javascript" src="<%=request.getContextPath()%>/resources/easyUI/jquery.easyui.min.js"></script>

<!-- 中文 -->
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/easyUI/locale/easyui-lang-zh_CN.js"></script>

<!-- 扩展EasyUI -->
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/easyUI/extEasyUI.js" charset="utf-8"></script>

<!-- 扩展jQuery -->
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/easyUI/extJquery.js" charset="utf-8"></script>

<!-- 扩展EasyUI Validate -->
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/easyUI/extEasyUIValidate.js" charset="utf-8"></script>