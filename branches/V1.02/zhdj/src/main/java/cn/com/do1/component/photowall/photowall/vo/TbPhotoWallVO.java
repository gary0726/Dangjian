package cn.com.do1.component.photowall.photowall.vo;

import java.util.Arrays;
import java.util.List;

import cn.com.do1.common.annotation.bean.DictDesc;
import cn.com.do1.common.annotation.bean.FormatMask;
import cn.com.do1.common.annotation.bean.PageView;
import cn.com.do1.common.annotation.bean.Validation;
import cn.com.do1.common.framebase.dqdp.IBaseVO;

/**
 * Copyright &copy; 2010 广州市道一信息技术有限公司 All rights reserved. User: tanshaoqi
 */
public class TbPhotoWallVO implements IBaseVO {
	private String id;

	@Validation(must = false, length = 100, fieldType = "pattern", regex = "^.*$")
	@PageView(showType = "input", showOrder = 1, showName = "留影墙主题", showLength = 100)
	private String title;

	@DictDesc(typeName = "photowallType", refField = "type")
	private String _type_desc;

	@Validation(must = false, length = 2, fieldType = "pattern", regex = "^.*$")
	@PageView(showType = "select", showOrder = 2, showName = "留影墙类型", showLength = 2)
	private String type;

	@Validation(must = false, length = 2000, fieldType = "pattern", regex = "^.*$")
	@PageView(showType = "input", showOrder = 3, showName = "描述", showLength = 2000)
	private String des;

	@DictDesc(typeName = "photowallStatus", refField = "status")
	private String _status_desc;

	@Validation(must = false, length = 2, fieldType = "pattern", regex = "^.*$")
	@PageView(showType = "select", showOrder = 4, showName = "状态", showLength = 2)
	private String status;

	@Validation(must = false, length = 36, fieldType = "pattern", regex = "^.*$")
	@PageView(showType = "input", showOrder = 5, showName = "创建人ID", showLength = 36)
	private String createUserId;

	@Validation(must = false, length = 7, fieldType = "datetime")
	@PageView(showType = "datetime", showOrder = 6, showName = "创建时间", showLength = 7)
	@FormatMask(type="date",value="yyyy-MM-dd HH:mm:ss")
	private String createTime;
	
	private String userName;
	private String portraitPic;
	private String [] imgs;
	private List<String> tableNames;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	/** 字典关联属性 */
	public void set_type_desc(String _type_desc) {
		this._type_desc = _type_desc;
	}

	public String get_type_desc() {
		return this._type_desc;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getDes() {
		return this.des;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	/** 字典关联属性 */
	public void set_status_desc(String _status_desc) {
		this._status_desc = _status_desc;
	}

	public String get_status_desc() {
		return this._status_desc;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public String getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPortraitPic() {
		return portraitPic;
	}

	public void setPortraitPic(String portraitPic) {
		this.portraitPic = portraitPic;
	}
	public String[] getImgs() {
		return imgs;
	}

	public void setImgs(String[] imgs) {
		this.imgs = imgs;
	}

	/**
	 * 获取数据库中对应的表名
	 * 
	 * @return
	 */
	public List<String> _getTableNames() {
		if (tableNames == null || tableNames.isEmpty()) {
			tableNames = Arrays.asList("TB_PHOTO_WALL".split(","));
		}
		return tableNames;
	}
}
