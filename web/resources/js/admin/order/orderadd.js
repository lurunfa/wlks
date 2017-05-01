$(function(){
   $.ajax({
       url:"admin/order/generateOnumber",
       success:function(data){
           data = $.parseJSON(data);

           if(data.success){
               $("#orderId").val(data.object);
           }
       }
   })
    $("#orderDate").datebox({
        novalidate:true,
        required:true
    })
    $("#money").validatebox({
        novalidate:true,
        required:true
    })
});
function cancel() {
    $('body').layout('panel', 'center').panel('refresh', 'admin/order/ordertable');
}
function submitData(){
    $('#order-form').form('submit',{
        url:'admin/order/addOrder',
        onSubmit: function (param) {
            if ($(this).form('enableValidation').form('validate')) {
                parent.$.messager.progress({
                    title: '提示',
                    text: '数据处理中，请稍后....'
                });
                return true;
            } else {
                return false;
            }
        },
        success:function (result) {
            parent.$.messager.progress('close');
            result = $.parseJSON(result);
            if (result.success) {
                parent.$.messager.alert('提示', result.msg, 'info');
                cancel();
            } else {
                parent.$.messager.alert('错误', result.msg, 'error');
            }
        }
    })
}