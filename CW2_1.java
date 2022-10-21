import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class CW2_1{
    public static class Student{
        private int id;
        private String lastName, firstName, middleName;
        private String dateOfBirth, address, phoneNumber;
        private String faculty;
        private int gradeYear;
        private String groupName;

        public Student(int id, String lastName, String firstName, String middleName, String dateOfBirth, String address, String phoneNumber, String faculty, int gradeYear, String groupName) {
            this.id = id;
            this.lastName = lastName;
            this.firstName = firstName;
            this.middleName = middleName;
            this.dateOfBirth = dateOfBirth;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.faculty = faculty;
            this.gradeYear = gradeYear;
            this.groupName = groupName;
        }

        public Student() {
            this.id = 0;
            this.firstName = null;
            this.middleName = null;
            this.lastName = null;
            this.dateOfBirth = null;
            this.address = null;
            this.phoneNumber = null;
            this.faculty = null;
            this.groupName = null;
            this.gradeYear = 0;
        }

        public Student(int id, String firstName, String middleName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.dateOfBirth = null;
            this.address = null;
            this.phoneNumber = null;
            this.faculty = null;
            this.groupName = null;
            this.gradeYear = 0;
        }


        public int getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public int getYearFromString(){
            String dateArr[] = getDateOfBirth().split("\\.");
            return Integer.parseInt(dateArr[2]);
        }

        public String getAddress() {
            return address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getFaculty() {
            return faculty;
        }

        public String getGroupName() {
            return groupName;
        }

        public int getGradeYear() {
            return gradeYear;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void setFaculty(String faculty) {
            this.faculty = faculty;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        public void setGradeYear(int gradeYear) {
            this.gradeYear = gradeYear;
        }

        public String getFullName(){
            String fullName = "";
            fullName += getId() + ". " + getLastName() + " " + getFirstName() + " " + getMiddleName();
            fullName += ". Group : " + getGroupName() + ", Year : " + getGradeYear();
            return fullName;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", lastName='" + lastName + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", middleName='" + middleName + '\'' +
                    ", dateOfBirth='" + dateOfBirth + '\'' +
                    ", address='" + address + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", faculty='" + faculty + '\'' +
                    ", gradeYear=" + gradeYear +
                    ", groupName='" + groupName + '\'' +
                    '}';
        }
    }

    public static void test1(ArrayList<Student>students, String facultyName){
        System.out.println("\n------------------------TEST 1------------------");
        for (Student student: students){
            if (student.getFaculty().equals(facultyName)){
                System.out.println(student.getFullName());
            }
        }


    }

    public static void test2(ArrayList<Student> students, int gradeYear){
        System.out.println("\n------------------------TEST 2------------------");
        Map<String, ArrayList<Student>> mapStudents = new HashMap<>();
        for (Student student: students){
            if (student.getGradeYear() == gradeYear){
                String facultyName = student.getFaculty();
                if (!(mapStudents.containsKey(facultyName))){
                    ArrayList<Student> fStudents = new ArrayList<>();
                    mapStudents.put(facultyName, fStudents);
                }
                mapStudents.get(facultyName).add(student);
            }
        }
        for (Map.Entry<String, ArrayList<Student>> pair: mapStudents.entrySet()){
            System.out.println("*** Faculty: " + pair.getKey() + " ***");
            for (Student student: pair.getValue()){
                System.out.println(student.getFullName());
            }
            System.out.println();
        }
    }

    public static void test3(ArrayList<Student> students, int year){
        System.out.println("\n------------------------TEST 3------------------");
        System.out.println("*** Student born after " + year + ". th year (included) ***");
        for (Student student : students){
            int birthYear = student.getYearFromString();
            if (birthYear >= year){
                System.out.println(student.getFullName() + "; Birth year: " + birthYear);
            }
        }
    }

    public static void test4(ArrayList<Student> students, String facultyName, String groupName){
        System.out.println("\n------------------------TEST 4------------------");
        System.out.println("*** Students of group " + groupName + " at faculty " + facultyName + " ***");
        for (Student student : students){
            if (student.getFaculty().equals(facultyName) && student.getGroupName().equals(groupName)){
                System.out.println(student.getFullName());
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student_1 = new Student(1, "Demchenko", "Andrii", "Andriyovych",
                "30.08.2001", "Lomonosova, 47", "380661231322",
                "MM", 3, "CM");
        Student student_2 = new Student(2, "Matryniuk", "Andrii", "Sergyovich",
                "12.08.2003", "Gromnutskogo 2 b", "380677451250",
                "MM", 3, "CM");
        Student student_3 = new Student(20, "Martyniuk", "Sergiy", "Volodumurovych",
                "03.07.2002", "Marksa 25", "380678165509",
                "CS", 4, "IPO");
        Student student_4 = new Student(23, "Knuth", "Donald", "Ervinovich",
                "10.01.2005", "Maliovskogo 34 b", "380973468810",
                "MM", 1, "S");
        Student student_5 = new Student(92, "Dennis", "Ritchie", "MacAlistair",
                "09.09.2004", "Amosova 7", "380661248619",
                "HF", 2, "HP");
        Student student_6 = new Student(48, "Linus ", "Benedict ", "O'Torvald ",
                "28.12.2003", " Ymanska 2", "380444544210",
                "MS", 3, "F");
        Student student_7 = new Student(30, "Reizlin", "Ihor", "Dmitrovych",
                "07.12.2002", "Danula Galutskogo 4/11", "380681756695",
                "CS", 3, "GO");
        Student student_8 = new Student(57, "Gabe", "Newell", "Logan",
                "3.10.2001", "Tuscan", "380561829346",
                "PI", 4,"RM");

        students.add(student_1);
        students.add(student_2);
        students.add(student_3);
        students.add(student_4);
        students.add(student_5);
        students.add(student_6);
        students.add(student_7);
        students.add(student_8);

        test1(students, "MM");
        test2(students, 3);
        test3(students, 2001);
        test4(students, "MM", "CM");
    }


}
