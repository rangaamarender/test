package com.lucid.recruit.timecard.service;

import com.lucid.core.base.BaseService;
import com.lucid.core.dto.DocumentDetailsDTO;
import com.lucid.core.exception.ApplicationException;
import com.lucid.recruit.timecard.dto.TimeCardDTO;
import com.lucid.recruit.timecard.dto.TimeCardItemDTO;
import com.lucid.recruit.timecard.dto.TimeCardSummaryDTO;
import com.lucid.recruit.timecard.entity.TimeCard;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface TimeCardService extends BaseService {
    /**
     * @param contractID
     * @param timeCardDTO
     * @throws ApplicationException
     */
    TimeCardDTO createTimeCard(TimeCardDTO timeCardDTO);

    TimeCardDTO retrieveTimeCard(String timeCardID);

    Page<TimeCardSummaryDTO> retrieveAllTimeCards(Map<String, Object> filterData);

    List<TimeCardSummaryDTO> getSummary(List<TimeCard> timeCards, List<TimeCardSummaryDTO> timeCardList);

    TimeCardDTO editTimeCard(String timeCardID, TimeCardDTO timeCardDTO);
}
