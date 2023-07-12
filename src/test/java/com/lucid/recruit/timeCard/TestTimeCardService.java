package com.lucid.recruit.timeCard;

import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import com.lucid.base.test.BaseTransactionTest;
import com.lucid.core.exception.ApplicationException;
import com.lucid.recruit.timecard.dto.TimeCardSummaryDTO;
import com.lucid.recruit.timecard.service.TimeCardService;

public class TestTimeCardService extends BaseTransactionTest {
	@Autowired
	private TimeCardService timeCardService;

	@Test
	public void testCreateTimeCard() throws ApplicationException {

	}

	@Test
	public void testRetrieveAllTimeCards() throws ApplicationException {
		Page<TimeCardSummaryDTO> retrieveAllTimeCardDTO = timeCardService.retrieveAllTimeCards(new HashMap<>());
		Assertions.assertNotNull(retrieveAllTimeCardDTO);
	}

	@Test
	public void testRetrieveTimeCard() throws ApplicationException {
	
	}

	@Test
	public void testEditTimeCard() throws ApplicationException {
		
	}

}
