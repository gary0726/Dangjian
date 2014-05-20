package cn.com.do1.component.partywork.branch.dao;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import cn.com.do1.common.dac.Pager;
import cn.com.do1.common.exception.BaseException;
import cn.com.do1.common.framebase.dqdp.IBaseDAO;
import cn.com.do1.component.partywork.branch.model.TbActivityUserPO;
import cn.com.do1.component.partywork.branch.model.TbBranchActivityPO;
import cn.com.do1.component.partywork.branch.vo.BranchActivityVO;

/**
* All rights reserved.
* User: ${user}
*/
public interface IBranchDAO extends IBaseDAO {

	Pager pageSearchByField(Map searchMap, Pager pager)throws SQLException;

	BranchActivityVO getBranchActivityById(String id)throws SQLException;

	List<TbBranchActivityPO>getNoEndBranchActivity()throws SQLException;

	Pager getBranchActivityByUserid(Map searchValue, Pager pager)
			throws SQLException;

	List<BranchActivityVO> getDataByactivityId(String activityId)
			throws SQLException;

	boolean searchDataByUserId(String activityId, String userId) throws SQLException;

	List<BranchActivityVO> searchList() throws SQLException;
	
	
}
