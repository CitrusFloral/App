package kr.or.connect.reservation.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.connect.reservation.dao.ReservationDao;
import kr.or.connect.reservation.dao.LogDao;
import kr.or.connect.reservation.dto.Reservation;
import kr.or.connect.reservation.dto.Log;
import kr.or.connect.reservation.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService{
	@Autowired
	ReservationDao reservationDao;
	
	@Autowired
	LogDao logDao;

	@Override
	@Transactional
	public List<Reservation> getReservations(Integer start) {
		List<Reservation> list = reservationDao.selectAll(start, ReservationService.LIMIT);
		return list;
	}
	public List<Reservation> getReservationDrama(Integer start) {
		List<Reservation> list = reservationDao.selectDrama(start, ReservationService.LIMIT);
		return list;
	}
	public List<Reservation> getReservationShow(Integer start) {
		List<Reservation> list = reservationDao.selectShow(start, ReservationService.LIMIT);
		return list;
	}
	public List<Reservation> getReservationConsert(Integer start) {
		List<Reservation> list = reservationDao.selectConsert(start, ReservationService.LIMIT);
		return list;
	}
	public List<Reservation> getReservationClassic(Integer start) {
		List<Reservation> list = reservationDao.selectClassic(start, ReservationService.LIMIT);
		return list;
	}
	public List<Reservation> getReservationMusical(Integer start) {
		List<Reservation> list = reservationDao.selectMusical(start, ReservationService.LIMIT);
		return list;
	}
	public List<Reservation> getReservationInfo(Integer start) {
		List<Reservation> list = reservationDao.selectInfo(start, ReservationService.LIMIT);
		return list;
	}

	
	@Override
	public int getCount() {
		return reservationDao.selectCount();
	}
	@Override
	public int getCountDrama() {
		return reservationDao.selectCountDrama();
	}
	@Override
	public int getCountConsert() {
		return reservationDao.selectCountConsert();
	}
	@Override
	public int getCountClassic() {
		return reservationDao.selectCountClassic();
	}
	@Override
	public int getCountShow() {
		return reservationDao.selectCountShow();
	}
	@Override
	public int getCountMusical() {
		return reservationDao.selectCountMusical();
	}
	public int getCountInfo() {
		return reservationDao.selectCountInfo();
	}


}
