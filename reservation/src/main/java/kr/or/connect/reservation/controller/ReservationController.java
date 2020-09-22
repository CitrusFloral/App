package kr.or.connect.reservation.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.connect.reservation.dto.Reservation;
import kr.or.connect.reservation.service.ReservationService;

@Controller
public class ReservationController {
	@Autowired
	ReservationService reservationService;
	
	@GetMapping(path="/list")
	public String list(@RequestParam(name="start", required=false, defaultValue="0") int start,
					   ModelMap model) {
		
		List<Reservation> list = reservationService.getReservations(start);
		
		int count = reservationService.getCount();
		int pageCount = count / ReservationService.LIMIT;
		if(count % ReservationService.LIMIT > 0)
			pageCount++;
		
		List<Integer> pageStartList = new ArrayList<>();
		for(int i = 0; i < pageCount; i++) {
			pageStartList.add(i * ReservationService.LIMIT);
		}
		
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pageStartList", pageStartList);
		
		return "list";
	}
	
	@GetMapping(path="/listDrama")
	public String list2(@RequestParam(name="start", required=false, defaultValue="0") int start,
					   ModelMap model) {
		
		List<Reservation> list = reservationService.getReservationDrama(start);
		
		int count = reservationService.getCountDrama();
		int pageCount = count / ReservationService.LIMIT;
		if(count % ReservationService.LIMIT > 0)
			pageCount++;
		
		List<Integer> pageStartList = new ArrayList<>();
		for(int i = 0; i < pageCount; i++) {
			pageStartList.add(i * ReservationService.LIMIT);
		}
		
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pageStartList", pageStartList);
		
		return "listDrama";
	}
	@GetMapping(path="/listClassic")
	public String listClassic(@RequestParam(name="start", required=false, defaultValue="0") int start,
			ModelMap model) {
		
		List<Reservation> list = reservationService.getReservationClassic(start);
		
		int count = reservationService.getCountClassic();
		int pageCount = count / ReservationService.LIMIT;
		if(count % ReservationService.LIMIT > 0)
			pageCount++;
		
		List<Integer> pageStartList = new ArrayList<>();
		for(int i = 0; i < pageCount; i++) {
			pageStartList.add(i * ReservationService.LIMIT);
		}
		
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pageStartList", pageStartList);
		
		return "listClassic";
	}
	@GetMapping(path="/listShow")
	public String listShow(@RequestParam(name="start", required=false, defaultValue="0") int start,
			ModelMap model) {
		
		List<Reservation> list = reservationService.getReservationShow(start);
		
		int count = reservationService.getCountShow();
		int pageCount = count / ReservationService.LIMIT;
		if(count % ReservationService.LIMIT > 0)
			pageCount++;
		
		List<Integer> pageStartList = new ArrayList<>();
		for(int i = 0; i < pageCount; i++) {
			pageStartList.add(i * ReservationService.LIMIT);
		}
		
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pageStartList", pageStartList);
		
		return "listShow";
	}
	@GetMapping(path="/listMusical")
	public String listMusical(@RequestParam(name="start", required=false, defaultValue="0") int start,
			ModelMap model) {
		
		List<Reservation> list = reservationService.getReservationMusical(start);
		
		int count = reservationService.getCountMusical();
		int pageCount = count / ReservationService.LIMIT;
		if(count % ReservationService.LIMIT > 0)
			pageCount++;
		
		List<Integer> pageStartList = new ArrayList<>();
		for(int i = 0; i < pageCount; i++) {
			pageStartList.add(i * ReservationService.LIMIT);
		}
		
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pageStartList", pageStartList);
		
		return "listMusical";
	}
	@GetMapping(path="/listConsert")
	public String listConsert(@RequestParam(name="start", required=false, defaultValue="0") int start,
			ModelMap model) {
		
		List<Reservation> list = reservationService.getReservationConsert(start);
		
//		int num = reservationService.getNum();
		
		int count = reservationService.getCountConsert();
		int pageCount = count / ReservationService.LIMIT;
		if(count % ReservationService.LIMIT > 0)
			pageCount++;
		
		List<Integer> pageStartList = new ArrayList<>();
		for(int i = 0; i < pageCount; i++) {
			pageStartList.add(i * ReservationService.LIMIT);
		}
//		model.addAttribute("num", num);
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pageStartList", pageStartList);
		
		return "listConsert";
	}
	@GetMapping(path="/listInfo")
	public String listInfo(@RequestParam(name="start", required=false, defaultValue="0") int start,
			ModelMap model) {
		
		List<Reservation> list = reservationService.getReservationInfo(start);
		
//		int num = reservationService.getNum();
		
		int count = reservationService.getCountInfo();
		int pageCount = count / ReservationService.LIMIT;
		if(count % ReservationService.LIMIT > 0)
			pageCount++;
		
		List<Integer> pageStartList = new ArrayList<>();
		for(int i = 0; i < pageCount; i++) {
			pageStartList.add(i * ReservationService.LIMIT);
		}
//		model.addAttribute("num", num);
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pageStartList", pageStartList);
		
		return "listInfo";
	}
	
//	@PostMapping(path="/write")
//	public String write(@ModelAttribute Reservation reservation,
//						HttpServletRequest request) {
//		String clientIp = request.getRemoteAddr();
//		System.out.println("clientIp : " + clientIp);
//		reservationService.addReservation(reservation, clientIp);
//		return "redirect:list";
//	}
}