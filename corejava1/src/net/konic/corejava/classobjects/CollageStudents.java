package net.konic.corejava.classobjects;

public class CollageStudents {
    public static void main(String[] args) {
        
        String collageName = "Krishna Chaithanya";
        String studentName = "Kumar";
        String group = "BCA (Bachelor of Computer Applications)";
        String section = "Y1";
        int sandNumber = 226464;
        String totalYears = "2022 to 2025";
        
        CollageStudents c = new CollageStudents(); 
        
        System.out.println("/------- STUDENT INFORMATION --------/");
        System.out.println("College Name: " + collageName);
        System.out.println("Student Name: " + studentName);
        System.out.println("Group: " + group);
        System.out.println("Section: " + section);
        System.out.println("Sand Number: " + sandNumber);
        System.out.println("Total Years: " + totalYears);
    }
}
