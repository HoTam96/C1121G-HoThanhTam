use management_student;
select* from student;
select*from student
where status_student = true;
select*from subjects
where credit<10;


SELECT student.student_id , student.student_name, class_room.class_name
 from student join class_room on student.class_id= class_room.class_id 
 where class_room.class_name = 'A1';
 

select student.student_id,student.student_name,subjects.name_subject,subjects.status_subject from student 
join mark on mark.student_id = student.student_id
join subjects on mark.subject_id = subjects.subject_id
where subjects.name_subject = 'CF';
 
