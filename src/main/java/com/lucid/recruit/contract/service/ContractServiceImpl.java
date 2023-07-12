/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.contract.service;

import org.springframework.stereotype.Component;

import com.lucid.core.base.BaseServiceImpl;
import com.lucid.recruit.contract.entity.Contract;

/**
 * @author sgutti
 * @date 15-Mar-2023 5:09:55 am
 */
@Component(ContractServiceImpl.SERVICE_NAME)
public class ContractServiceImpl extends BaseServiceImpl implements ContractService {

	// --------------------------------------------------------------- Constants
	public static final String SERVICE_NAME = "contractService";

	@Override
	public Contract getContractById(String contractID) {
		// TODO Auto-generated method stub
		return null;
	}

}
