insert into class_roon(class_name,start_date,status_class)
values(1, 'A1', '2008-12-20', 1),
(2, 'A2', '2008-12-22', 1),
(3, 'B3', current_date, 0);

insert into student(student_name,adress,phone,status_student,class_id)
values('Hung', 'Ha Noi', '0912113113', 1, 1),
('Hoa', 'Hai phong','0912113113', 1, 1),
('Manh', 'HCM', '0123123123', 0, 2);

INSERT INTO Subjects
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
        
INSERT INTO Mark (subject_id, student_id, Mark, exam_time)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);
 