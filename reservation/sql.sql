-- root 권한으로
create database guestbook;

grant all privileges on guestbook.* 
to guestbook@'localhost' 
identified by 'guestbook';
flush privileges;

-- guestbook table
CREATE TABLE `guestbook` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT 'guestbook id',
   `name` VARCHAR(255) NOT NULL COMMENT 'user name',
  `content` TEXT NOT NULL COMMENT 'guestbook content',
  `regdate` DATETIME NULL DEFAULT NULL COMMENT '등록일',
  PRIMARY KEY (`id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8;
  
-- data insert test
insert into guestbook(name,content, regdate) values('이름테스트1','내용테스트1',now());
insert into guestbook(name,content, regdate) values('이름테스트2','내용테스트2',now());
insert into guestbook(name,content, regdate) values('이름테스트3','내용테스트3',now());
  
-- select test
select * from guestbook;

-- guestbook 테이블의 행(인스턴스)의 수
select count(*) from guestbook;

-- 삭제
delete from guestbook where id>8;

CREATE TABLE log (
  id INT(11) NOT NULL AUTO_INCREMENT,
  ip VARCHAR(255) NOT NULL,
  method VARCHAR(255) NOT NULL,
  regdate DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8;