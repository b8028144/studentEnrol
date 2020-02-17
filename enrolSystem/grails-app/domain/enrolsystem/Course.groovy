package enrolsystem

class Course {

	String department;
	String studyMode;
	String courseTitle;
	String courseLeader;
	String courseCode;
	Date startDate;
	Date endDate;
	String description;
	int numberOfStudents;
	Double tuitionFees;

    static constraints = {

	department: blank: false

    }
}
