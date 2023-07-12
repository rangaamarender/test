/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.worker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lucid.base.test.BaseTransactionTest;
import com.lucid.core.entity.BasePhoneNbr;
import com.lucid.core.exception.ApplicationException;
import com.lucid.recruit.org.dto.OrganizationDTO;
import com.lucid.recruit.person.dto.PersonContactDetailsDTO;
import com.lucid.recruit.person.dto.PersonLegalDTO;
import com.lucid.recruit.person.entity.ContactType;
import com.lucid.recruit.referencedata.dto.JobDTO;
import com.lucid.recruit.referencedata.dto.WorkerTypeDTO;
import com.lucid.recruit.worker.dto.WorkAssignmentDTO;
import com.lucid.recruit.worker.dto.WorkerDTO;
import com.lucid.recruit.worker.dto.WorkerStatusDTO;
import com.lucid.recruit.worker.entity.WorkerStatusCode;
import com.lucid.recruit.worker.service.WorkerService;

/**
 * 
 * @author chandu
 *
 */
public class TestWorkerService extends BaseTransactionTest {

	@Autowired
	private WorkerService workerService;

	/**
	 * Create a new <code>TestWorkerService</code>
	 */
	public TestWorkerService() {
		super();
	}

	@Test
	public void testCreateWorkerHR() throws ApplicationException {
		PersonContactDetailsDTO prsContact = new PersonContactDetailsDTO(null, ContactType.Personal,
				new BasePhoneNbr(FAKER.phoneNumber().phoneNumber()), "joew.testmail.com", null,
				FAKER.date().past(1, TimeUnit.DAYS), null);

		List<PersonContactDetailsDTO> contactList = new ArrayList<PersonContactDetailsDTO>();
		contactList.add(prsContact);
		PersonLegalDTO personLegal = new PersonLegalDTO("Joe", "W", "Test", contactList);

		WorkerStatusDTO workerStatus = new WorkerStatusDTO(WorkerStatusCode.WORKER_ACTIVE,
				FAKER.date().past(1, TimeUnit.DAYS), "Joining", "Joined now");
		List<WorkerStatusDTO> workerStatusList = new ArrayList<WorkerStatusDTO>();
		workerStatusList.add(workerStatus);
		OrganizationDTO org = new OrganizationDTO("70MM");

		WorkAssignmentDTO wrkAssignmentDto = new WorkAssignmentDTO(null, new JobDTO("DEVARCH"),
				FAKER.date().past(1, TimeUnit.DAYS), null, FAKER.date().past(1, TimeUnit.DAYS), null, null);
		List<WorkAssignmentDTO> workerAssigmentList = new ArrayList<WorkAssignmentDTO>();
		workerAssigmentList.add(wrkAssignmentDto);

		WorkerDTO woker = new WorkerDTO(null, "EMP001", new WorkerTypeDTO("W2", null, null), personLegal, org,
				workerStatusList, workerAssigmentList);
		workerService.createWorker(woker);

	}

}
