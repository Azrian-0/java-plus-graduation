package ewm.request.service;

import ewm.dto.request.RequestDto;

import java.util.List;

public interface RequestService {
	List<RequestDto> getRequests(Long userId);

	RequestDto createRequest(Long userId, Long eventId);

	RequestDto cancelRequest(Long userId, Long requestId);
}
