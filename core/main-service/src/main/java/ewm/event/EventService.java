package ewm.event;

import ewm.dto.event.*;
import ewm.dto.request.RequestDto;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

public interface EventService {
	List<EventDto> getEvents(Long userId, Integer from, Integer size);

	EventDto getEventById(Long userId, Long eventId, String ip, String uri);

	EventDto createEvent(Long userId, CreateEventDto eventDto);

	List<EventDto> adminGetEvents(AdminGetEventRequestDto requestParams);

	EventDto adminChangeEvent(Long eventId, UpdateEventDto eventDto);

	EventDto updateEvent(Long userId, UpdateEventDto eventDto, Long eventId);

	List<EventDto> publicGetEvents(PublicGetEventRequestDto requestParams, HttpServletRequest request);

	EventDto publicGetEvent(Long eventId, HttpServletRequest request);

	List<RequestDto> getEventRequests(Long userId, Long eventId);

	EventRequestStatusUpdateResult changeStatusEventRequests(Long userId, Long eventId, EventRequestStatusUpdateRequest request);
}
