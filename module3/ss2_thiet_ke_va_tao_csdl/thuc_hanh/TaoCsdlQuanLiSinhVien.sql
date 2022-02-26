-- drop database management_student;
create database management_student;
use management_student;
create table class_room(
class_id int auto_increment ,
class_name varchar(60) not null,
start_date datetime not null,
status_class bit,
primary key (class_id)
);
create table student (
student_id int auto_increment ,
student_name varchar(30) not null,
adress varchar(50),
phone varchar(20),
status_student bit,
class_id int not null,
primary key (student_id),
foreign key(class_id)references class_room(class_id)
);
create table subjects(
subject_id int auto_increment,
name_subject varchar(100) not null,
credit tinyint not null default 1,
check (credit>=1),
status_subject bit default 1,
primary key (subject_id)
 );
 create table mark(
 mark_id int auto_increment, 
 subject_id int unique,
 student_id int unique,
 mark float default 0,
 check (mark between 0 and 100),
 exam_time tinyint default 1,
 primary key (mark_id),
 foreign key (subject_id)references subjects(subject_id),
 foreign key (student_id)references student(student_id)
 );