-- tạo bảng người lái
      create table student(
      	id number primary key,
      	fullname nvarchar2(50) not null,
            birthday nvarchar2(50) not null,
            classname nvarchar2(50) not null,
            major nvarchar2(50) not null,
      	hometown nvarchar2(50) not null,
            gender nvarchar2(20) not null,
            averagemark nvarchar2(20) not null
      );
-- tăng bảng driver
      CREATE SEQUENCE student_id_se
      START WITH 10000
      MAXVALUE 99990
      MINVALUE 10000
      CYCLE
      NOCACHE
      NOORDER;
      
      CREATE TRIGGER student_auto_id_trg
      BEFORE INSERT ON student
      FOR EACH ROW
      BEGIN
            SELECT student_id_se.nextval
            INTO :new.id
            FROM dual;
      END;
-- xóa bảng 
      DROP table student;
---------------------------------------------------

-----------insert----------------------------------------------------------
      insert into student(FULLNAME,BIRTHDAY,CLASSNAME,MAJOR,HOMETOWN,GENDER,AVERAGEMARK) 
      values ( n'phong',n'02/13',n'12A1',n'Nam', n'hanoi', n'Nam', n'7.6');

      select * from student;
      