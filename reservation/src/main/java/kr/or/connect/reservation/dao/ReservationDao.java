package kr.or.connect.reservation.dao;

import static kr.or.connect.reservation.dao.ReservationDaoSqls.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import kr.or.connect.reservation.dto.Reservation;

@Repository
public class ReservationDao {
	 private NamedParameterJdbcTemplate jdbc;
	    private SimpleJdbcInsert insertAction;
	    private RowMapper<Reservation> rowMapper = BeanPropertyRowMapper.newInstance(Reservation.class);

	    public ReservationDao(DataSource dataSource) {
	        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	        this.insertAction = new SimpleJdbcInsert(dataSource)
	                .withTableName("reservation")
	                .usingGeneratedKeyColumns("id");
	    }
	    
	    public int selectCount() {
	    	return jdbc.queryForObject(SELECT_COUNT, Collections.emptyMap(), Integer.class);
	    }
	    
	    public List<Reservation> selectAll(Integer start, Integer limit) {
	    		Map<String, Integer> params = new HashMap<>();
	    		params.put("start", start);
	    		params.put("limit", limit);
	        return jdbc.query(SELECT_PAGING, params, rowMapper);
	    }
	    
	    public List<Reservation> selectDrama(Integer start, Integer limit) {
	    	Map<String, Integer> params = new HashMap<>();
	    	params.put("start", start);
	    	params.put("limit", limit);
	    	return jdbc.query(SELECT_DRAMA, params, rowMapper);
	    }
	    
	    public List<Reservation> selectConsert(Integer start, Integer limit) {
	    	Map<String, Integer> params = new HashMap<>();
	    	params.put("start", start);
	    	params.put("limit", limit);
	    	return jdbc.query(SELECT_CONSERT, params, rowMapper);
	    }
	    public List<Reservation> selectClassic(Integer start, Integer limit) {
	    	Map<String, Integer> params = new HashMap<>();
	    	params.put("start", start);
	    	params.put("limit", limit);
	    	return jdbc.query(SELECT_CLASSIC, params, rowMapper);
	    }
	    public List<Reservation> selectMusical(Integer start, Integer limit) {
	    	Map<String, Integer> params = new HashMap<>();
	    	params.put("start", start);
	    	params.put("limit", limit);
	    	return jdbc.query(SELECT_MUSICAL, params, rowMapper);
	    }
	    public List<Reservation> selectShow(Integer start, Integer limit) {
	    	Map<String, Integer> params = new HashMap<>();
	    	params.put("start", start);
	    	params.put("limit", limit);
	    	return jdbc.query(SELECT_SHOW, params, rowMapper);
	    }
	    public List<Reservation> selectInfo(Integer start, Integer limit) {
	    	Map<String, Integer> params = new HashMap<>();
	    	params.put("start", start);
	    	params.put("limit", limit);
	    	return jdbc.query(SELECT_INFO, params, rowMapper);
	    }
		
		public int selectCountDrama() {
			return jdbc.queryForObject(SELECT_COUNTDRAMA, Collections.emptyMap(), Integer.class);
		}
		public int selectCountConsert() {
			return jdbc.queryForObject(SELECT_COUNTCONSERT, Collections.emptyMap(), Integer.class);
		}
		public int selectCountMusical() {
			return jdbc.queryForObject(SELECT_COUNTMUSICAL, Collections.emptyMap(), Integer.class);
		}
		public int selectCountShow() {
			return jdbc.queryForObject(SELECT_COUNTSHOW, Collections.emptyMap(), Integer.class);
		}
		public int selectCountClassic() {
			return jdbc.queryForObject(SELECT_COUNTCLASSIC, Collections.emptyMap(), Integer.class);
		}
		public int selectCountInfo() {
			return jdbc.queryForObject(SELECT_COUNT, Collections.emptyMap(), Integer.class);
		}
		
//		public Long insert(Reservation reservation) {
//			SqlParameterSource params = new BeanPropertySqlParameterSource(reservation);
//			return insertAction.executeAndReturnKey(params).longValue();
//		}
		
//		public int deleteById(Long id) {
//			Map<String, ?> params = Collections.singletonMap("id", id);
//			return jdbc.update(DELETE_BY_ID, params);
//		}

//		public int selectNum() {
//			return jdbc.queryForObject(SELECT_NUM, Collections.emptyMap(), Integer.class);
//		}
}