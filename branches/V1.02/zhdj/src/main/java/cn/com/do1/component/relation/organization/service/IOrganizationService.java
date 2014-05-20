package cn.com.do1.component.relation.organization.service;

import java.util.Map;

import cn.com.do1.common.dac.Pager;
import cn.com.do1.common.exception.BaseException;
import cn.com.do1.common.framebase.dqdp.IBaseService;
import cn.com.do1.component.relation.organization.vo.OrganizationTransferVO;

/**
 * Copyright &copy; 2010 广州市道一信息技术有限公司 All rights reserved. User: ${user}
 */
public interface IOrganizationService extends IBaseService {
	Pager searchOrganization(Map searchMap, Pager pager) throws Exception,
			BaseException;

	OrganizationTransferVO getOrganizationTransferById(String id)
			throws Exception;

}
