<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/easyui.jsp"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
          + path + "/";
%>
<html>
<head>
  <base href="<%=basePath%>">
  <title>物流课设登录页面</title>
  <script type="text/javascript">
      $(function(){

      })
      function ok() {
          $('#loginForm').form('submit',{
              onSubmit:function(){
                  return $(this).form('enableValidation').form('validate');
              }
          });
      }
  </script>

</head>
<body>
<div  class="easyui-dialog" title="登录" style="width:400px;height:200px;padding:10px"
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
    <table style="margin: auto;padding-top: 20px">
      <tr>
        <th align="right">用户名：</th>
        <td><input class="easyui-validatebox" type="text" name="name" data-options="required:true,novalidate:true"/>
      </tr>
      <tr>
        <th align="right">密码：</th>
        <td><input class="easyui-validatebox" type="text" name="password" data-options="required:true,novalidate:true"/>
      </tr>
    </table>
  </form>
</div>

</div>
</body>
</html>
