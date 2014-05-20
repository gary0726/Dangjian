package cn.com.do1.component.shyk.partylecture.model;

import cn.com.do1.common.annotation.bean.DictDesc;
import cn.com.do1.common.annotation.bean.FormatMask;
import cn.com.do1.common.annotation.bean.PageView;
import cn.com.do1.common.annotation.bean.Validation;
import cn.com.do1.common.annotation.po.LargeObject;
import cn.com.do1.common.framebase.dqdp.IBaseDBVO;
import cn.com.do1.common.util.reflation.ConvertUtil;

/**
 * Copyright &copy; 2010 广州市道一信息技术有限公司 All rights reserved. User: ${user}
 */
public class TbPartyLecturePO implements IBaseDBVO {
	private java.lang.String id;
	@Validation(must = false, length = 100, fieldType = "pattern", regex = "^.*$")
	@PageView(showName = "title", showType = "input", showOrder = 1, showLength = 100)
	private java.lang.String title;
	@Validation(must = false, length = 22, fieldType = "pattern", regex = "^.*$")
	@PageView(showName = "type", showType = "input", showOrder = 2, showLength = 22)
	@DictDesc(refField = "type", typeName = "partyLectureType")
	private java.lang.Long type;
	@Validation(must = false, length = 36, fieldType = "pattern", regex = "^.*$")
	@PageView(showName = "organizationId", showType = "input", showOrder = 3, showLength = 36)
	private java.lang.String organizationId;
	@Validation(must = false, length = 22, fieldType = "pattern", regex = "^.*$")
	@PageView(showName = "whetherEnd", showType = "input", showOrder = 4, showLength = 22)
	private java.lang.Long whetherEnd;
	@Validation(must = false, length = 22, fieldType = "pattern", regex = "^.*$")
	@PageView(showName = "whetherRecommend", showType = "input", showOrder = 5, showLength = 22)
	private java.lang.Long whetherRecommend;
	@Validation(must = false, length = 7, fieldType = "datetime", regex = "")
	@PageView(showName = "startTime", showType = "datetime", showOrder = 6, showLength = 7)
	@FormatMask(type = "date", value = "yyyy-MM-dd HH:mm:ss")
	private java.util.Date startTime;
	@Validation(must = false, length = 7, fieldType = "datetime", regex = "")
	@PageView(showName = "endTime", showType = "datetime", showOrder = 7, showLength = 7)
	@FormatMask(type = "date", value = "yyyy-MM-dd HH:mm:ss")
	private java.util.Date endTime;
	@Validation(must = false, length = 22, fieldType = "pattern", regex = "^.*$")
	@PageView(showName = "way", showType = "input", showOrder = 8, showLength = 22)
	private java.lang.Long way;
	@Validation(must = false, length = 200, fieldType = "pattern", regex = "^.*$")
	@PageView(showName = "address", showType = "input", showOrder = 9, showLength = 200)
	private java.lang.String address;
	@Validation(must = false, length = 1000, fieldType = "pattern", regex = "^.*$")
	@PageView(showName = "content", showType = "input", showOrder = 10, showLength = 1000)
	private java.lang.String content;
	@LargeObject
	@Validation(must = false, length = 4000, fieldType = "pattern", regex = "^\\w*$")
	@PageView(showName = "record", showType = "editor", showOrder = 11, showLength = 4000)
	private String record;
	@Validation(must = false, length = 200, fieldType = "pattern", regex = "^.*$")
	@PageView(showName = "qrCode", showType = "input", showOrder = 12, showLength = 200)
	private java.lang.String qrCode;
	@Validation(must = false, length = 22, fieldType = "pattern", regex = "^.*$")
	@PageView(showName = "smsNotice", showType = "input", showOrder = 13, showLength = 22)
	private java.lang.Long smsNotice;
	@Validation(must = false, length = 36, fieldType = "pattern", regex = "^.*$")
	@PageView(showName = "createUserId", showType = "input", showOrder = 14, showLength = 36)
	private java.lang.String createUserId;
	@Validation(must = false, length = 50, fieldType = "pattern", regex = "^.*$")
	@PageView(showName = "createUserName", showType = "input", showOrder = 14, showLength = 36)
	private java.lang.String createUserName;
	@Validation(must = false, length = 7, fieldType = "datetime", regex = "")
	@PageView(showName = "createTime", showType = "datetime", showOrder = 15, showLength = 7)
	private java.util.Date createTime;
	@Validation(must = false, length = 22, fieldType = "pattern", regex = "^.*$")
	@PageView(showName = "auditStatus", showType = "input", showOrder = 16, showLength = 22)
	private java.lang.Long auditStatus;
	@Validation(must = false, length = 36, fieldType = "pattern", regex = "^.*$")
	@PageView(showName = "auditUserId", showType = "input", showOrder = 17, showLength = 36)
	private java.lang.String auditUserId;
	@Validation(must = false, length = 7, fieldType = "datetime", regex = "")
	@PageView(showName = "auditTime", showType = "datetime", showOrder = 18, showLength = 7)
	@FormatMask(type = "date", value = "yyyy-MM-dd HH:mm:ss")
	private java.util.Date auditTime;
	@Validation(must = false, length = 36, fieldType = "pattern", regex = "^.*$")
	@PageView(showName = "pushUserId", showType = "input", showOrder = 19, showLength = 36)
	private java.lang.String pushUserId;
	@Validation(must = false, length = 7, fieldType = "datetime", regex = "")
	@PageView(showName = "pushTime", showType = "datetime", showOrder = 20, showLength = 7)
	@FormatMask(type = "date", value = "yyyy-MM-dd HH:mm:ss")
	private java.util.Date pushTime;
	@Validation(must = false, length = 22, fieldType = "pattern", regex = "^.*$")
	@PageView(showName = "status", showType = "input", showOrder = 21, showLength = 22)
	private java.lang.Long status;

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	public java.lang.String getTitle() {
		return this.title;
	}

	public void setType(java.lang.Long type) {
		this.type = type;
	}

	public java.lang.Long getType() {
		return this.type;
	}

	public void setOrganizationId(java.lang.String organizationId) {
		this.organizationId = organizationId;
	}

	public java.lang.String getOrganizationId() {
		return this.organizationId;
	}

	public void setWhetherEnd(java.lang.Long whetherEnd) {
		this.whetherEnd = whetherEnd;
	}

	public java.lang.Long getWhetherEnd() {
		return this.whetherEnd;
	}

	public void setWhetherRecommend(java.lang.Long whetherRecommend) {
		this.whetherRecommend = whetherRecommend;
	}

	public java.lang.Long getWhetherRecommend() {
		return this.whetherRecommend;
	}

	public void setStartTime(java.util.Date startTime) {
		this.startTime = startTime;
	}

	public void setStartTime(java.lang.String startTime) {
		this.startTime = ConvertUtil.cvStUtildate(startTime);
	}

	public java.util.Date getStartTime() {
		return this.startTime;
	}

	public void setEndTime(java.util.Date endTime) {
		this.endTime = endTime;
	}

	public void setEndTime(java.lang.String endTime) {
		this.endTime = ConvertUtil.cvStUtildate(endTime);
	}

	public java.util.Date getEndTime() {
		return this.endTime;
	}

	public void setWay(java.lang.Long way) {
		this.way = way;
	}

	public java.lang.Long getWay() {
		return this.way;
	}

	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	public java.lang.String getAddress() {
		return this.address;
	}

	public void setContent(java.lang.String content) {
		this.content = content;
	}

	public java.lang.String getContent() {
		return this.content;
	}

	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}

	public void setQrCode(java.lang.String qrCode) {
		this.qrCode = qrCode;
	}

	public java.lang.String getQrCode() {
		return this.qrCode;
	}

	public void setSmsNotice(java.lang.Long smsNotice) {
		this.smsNotice = smsNotice;
	}

	public java.lang.Long getSmsNotice() {
		return this.smsNotice;
	}

	public void setCreateUserId(java.lang.String createUserId) {
		this.createUserId = createUserId;
	}

	public java.lang.String getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	public void setCreateTime(java.lang.String createTime) {
		this.createTime = ConvertUtil.cvStUtildate(createTime);
	}

	public java.util.Date getCreateTime() {
		return this.createTime;
	}

	public void setAuditStatus(java.lang.Long auditStatus) {
		this.auditStatus = auditStatus;
	}

	public java.lang.Long getAuditStatus() {
		return this.auditStatus;
	}

	public void setAuditUserId(java.lang.String auditUserId) {
		this.auditUserId = auditUserId;
	}

	public java.lang.String getAuditUserId() {
		return this.auditUserId;
	}

	public void setAuditTime(java.util.Date auditTime) {
		this.auditTime = auditTime;
	}

	public void setAuditTime(java.lang.String auditTime) {
		this.auditTime = ConvertUtil.cvStUtildate(auditTime);
	}

	public java.util.Date getAuditTime() {
		return this.auditTime;
	}

	public void setPushUserId(java.lang.String pushUserId) {
		this.pushUserId = pushUserId;
	}

	public java.lang.String getPushUserId() {
		return this.pushUserId;
	}

	public void setPushTime(java.util.Date pushTime) {
		this.pushTime = pushTime;
	}

	public void setPushTime(java.lang.String pushTime) {
		this.pushTime = ConvertUtil.cvStUtildate(pushTime);
	}

	public java.util.Date getPushTime() {
		return this.pushTime;
	}

	public void setStatus(java.lang.Long status) {
		this.status = status;
	}

	public java.lang.Long getStatus() {
		return this.status;
	}

	public java.lang.String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserName(java.lang.String createUserName) {
		this.createUserName = createUserName;
	}

	/**
	 * 获取数据库中对应的表名
	 * 
	 * @return
	 */
	public String _getTableName() {
		return "TB_PARTY_LECTURE";
	}

	/**
	 * 获取对应表的主键字段名称
	 * 
	 * @return
	 */
	public String _getPKColumnName() {
		return "id";
	}

	/**
	 * 获取主键值
	 * 
	 * @return
	 */
	public String _getPKValue() {
		return String.valueOf(id);
	}

	/**
	 * 设置主键的值
	 * 
	 * @return
	 */
	public void _setPKValue(Object value) {
		this.id = (java.lang.String) value;
	}

	/**
	 * 重写默认的toString方法，使其调用输出的内容更有意义
	 */
	public String toString() {
		return id;
	}
}
