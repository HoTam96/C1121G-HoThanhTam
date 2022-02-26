SELECT * FROM student
WHERE student_name LIKE 'H%';

select * from class_room
where month(start_date) =12;

select * from subjects
where subjects.credit between 3 and 5;

 SET SQL_SAFE_UPDATES =0;
update student SET student.class_id=2
where student.student_name ='Hung';
 SET SQL_SAFE_UPDATES =1;

select student.student_name,subjects.name_subject,mark.mark from student 
join mark on student.student_id = mark.student_id 
join subjects on mark.subject_id = subjects.subject_id
order by mark.mark desc, student.student_name asc;






