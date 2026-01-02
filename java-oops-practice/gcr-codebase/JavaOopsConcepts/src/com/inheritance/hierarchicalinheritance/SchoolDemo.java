package com.inheritance.hierarchicalinheritance;

public class SchoolDemo {

    public static void main(String[] args) {

        Teacher t =
            new Teacher("Mr. Sharma", 40, "Mathematics");

        Student s =
            new Student("Anita", 16, "10th Grade");

        Staff st =
            new Staff("Ramesh", 45, "Administration");

        t.displayPersonDetails();
        t.displayRole();
        System.out.println();

        s.displayPersonDetails();
        s.displayRole();
        System.out.println();

        st.displayPersonDetails();
        st.displayRole();
    }
}




