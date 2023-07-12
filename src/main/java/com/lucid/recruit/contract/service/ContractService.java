/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.contract.service;

import com.lucid.core.base.BaseService;
import com.lucid.recruit.contract.entity.Contract;

/**
 * @author sgutti
 * @date 26-Jan-2023 12:18:54 am
 */
public interface ContractService extends BaseService {

	Contract getContractById(String contractID);

}
