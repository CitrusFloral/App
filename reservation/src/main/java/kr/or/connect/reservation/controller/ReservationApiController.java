package kr.or.connect.reservation.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.or.connect.reservation.dto.Reservation;
import kr.or.connect.reservation.service.ReservationService;

@RestController
@RequestMapping(path="/reservations")
public class ReservationApiController {
	@Autowired
	ReservationService reservationService;
	
	@GetMapping
	public Map<String, Object> list(@RequestParam(name="start", required=false, defaultValue="0") int start) {
		
		List<Reservation> list = reservationService.getReservations(start);

		
		int count = reservationService.getCount();
		int pageCount = count / ReservationService.LIMIT;
		if(count % ReservationService.LIMIT > 0)
			pageCount++;
		
		List<Integer> pageStartList = new ArrayList<>();
		for(int i = 0; i < pageCount; i++) {
			pageStartList.add(i * ReservationService.LIMIT);
		}
		
		Map<String, Object> map = new HashMap<>();
		map.put("list", list);
		map.put("count", count);
		map.put("pageStartList", pageStartList);
		
		return map;
	}
	
//	@PostMapping
//	public Reservation write(@RequestBody Reservation reservation,
//						HttpServletRequest request) {
//		String clientIp = request.getRemoteAddr();
//		Reservation resultReservation = reservationService.addReservation(reservation, clientIp);
//		return resultReservation;
//	}
	
//	@DeleteMapping("/{id}")
//	public Map<String, String> delete(@PathVariable(name="id") Long id,
//			HttpServletRequest request) {
//		String clientIp = request.getRemoteAddr();
//		
//		int deleteCount = reservationService.deleteReservation(id, clientIp);
//		return Collections.singletonMap("success", deleteCount > 0 ? "true" : "false");
//	}
}