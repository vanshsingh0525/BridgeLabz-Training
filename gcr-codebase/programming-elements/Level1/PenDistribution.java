public class PenDistribution {
    public static void main(String[] args) {

        int totalPens = 14;
        int students = 3;
	//Calculating pens per Student
        int pensPerStudent = totalPens / students;
	//Calculating remaining pens
        int remainingPens = totalPens % students;

	//Printing pens per Student and remaining pens
        System.out.println(
                "The Pen Per Student is " + pensPerStudent +
                " and the remaining pen not distributed is " + remainingPens
        );
    }
}
