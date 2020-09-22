package kr.or.connect.reservation.dao;

public class ReservationDaoSqls {
	
	public static final String SELECT_PAGING = "select product.id,product.description , category.name , display_info.opening_hours , display_info.place_name "
			+ "from product,category,display_info "
			+ "where category.id=product.category_id AND product.id=display_info.id\r\n" + 
			" limit :start, :limit";
	public static final String SELECT_DRAMA = "select content,product.description , category.name , display_info.opening_hours , display_info.place_name, product.id from product,category,display_info where category.id=product.category_id AND product.id=display_info.id AND name LIKE '연극' ORDER BY category.id DESC limit :start, :limit";
	public static final String SELECT_CLASSIC = "select content,product.description , category.name , display_info.opening_hours , display_info.place_name ,product.id from product,category,display_info where category.id=product.category_id AND product.id=display_info.id AND name LIKE '클래식' ORDER BY category.id DESC limit :start, :limit";
	public static final String SELECT_MUSICAL = "select content,product.description , category.name , display_info.opening_hours , display_info.place_name ,product.id from product,category,display_info where category.id=product.category_id AND product.id=display_info.id AND name LIKE '뮤지컬' ORDER BY category.id DESC limit :start, :limit";
	public static final String SELECT_SHOW = "select content,product.description , category.name , display_info.opening_hours , display_info.place_name, product.id from product,category,display_info where category.id=product.category_id AND product.id=display_info.id AND name LIKE '전시' ORDER BY category.id DESC limit :start, :limit";
	public static final String SELECT_CONSERT = "select content,product.description , category.name , display_info.opening_hours , display_info.place_name ,product.id from product,category,display_info where category.id=product.category_id AND product.id=display_info.id AND name LIKE '콘서트' ORDER BY category.id DESC limit :start, :limit";

	public static final String SELECT_INFO = "select price_type_name,discount_rate,product_price.price,product.description , category.name , display_info.opening_hours , display_info.place_name , product.id from product_price,product,category,display_info where category.id=product.category_id AND product.id=display_info.id AND product.id=product_price.product_id ORDER BY category.id DESC limit :start, :limit";
	
//	public static final String DELETE_BY_ID = "DELETE FROM guestbook WHERE id = :id";
	public static final String SELECT_COUNT = "SELECT count(*) FROM product";
	public static final String SELECT_COUNTDRAMA = "SELECT count(*) FROM product WHERE category_id=5";
	public static final String SELECT_COUNTCLASSIC = "SELECT count(*) FROM product WHERE category_id=4";
	public static final String SELECT_COUNTCONSERT = "SELECT count(*) FROM product WHERE category_id=3";
	public static final String SELECT_COUNTMUSICAL = "SELECT count(*) FROM product WHERE category_id=2";
	public static final String SELECT_COUNTSHOW = "SELECT count(*) FROM product WHERE category_id=1";
		
}