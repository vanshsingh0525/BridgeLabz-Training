package com.inheritance.multilevelinheritance;

public class CourseDemo {

    public static void main(String[] args) {

        PaidOnlineCourse course =
            new PaidOnlineCourse("Java Full Stack", 60,
                                 "Udemy", true,
                                 10000, 20);

        course.displayPaidCourseDetails();
    }
}

