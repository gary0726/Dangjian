package cn.com.do1.component.mobileclient.suggestion.service;

import cn.com.do1.common.dac.Pager;
import cn.com.do1.common.framebase.dqdp.IBaseService;
import cn.com.do1.common.exception.BaseException;
import java.util.Map;

/**
* Copyright &copy; 2010 广州市道一信息技术有限公司
* All rights reserved.
* User: ${user}
*/
public interface ISuggestionService extends IBaseService{
	/**
	 * 分页查询意见反馈
	 * @param searchMap
	 * @param pager
	 * @return
	 * @throws Exception
	 * @throws BaseException
	 */
    Pager searchSuggestion(Map searchMap, Pager pager) throws Exception, BaseException;

}
