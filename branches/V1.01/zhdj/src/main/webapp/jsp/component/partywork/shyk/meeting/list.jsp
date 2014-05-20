<%@page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@include file="../../../../common/dqdp_common.jsp" %>
<jsp:include page="../../../../common/dqdp_vars.jsp">
    <jsp:param name="dict" value="meetingWhetherEnd,meetingWhetherRecommend,newsInfoStatus"></jsp:param>
    <jsp:param name="permission" value="meetingManager,meetingSearch,meetingView,meetingAdd,meetingConclusion,meetingEdit,meetingDel,meetingRecommended,meetingRecord,meetingPush,meetingOut"></jsp:param>
    <jsp:param name="mustPermission" value=""></jsp:param>
</jsp:include>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>会议管理</title>
    <link href="${baseURL}/themes/${style}/css/common.css" rel="stylesheet" type="text/css"/>
    <link href="${baseURL}/themes/${style}/css/style.css" rel="stylesheet" type="text/css"/>
    <link href="${baseURL}/themes/${style}/css/modal.css" rel="stylesheet" type="text/css" />
    <script src="${baseURL}/js/do1/common/jquery-1.6.3.min.js"></script>
    <script src="${baseURL}/js/do1/common/common.js?ver=<%=jsVer%>"></script>
    <script src="${baseURL}/js/do1/common/error1.0.js"></script>
    <script src="${baseURL}/js/3rd-plug/jquery/jquery.form.js"></script>
    <script src="${baseURL}/js/do1/common/pop_up1.0.js"></script>
    <style type="text/css">
    </style>
</head>

<body style="background: #f6ebe5;" >
<!--头部 end-->


<!--公告 end-->
<form action="${baseURL}/meeting/meetingAction!ajaxSearch.action" method="post" id="form_search">
<div class="searchWrap">
    <div class="title clearfix">
        <h2 class="icon1">会议管理</h2>
    </div>
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
    	<tbody>
    		<tr>
        		<td class="searchLeft"></td>
    		</tr>
    	</tbody>
    </table>
</div>

<!-- 新闻类型信息搜索表单 -->
	<div class="text_bg">
    <div class="searchWrap">
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td class="searchLeft"></td>
                <td class="searchBg">
                    <table class="search" width="100%" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                            <td>
                                <table class="search" width="100%" border="0" cellspacing="0" cellpadding="0">

                                    <tr>
                                        <td width="40" height="30">标题：</td>
                                        <td>
                                        	<input type="text" name="searchValue.title" />
                                        </td>
                                        <td width="60" height="30">发布组织：</td>
                                        <td>
                                        	<input type="text" id="parentName" readonly="readonly"/>&nbsp;<img src="${baseURL}/image/ss_bt.png" onclick="selectParent()" />
                                        	<input type="hidden" id="parentId" name="searchValue.organizationId"/>
                                        </td>
                                        <td>发布状态：</td>
                                        <td><select name="searchValue.status" dictType="newsInfoStatus" defaultTip="全部"/></td>
                                        <td>
                                        	<input class="btnQuery" name="search" type="button" value="查询" permission="meetingSearch" onclick="javascript:doSearch(1);"/>
                                        	<input class="btnQuery" type="button" permission="meetingAdd" value="新增" onclick="javascript:window.location.href='add.jsp'+ '?dqdp_csrf_token='+dqdp_csrf_token" />
       										<input class="btnQuery" type="button" permission="meetingDel" value="删除" onclick="javascript:_doDel('meetingInfo_list');doSearch(1);"/>
										</td>
                                    </tr>

                                </table>
                            </td>
                        </tr>
                    </table>
                </td>
                <td class="searchRight"></td>
            </tr>
            <tr>
                <td class="searchButtomLeft"></td>
                <td class="searchButtom"></td>
                <td class="searchButtoRight"></td>
            </tr>
        </table>
    </div>
	<div id="meetingInfo_list" delUrl="${baseURL}/meeting/meetingAction!ajaxBatchDelete.action"></div>
	<div id="tip"></div>
	<div class="toolBar">
	    <div class="page" id="downIdPage">
	    </div>
	</div>
    </div>
</form>
<script type="text/javascript">

    $(document).ready(function () {
        doSearch(1);
    });
    function doSearch($pageIndex) {
        $('#form_search').ajaxSubmit({
            data:{
                'page':$pageIndex
            },
            dataType:'json',
            success:function (result) {
                if ("0" == result.code) {
                    var list1 = new ListTable(
                            {
                             	checkableColumn:"id",
                                title:[
                                    {width:"2%", name:"id", showName:"", isCheckColunm:true,
                                    	checkAble:function(index,content){
                                    		if(content.status == 1){
                                    			return false;
                                    		}else{
												return true;
											}
                                    	}
                                   	},
                                    {width:"25%", name:"title", showName:"标题",length:34},
                                    {width:"10%", name:"typeDesc", showName:"会议类型"},
                                    {width:"10%", name:"organizationName", showName:"发布组织"},
                                    {width:"6%", name:"carryOutStatus", showName:"开展状态"},
                                    {width:"6%", name:"statusDesc", showName:"发布状态"},
                                    {width:"40%", name:"operation", showName:"操作", isOperationColumn:true}
                                ],
                                data:result.data.pageData,
                                operations:[
                                    {name:"查看", permission:"meetingView", event:function (index, content) {
                                        window.location.href = 'view.jsp?id=' + content.id+ '&dqdp_csrf_token='+dqdp_csrf_token;
                                    }},
                                    {name:"二维码", permission:"meetingView", event:function (index, content) {
                                        window.location.href = '${baseURL}/jsp/component/partywork/shyk/meeting/recode.jsp?id=' + content.id+ '&type=1';
                                    }},
                                    {name:"会议记录", permission:"meetingView", event:function (index, content) {
                                         window.location.href="record.jsp?id="+ content.id+ '&dqdp_csrf_token='+dqdp_csrf_token;
                                    }},
                                    {name:"总结发布", permission:"meetingConclusion", condition:function (index, content) {
											return content.whetherEnd == 1;
											return true;
											},event:function (index, content) {
                                        window.location.href = '${baseURL}/jsp/component/news/tissuemien/edit.jsp?id=' + content.id+ '&type=0&backURL=${baseURL}/jsp/component/partywork/shyk/meeting/list.jsp&dqdp_csrf_token='+dqdp_csrf_token;
                                    }},
                                    {name:"编辑", permission:"meetingEdit", condition:function (index, content) {
											return content.status == 0;
											}, event:function (index, content) {
                                    	window.location.href = 'edit.jsp?id=' + content.id+ '&dqdp_csrf_token='+dqdp_csrf_token;
                                    }}, 
                                    {name:"发布", permission:"meetingPush", condition:function (index, content) {
											return content.status == 0;
											}, event:function (index, content) {
                                    	pushOrOut(content.id,1);
                                    }}, 
                                    {name:"下架", permission:"meetingOut", condition:function (index, content) {
											return content.status == 1;
											}, event:function (index, content) {
                                    	pushOrOut(content.id,2);
                                    }}, 
	                                {name:"删除", permission:"meetingDel", condition:function (index, content) {
											return content.status != 1;
											},event:function (index, content) {
	                                    _doSignlDel("meetingInfo_list", content.id);
	                                }}
                                    
                                ],
                                trStyle:["trWhite"]
                            });
                    list1.createList("meetingInfo_list");
                    var pager = new Pager({totalPages:result.data.maxPage, currentPage:result.data.currPage, funcName:"doSearch"});
                    pager.createPageBar("topIdPage");
                    pager.createPageBar("downIdPage");

                } else {
                    $("#tip").error({title:"错误", content:result.desc, button:[
                        {name:"确定", event:"_hideMsg()"}
                    ]});
                }
            },
            error:function () {
            }
        });
    }

 function selectParent(){
	window.open("${baseURL}/jsp/component/systemmgr/org/selectOrgList.jsp","_blank","width=800,height=400");
 } 
 
 function selectOrg(id,name){
	document.getElementById("parentId").value = id;
	document.getElementById("parentName").value = name ;
 } 
 
 function pushOrOut(id,type){
	 var alertDesc = type == 1 ? "确定发布?" :"确定下架?";
	if(confirm(alertDesc)){
	    $.ajax({
	        url: "${baseURL}/meeting/meetingAction!pushOrOut.action",
	        data: {"id": id,"type":type},
	        type: "post",
	        dataType: "json",
	        success: function (result) {
	            if ("0" == result.code) {
	                alert(result.desc);
	                doSearch(1);
	            } else {
	                alert(result.desc);
	            }
	        }
	     });
    }
 }
</script>
</body>
</html>
