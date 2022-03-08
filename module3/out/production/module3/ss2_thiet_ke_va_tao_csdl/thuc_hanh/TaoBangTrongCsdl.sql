create table teacher(
code_teacher int auto_increment,
name_teacher varchar(100),
so_dien_thoai int,
primary key(code_teacher));
create table subjects(
code_subject int auto_increment,
name_subject varchar(100),
code_teacher int,
primary key (code_subject),
foreign key(code_teacher)references teacher(code_teacher)
);
create table student (
code_student int auto_increment,
name_student varchar(100),
date_of_birth varchar(55),
class_room varchar(100),
male varchar(20),
primary key (code_student));
create table bang_diem(
code_student int,
code_subject int,
grade double,
term date,
primary key(code_student,code_subject),
foreign key(code_student)references student(code_student),
foreign key(code_subject)references subjects(code_subject)
);

