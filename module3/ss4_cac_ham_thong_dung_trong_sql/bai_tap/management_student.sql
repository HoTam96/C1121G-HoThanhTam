
-- hiển thị thông tin có credit lớ nhất 
-- c1 
select * from subjects where subjects.credit in (select max(subjects.credit) from subjects);
-- c2
select * from subjects order by subjects.credit desc limit 1;

-- hiển thị thông tin môn học có điểm thi lớn nhất-- 

select subjects.subject_id, subjects.name_subject, max(mark.mark) as diem_thi from subjects 
join mark on subjects.subject_id = mark.subject_id group by subject_id 
having diem_thi = (select max(mark.mark) from mark);


-- hiển thị thông tin sinh viên và điểm trung bình của mỗi sinh viên sắp xếp theo thứ tự giảm dần-- 

select * , avg(mark.mark)as diem_trung_binh from student join mark 
on student.student_id = mark.mark_id group by student.student_id order by diem_trung_binh desc;


