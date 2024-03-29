package org.example.spring.setterinjection;

public class Student {

    private String studentName;
    private String studentId;
    private String studentAddress;

    public Student(String studentName, String studentId, String studentAddress) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentAddress = studentAddress;
    }

    public Student() {
        super();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentId='" + studentId + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
