<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="resources/js/admin/order/orderadd.js"></script>
<link rel="stylesheet" href="resources/css/admin/order/orderadd.css"/>
<div class="easyui-panel" data-options="title:'新增订单',fit:true,border:false">
    <form id="order-form" class="orderinfo">
        <table class='order-table' style="width: 500px;margin-left: 20px;">
            <tr>
                <th><span class="requiredField">*</span>订单编号:</th>
                <td><input id="orderId" name="onumber"></td>
            </tr>
            <tr>
                <th><span class="requiredField">*</span>订单日期:</th>
                <td><input id="orderDate" name="orderDate" editable="false"></td>
            </tr>
            <tr>
                <th><span class="requiredField">*</span>订单金额:</th>
                <td><input id="money" name="money"></td>
            </tr>
        </table>
    </form>
    <div class='orderbuttons'>
        <a id=" doAdd" href="javascript:void(0)" class="easyui-linkbutton"
           data-options="iconCls:'icon-save',plain:false" onclick="submitData()">提交</a>
        <a id="doBack" href="javascript:void(0)" class="easyui-linkbutton"
           data-options="iconCls:'icon-redo',plain:false" onclick="cancel()">返回</a></div>
</div>
