use management_student;

-- hiển thị số lượng sinh viên từng nơi
select student.adress, count(student.student_id)as soluong from student
group by adress ;

-- tính điểm trung bình các môn của học viên 

select student.student_id, student.student_name, avg(mark.mark)
 as diem_trung_binh from student join mark on mark.student_id= student.student_id
group by student_id;

-- hiển thị các học viên có điêm trung bình lớn hơn 15
select student.student_id,student.student_name,avg(mark.mark) as diem_trung_binh from student join mark on student.student_id = mark.student_id
group by student_id having diem_trung_binh>8;

select student.student_id,student.student_name,avg(mark.mark)
as diem_trung_binh from student join mark on student.student_id = mark.student_id
group by  student_id having diem_trung_binh>=all(select avg(mark.mark) from mark group by mark.student_id);




