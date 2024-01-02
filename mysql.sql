-- SQL(구조화 질의 언어)
-- MySQL DBMS (RDBMS:관계형 데이터베이스) -> TABLE 관리
create database bigdate;

create table student(
	num int not null primary key auto_increment,
	name varchar(50),
    tel varchar(50),
    age int,
    email varchar(50)
);

-- CRUD
insert into student(name, tel, age, email)
values('홍길동', '010-1111-1111', 20, 'aaa@naver.com');

insert into student(name, tel, age, email)
values('정연재', '010-1111-1111', 26, 'jgg9809@naver.com');

select * from student;

-- num가 2인 학생의 나이를 99로 수정하세요.
update student set age = 99 where num = 2;

update student
set tel = '010-1111-1004', email = '1004@naver.com'
where num = 2;

-- 2번 학생을 삭제하시오.
delete from student
where num = 2;

-- 테이블 삭제(drop)
drop table student;