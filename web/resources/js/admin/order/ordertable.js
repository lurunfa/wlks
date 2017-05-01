var datagrid;
var selectedOrder = undefined;
$(function () {
    datagrid = $("#dataGrid").datagrid({
        title: '订单',
        url:'admin/order/datagrid',
        pagination: true,
        pageSize: 20,
        fit: true,
        fitColumns: true,
        rownumbers: true,
        singleSelect: true,
        striped: true,
        remoteSort: true,
        border: false,
        idField: 'oid',
        sortName: 'oid',
        sortOrder: 'desc',
        columns: [[{
            field: 'oid',
            title: '订单id',
            sortable: false,
            align: 'center',
            checkbox: true
        },{
            field:'onumber',
            title: '订单编号',
            sortable: false,
            align: 'center',
            width:80
        },{
            field:'orderDate',
            title: '订单日期',
            sortable: false,
            align: 'center',
            width:100
        },{
            field:'money',
            title: '订单金额（元）',
            sortable: false,
            align: 'center',
            width:100
        }]],
        toolbar: '#toolbar',
        onLoadError: function () {
            $.messager.alert('错误', '无法获取数据', 'error');
        },
        onLoadSuccess: function () {
            datagrid.datagrid('clearSelections');
        }
    })
});
function addFun(){
    $('body').layout('panel','center').panel('refresh','admin/order/add');
}
function editFun(){
    selectedOrder =  datagrid.datagrid('getSelected');
    if (selectedOrder == undefined){
        $.messager.alert('提示', '请先选中要修改的订单', 'info');
    }else{
        $('body').layout('panel', 'center').panel('refresh', 'admin/order/edit?oid=' + selectedOrder.oid);
    }
}