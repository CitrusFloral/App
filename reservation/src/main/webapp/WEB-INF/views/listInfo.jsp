<%@page import="java.text.DecimalFormat"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>예약 시스템</title>
</head>
<body>

  <%
    Class.forName("com.mysql.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/reservation";
    String mysql_id = "root";
    String mysql_pw = "8069";

    int id = Integer.parseInt(request.getParameter("id"));

    try{

      Connection conn = DriverManager.getConnection(url, mysql_id, mysql_pw);

      Statement stmt = conn.createStatement();
      Statement stmt2 = conn.createStatement();
      Statement stmt3 = conn.createStatement();
      Statement stmt4 = conn.createStatement();


	  String sql = "select category.name,description , content , opening_hours , place_name , place_street , tel , homepage , email "
			 + "from product , display_info , category "
			 + "where product.id=display_info.id AND  category.id=product.category_id AND product.id="+id;
	  
	  
	  String sql2 = "select price_type_name , price , discount_rate "
			  +"from product , display_info , product_price "
			  +"where product.id=display_info.id AND product.id=product_price.product_id AND product.id="+id;
	  
	  
	  String sql3 = "select score , comment "
			  +"from product,reservation_user_comment "
			  +"where reservation_user_comment.product_id=product.id AND product.id="+id;
	  
	  
	  String sql4 = "select AVG(score),count(*) from product,reservation_user_comment where reservation_user_comment.product_id=product.id AND product.id="+id;
	  
	  
      
      ResultSet rs = stmt.executeQuery(sql);
      ResultSet rs2 = stmt2.executeQuery(sql2);
      ResultSet rs3 = stmt3.executeQuery(sql3);
      ResultSet rs4 = stmt4.executeQuery(sql4);

      if(rs.next()){
    	String category = rs.getString(1);
        String description = rs.getString(2); // 제목
        String content = rs.getString(3); // 개요
        String opening_hours = rs.getString(4); // 시간
        String place_name = rs.getString(5); // 장소
        String place_street = rs.getString(6); // 주소
        String tel = rs.getString(7); // 전화번호
        String homepage = rs.getString(8); // 홈피 주소
        String email = rs.getString(9); // 메일
    	  
    	

  %>

  <table border=1>
    
    <tr>
      <th width="80">제목</th>
      <td width="300"><%=description%></td>
    </tr>
    <tr>
      <th>장르</th>
      <td width="500"><%=category%><br></td>
    </tr>
    <tr>
      <th>개요</th>
      <td width="500"><%=content%><br></td>
    </tr>
    <tr>
      <th>시간</th>
      <td width="300"><%=opening_hours%><br></td>
    </tr>
    <tr>
      <th>장소</th>
      <td width="300"><%=place_name%><br></td>
    </tr>
    <tr>
      <th>주소</th>
      <td width="300"><%=place_street%><br></td>
    </tr>
    <tr>
      <th>전화번호</th>
      <td width="300"><%=tel%><br></td>
    </tr>
    <tr>
      <th>홈페이지</th>
      <td width="300"><%=homepage%><br></td>
    </tr>
    <tr>
      <th>이메일</th>
      <td width="300"><%=email%><br></td>
    </tr>
    </table>
    <table border="1">
<% DecimalFormat form = new DecimalFormat("#"); %>
  <%
      while(rs2.next()){
      String price_type_name = rs2.getString(1); // 가격 타입
      String price = rs2.getString(2); // 가격
      String discount_rate = rs2.getString(3); // 할인율 %>
	<tr>
      <td>&nbsp;<%=price_type_name%>석 &nbsp;<br></td>

      <td>&nbsp;가격 : <%=price%>원&nbsp;<br></td>
  
      <td>&nbsp;할인율 : <%=discount_rate%>%&nbsp;<br></td>
    </tr>
  <%}%> 
    </table>
  	<br>
<details>
    <summary>한줄평 보기</summary>
    <table>
    <%
    
    if(rs4.next()){
    	String avg = rs4.getString(1);
    	String allComment = rs4.getString(2);
    	%>
    	<tr>
    		<td>&nbsp;전체 평점 평균:<%=avg%> &nbsp;<br></td>
    		<td>&nbsp;전체 리뷰 수:<%=allComment%> &nbsp;<br></td>
    		
    	</tr>
    	<% 
	      while(rs3.next()){
	    	  String score = rs3.getString(1);
	    	  String comment = rs3.getString(2);
  %>
      <p></p>
  <tr>
      <td>&nbsp;<%=comment%>&nbsp;<br></td>
      <td>&nbsp;평점:<%=score%> &nbsp;<br></td>
    </tr>


  <%} }%>  
  </table>
</details>
  
  <h2><a href="list">돌아가기</a></h2>
  <%
  
      rs.close();
      rs2.close();
      rs3.close();
      rs4.close();
      stmt.close();
      stmt2.close();
      conn.close();
      }
    }catch(SQLException e){
      out.println(e.toString());
    }
  %>
  



</body>
 

</body>
</html>