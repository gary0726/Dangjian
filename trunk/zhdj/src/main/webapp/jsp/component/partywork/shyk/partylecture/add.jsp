<%@ page import="cn.com.do1.common.util.web.WebUtil" %>
<%@page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@include file="../../../../common/dqdp_common.jsp" %>
<jsp:include page="../../../../common/dqdp_vars.jsp">
    <jsp:param name="dict" value="partyLectureType,meetingWay,meetingSmsNotice"></jsp:param>
    <jsp:param name="permission" value="partyLectureAdd"></jsp:param>
</jsp:include>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>起草党课</title>
    <link href="${baseURL}/themes/${style}/css/common.css" rel="stylesheet" type="text/css"/>
    <link href="${baseURL}/themes/${style}/css/style.css" rel="stylesheet" type="text/css" />
    <link href="${baseURL}/themes/${style}/css/modal.css" rel="stylesheet" type="text/css" />
    <link href="${baseURL}/themes/${style}/css/imgslide.css" rel="stylesheet" type="text/css" />
    <script src="${baseURL}/js/do1/common/jquery-1.6.3.min.js"></script>
    <script src="${baseURL}/js/do1/common/common.js"></script>
    <script src="${baseURL}/js/DatePicker/WdatePicker.js"></script>
    <script src="${baseURL}/js/3rd-plug/jquery/jquery.form.js"></script>
    <script src="${baseURL}/js/3rd-plug/kindeditor/kindeditor.js"></script>
    <script src="${baseURL}/js/3rd-plug/kindeditor/lang/zh_CN.js"></script>
	<script type="text/javascript" src="${baseURL}/js/do1/common/HashMap.js"></script>
	<script type="text/javascript" src="${baseURL}/js/do1/common/DataTable.js"></script>
</head>

<body style="background: #f6ebe5;" >
<form action="${baseURL}/partyLecture/partyLectureAction!ajaxSave.action" method="post" id="id_form_search">
    <div class="searchWrap">
        <div class="title">
            <h2 class="icon1">起草党课</h2>
        </div>
    </div>
    <div class="text_bg noneborder" id="bt">
    <table class="tableCommon mt5" width="100%" border="0" cellspacing="0" cellpadding="0">
        <tbody>
        <tr>
            <td class="tdBlue"><span style="color: red">*</span>&nbsp;标题</td>
            <td  >
            	<input type="hidden" name="tbPartyLecturePO.id"/>
                <input type="text" id="title" name="tbPartyLecturePO.title" valid="{must:true,tip:'标题',fieldType:'pattern'}"/>&nbsp;&nbsp;&nbsp;
            </td>
        </tr>
        <tr>
            <td class="tdBlue"><span style="color: red">*</span>&nbsp;党课类型</td>
            <td >
                <select dictType="partyLectureType" defaultTip="" name="tbPartyLecturePO.type" id="type" valid="{must:true,tip:'党课类型',fieldType:'pattern'}"/>
            </td>
        </tr>
        <tr>
            <td  class="tdBlue"><span style="color: red">*</span>&nbsp;党课召开方式</td>
            <td>
            	<input type="radio" dictType="meetingWay"  defaultValue="0" name="tbPartyLecturePO.way" id="way" valid="{must:true,tip:'党课召开方式',fieldType:'pattern'}"/>
            </td>
        </tr>
        <tr>
            <td class="tdBlue"><span style="color: red">*</span>&nbsp;党课时间</td>
            <td>开始
				<input
					onFocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',autoPickDate:true,readOnly:true,isShowWeek:true,minDate:'%y-%M-{%d} %H-%m-%s',maxDate:'#F{$dp.$D(\'endTime\')||\'2020-10-01\'}'})"
					type="text" style="width: 200px"
					name="tbPartyLecturePO.startTime"
					valid="{must:true,tip:'开始时间',fieldType:'pattern'}" id="startTime"/>
            	&nbsp;&nbsp;结束 
				<input
					onFocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',autoPickDate:true,readOnly:true,isShowWeek:true,minDate:'%y-%M-{%d} %H-%m-%s',minDate:'#F{$dp.$D(\'startTime\')}',maxDate:'2020-10-01'})"
					type="text" style="width: 200px"
					name="tbPartyLecturePO.endTime"
					valid="{must:true,tip:'结束时间',fieldType:'pattern'}" id="endTime"/>
            </td>
        </tr>
        <tr>
            <td class="tdBlue"><span style="color: red">*</span>&nbsp;党课地点</td>
            <td >
            	<input type="text" id="title" name="tbPartyLecturePO.address" valid="{must:true,tip:'党课地点',fieldType:'pattern'}"/>&nbsp;&nbsp;&nbsp;
            </td>
        </tr>
        <tr>
            <td class="tdBlue">参与人员</td>
            <td>
            	<div id="user_list"></div><input class="greenbtn mr10" type="button" value="选择用户"  onclick="javascript:selectUser();">
            	<input id="userIds" type="hidden" name="userIds"/>
            </td>
        </tr>
        <tr>
            <td class="tdBlue"><span style="color: red">*</span>&nbsp;党课内容</td>
            <td >
               <textarea rows="5" cols="80" name="tbPartyLecturePO.content" id="content" valid="{must:true,tip:'党课内容',fieldType:'pattern'}"></textarea>
            </td>
        </tr>
        <tr>
            <td class="tdBlue">短信通知</td>
            <td >
               <input type="checkbox" value="1" style="width: 15px;height: 10px;" name="tbPartyLecturePO.smsNotice" id="smsNotice" />
               	(勾选后，将以短信的方式发送到参与人员的手机)
            </td>
        </tr>
        </tbody>
    </table>
	</div>


<div class="toolBar">
    <div align="center">
    	<input class="greenbtn mr10" type="button" id="save" permission="partyLectureAdd" value="保存"/>&nbsp;
    	<input class="greenbtn mr10" type="button" onclick="javascript:history.back();" value="返 回"/>
    </div>
</div>

<!--工具栏 end-->

<script type="text/javascript">
 var userMap = new HashMap();
 
  $(document).ready(function(){
	   updateUser();
	    document.getElementById("save").disabled = false;
	    flashIframe_GDZC();
   
  });
    
    
 $('#save').click(function(){ 
	for (var i = 0; i < _editors.values().length; i++)  _editors.values()[i].sync();
    var dqdp = new Dqdp();
    if (dqdp.submitCheck("id_form_search")) {
         document.getElementById("save").disabled = true; 
        // 提交数据
        $('#id_form_search').ajaxSubmit({
            dataType:'json',
            success:function(result) {
                if ("0"==result.code) {
                    alert(result.desc);
                    window.location.href="list.jsp";
                   
                } else {
                    alert(result.desc);
                }
            },
            error:function(){
                alert('保存失败，请稍候再试');    
            } 
        });
    }});
 
 function selectUser() {
     window.open('${baseURL}/jsp/component/basis/partymenber/multiSelecttPartyMember.jsp', '用户选择', 'height=600, width=1000, toolbar=no,scrollbars=yes, menubar=no, resizable=yes,location=no, status=no');
 }


 function getUserMap() {
     return userMap;
 }

 function updateUser() {
     $('#userIds').val(userMap.keys().join(","));
     var userTable = new DataTable({
         data: userMap.values(),
         colsCount:8
     });
     userTable.createTable("user_list");
     window.parent._resetFrameHeight(1);
 }
 
     function flashIframe_GDZC(){
    	var i=parent.document.getElementById("ifm");
    	if(i!=null)
    	{	
    		if(document.body.scrollHeight<700)
    		{
    			i.style.height ="730px";
    		}else
    		{
    			i.style.height = (document.body.scrollHeight+30)+"px";
    		}
    	}
    }
</script>
</form>
</body>
</html>
