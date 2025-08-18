class College {
    String collegeName;
    String collegeAddress;

    public College(String name, String address) {
        this.collegeName = name;
        this.collegeAddress = address;
    }
    void facultyDetails() {
        System.out.println("College Faculty: Professors, Lecturers, Admin Staff");
    }
    void timings() {
        System.out.println("College Timings: 9 AM to 5 PM");
    }
    void attendance() {
        System.out.println("Attendance: Mandatory for all students.");
    }

    void displayCollegeInfo() {
        System.out.println("College Name: " + collegeName);
        System.out.println("College Address: " + collegeAddress);
    }
}
class School extends College {
    String schoolName;
    int gradeLevel;

    public School(String collegeName, String collegeAddress, String schoolName, int gradeLevel) {
        super(collegeName, collegeAddress);
        this.schoolName = schoolName;
        this.gradeLevel = gradeLevel;
    }
    @Override
    void facultyDetails() {
        System.out.println("School Faculty: Teachers, Assistants");
    }

    // Overriding timings method
    @Override
    void timings() {
        System.out.println("School Timings: 8 AM to 3 PM");
    }
    @Override
    void attendance() {
        System.out.println("School Attendance: Required for all grades.");
    }

    void displaySchoolInfo() {
        displayCollegeInfo();
        System.out.println("School Name: " + schoolName);
        System.out.println("Grade Level: " + gradeLevel);
    }
}
public class CollegeManagementSystem {
    public static void main(String[] args) {
        College college = new College("aits College", "123 College St.");
        college.displayCollegeInfo();
        college.facultyDetails();
        college.timings();
        college.attendance();

        System.out.println("\n--- School Details ---");
        School school = new School("aits College", "123 College St.", "Greenfield High School", 10);
        school.displaySchoolInfo();
        school.facultyDetails();
        school.timings();
        school.attendance();
    }
}