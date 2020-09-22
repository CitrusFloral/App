package kr.or.connect.reservation.service;

import java.util.List;

import kr.or.connect.reservation.dto.Reservation;

public interface ReservationService {
	public static final Integer LIMIT = 5;
	public List<Reservation> getReservations(Integer start);
	public List<Reservation> getReservationDrama(Integer start);
	public List<Reservation> getReservationClassic(Integer start);
	public List<Reservation> getReservationMusical(Integer start);
	public List<Reservation> getReservationShow(Integer start);
	public List<Reservation> getReservationConsert(Integer start);
	public List<Reservation> getReservationInfo(Integer start);
//	public int deleteReservation(Long id, String ip);
//	public Reservation addReservation(Reservation reservation, String ip);
	public int getCount();
	public int getCountDrama();
	public int getCountConsert();
	public int getCountClassic();
	public int getCountShow();
	public int getCountMusical();
	public int getCountInfo();
//	public int getNum();
}