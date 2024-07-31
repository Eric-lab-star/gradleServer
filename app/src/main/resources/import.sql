copy school(name) 
from '/users/kyungsubkim/programming/csv/school.csv' delimiter ',' csv header;

----

copy student(last_name,first_name,age,email,school_id)
from '/users/kyungsubkim/programming/csv/student.csv' delimiter ',' csv header;

copy student_profile(bio,student_id)
from '/users/kyungsubkim/programming/csv/student_profile.csv' delimiter ',' csv header;


