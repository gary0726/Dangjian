package cn.com.do1.component.mobileclient.userinfo.vo;

import cn.com.do1.common.annotation.bean.DictDesc;
import cn.com.do1.common.annotation.bean.FormatMask;

/**
 * Copyright ? 广州市道一信息技术有限公司
 * All rights reserved.
 */
public class CrowdUserInfoVO {
	private java.lang.String id;
	private java.lang.String userName;
	private java.lang.String password;
	private java.lang.String name;
	private java.lang.String sex;
	@DictDesc(refField = "sex", typeName = "personSex")
	private java.lang.String sexDesc;
	private java.lang.String idCard;
	@FormatMask(type = "date", value = "yyyy-MM-dd")
	private java.lang.String regTime;
	private java.lang.String registeredChannels;
	@DictDesc(refField = "registeredChannels", typeName = "registeredChannels")
	private java.lang.String registeredChannelsDesc;
	private java.lang.String degree;
	@DictDesc(refField = "degree", typeName = "degree")
	private java.lang.String degreeDesc;
	private java.lang.String politicalLandscape;
	@DictDesc(refField = "politicalLandscape", typeName = "politicalLandscape")
	private java.lang.String politicalLandscapeDesc;
	private java.lang.String birthday;
	private java.lang.String email;
	private java.lang.String mobile;
	private java.lang.String qq;
	private java.lang.String homeAddress;
	private java.lang.String note;
	private java.lang.String portraitPic;
	private java.lang.String state;
	@DictDesc(refField = "state", typeName = "userState")
	private java.lang.String stateDesc;
	public java.lang.String getId() {
		return id;
	}
	public void setId(java.lang.String id) {
		this.id = id;
	}
	public java.lang.String getUserName() {
		return userName;
	}
	public void setUserName(java.lang.String userName) {
		this.userName = userName;
	}
	public java.lang.String getPassword() {
		return password;
	}
	public void setPassword(java.lang.String password) {
		this.password = password;
	}
	public java.lang.String getName() {
		return name;
	}
	public void setName(java.lang.String name) {
		this.name = name;
	}
	public java.lang.String getSex() {
		return sex;
	}
	public void setSex(java.lang.String sex) {
		this.sex = sex;
	}
	public java.lang.String getSexDesc() {
		return sexDesc;
	}
	public void setSexDesc(java.lang.String sexDesc) {
		this.sexDesc = sexDesc;
	}
	public java.lang.String getIdCard() {
		return idCard;
	}
	public void setIdCard(java.lang.String idCard) {
		this.idCard = idCard;
	}
	public java.lang.String getRegTime() {
		return regTime;
	}
	public void setRegTime(java.lang.String regTime) {
		this.regTime = regTime;
	}
	public java.lang.String getRegisteredChannels() {
		return registeredChannels;
	}
	public void setRegisteredChannels(java.lang.String registeredChannels) {
		this.registeredChannels = registeredChannels;
	}
	public java.lang.String getRegisteredChannelsDesc() {
		return registeredChannelsDesc;
	}
	public void setRegisteredChannelsDesc(java.lang.String registeredChannelsDesc) {
		this.registeredChannelsDesc = registeredChannelsDesc;
	}
	public java.lang.String getDegree() {
		return degree;
	}
	public void setDegree(java.lang.String degree) {
		this.degree = degree;
	}
	public java.lang.String getDegreeDesc() {
		return degreeDesc;
	}
	public void setDegreeDesc(java.lang.String degreeDesc) {
		this.degreeDesc = degreeDesc;
	}
	public java.lang.String getPoliticalLandscape() {
		return politicalLandscape;
	}
	public void setPoliticalLandscape(java.lang.String politicalLandscape) {
		this.politicalLandscape = politicalLandscape;
	}
	public java.lang.String getPoliticalLandscapeDesc() {
		return politicalLandscapeDesc;
	}
	public void setPoliticalLandscapeDesc(java.lang.String politicalLandscapeDesc) {
		this.politicalLandscapeDesc = politicalLandscapeDesc;
	}
	public java.lang.String getBirthday() {
		return birthday;
	}
	public void setBirthday(java.lang.String birthday) {
		this.birthday = birthday;
	}
	public java.lang.String getEmail() {
		return email;
	}
	public void setEmail(java.lang.String email) {
		this.email = email;
	}
	public java.lang.String getMobile() {
		return mobile;
	}
	public void setMobile(java.lang.String mobile) {
		this.mobile = mobile;
	}
	public java.lang.String getQq() {
		return qq;
	}
	public void setQq(java.lang.String qq) {
		this.qq = qq;
	}
	public java.lang.String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(java.lang.String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public java.lang.String getNote() {
		return note;
	}
	public void setNote(java.lang.String note) {
		this.note = note;
	}
	public java.lang.String getPortraitPic() {
		return portraitPic;
	}
	public void setPortraitPic(java.lang.String portraitPic) {
		this.portraitPic = portraitPic;
	}
	public java.lang.String getState() {
		return state;
	}
	public void setState(java.lang.String state) {
		this.state = state;
	}
	public java.lang.String getStateDesc() {
		return stateDesc;
	}
	public void setStateDesc(java.lang.String stateDesc) {
		this.stateDesc = stateDesc;
	}
}
