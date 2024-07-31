
copy
school(
	id,
	name
) from '/users/kyungsubkim/programming/csv/school.csv'
delimiter ',' csv header;

----


copy
student( id,last_name,first_name,age,email,school_id)
from '/users/kyungsubkim/programming/csv/student.csv'
delimiter ',' csv header;


INSERT INTO student_profile(
	bio,
	student_id)
VALUES (
	'silent killer',
	1);

INSERT INTO student_profile(
	bio,
	student_id)
VALUES (
	'king of the animals',
	2);

INSERT INTO student_profile(
	bio,
	student_id)
VALUES (
	'positive dreamer',
	3);
