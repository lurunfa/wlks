<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="resources/js/admin/order/ordertable.js" charset="utf-8"></script>
<div id="toolbar" style="display: none;">
    <a href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'pencil_add'" onclick="addFun();">添加</a>
    <a href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'pencil_go'" onclick="editFun();">编辑</a>
    <a href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'pencil_delete'" onclick="deleteFun();">删除</a>
    <a href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'transmit'" onclick="refreshFun();">刷新</a>
    <a href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'pencil_go'" onclick="editDetailFun();">编辑明细</a>
</div>
<table id="dataGrid"></table>

