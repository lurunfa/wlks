<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<script type="text/javascript">
$(function () {
    function addTabs(tab){
        $('#content').tabs('add',{
            title:tab.text,
            closable:true,
            iconCls:tab.iconCls,
            content:'<iframe frameborder="0" scrolling="true" width="100%" height="100%" src="<%=basePath %>'+tab.url+'"></iframe>'
        });
    }

    addTabs({
        text:'欢迎使用后台管理系统',
        url:'/admin/welcome'
    });

    $('#tree_menu').tree({
        url:'admin/node/display',
        parentField:'pid',
        onClick:function(node){
            if(!$('#content').tabs('exists',node.text)){
                if(node.attributes){
                    addTabs({
                        text:node.text,
                        url:node.attributes.url,
                        iconCls:node.iconCls
                    });
                }
            }else{
                $('#content').tabs('select',node.text);
            }
        }
    })
})
</script>
<ul id="tree_menu" class="easyui-tree"></ul>
