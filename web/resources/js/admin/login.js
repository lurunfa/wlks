$(function () {

});
function ok() {
    $('#loginForm').form('submit', {
        url: '/admin/login',
        onSubmit: function () {
            return $(this).form('enableValidation').form('validate');
        },
        success: function (data) {
            data = $.parseJSON(data);
            if (data.success) {
                parent.$.messager.alert('提示', data.message, 'info', function () {
                    window.location.reload();
                });

            } else {
                parent.$.messager.alert('错误', data.message, 'error');
            }
        }

    });
}