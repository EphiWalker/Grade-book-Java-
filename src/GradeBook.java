import java.util.Scanner;
public class GradeBook {
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in);
        int size;
        System.out.println("\nPlease enter the number of courses:\n");
        size = input.nextInt();
        double [] grades = new double[size];
        for (int i=0;i<grades.length;i++) {
            System.out.println("\nPlease enter your grade in course "+(i+1)+"\n");
            grades[i]=input.nextDouble();
        }

        double returnAverage;
        returnAverage= calcAverage(grades);

        Scanner choice = new Scanner (System.in);
        System.out.println("\nWhat would you like to do?\n" +
                            "1. Print out all your grades.\n" +
                            "2. Find out the average of your grades.\n" +
                            "3. Print your letter grade.\n");
        int number = choice.nextInt();

        if (number ==1) {
            printGrades(grades);
        }

        else if (number==2) {
            System.out.println("\nThe average of Your grades is: "+returnAverage);
        }
        else if (number==3) {
             printLetters(returnAverage); /* Commented out, because the next question on
        the lab exercise (#11) asks that we modify the function "printLetters" so
        that it asks the user to enter the grades instead of taking the array of
        grades from the main method.*/

        }
        else {
            System.out.println("Invalid Input! Please try again.");
        }

        highestGrade(grades);
    }

    static void printGrades(double[] grade) {
        int s=1;
        for (double l : grade) {
            System.out.println("\nYour grade in course "+s+" is " + l);
            s++;
        }
    }

    static double calcAverage(double[] grade) {
        double sum=0;
        double average;
        for (double m : grade) {
            sum+=m;
        }
        average=sum/grade.length;

        average = (double) Math.round(average*100)/100;
        return average;
    }

    static void highestGrade(double[] grade) {
        outer:
        for(int i=0;i<grade.length;i++) {
            if (i < grade.length - 1) {
                for (int j = i + 1; j < grade.length; j++) {
                    if (grade[j] > grade[i]) {
                        continue outer;
                    }
                    if (j == grade.length - 1) {
                        if (grade[i] >= grade[j]) {
                            System.out.println("\nYour highest grade is " + grade[i]);
                            break outer;
                        }
                    }
                }
            }

            else if (i == grade.length - 1) {
                System.out.println("\nYour highest grade is " + grade[i]);
            }
        }
    }

    static void printLetters(double average) {
        char letter;
        if (average >= 90) {
            letter = 'A';
        }
        else if (average >= 80) {
            letter = 'B';
        }
        else if (average >= 70) {
            letter = 'C';
        }
        else if (average >= 60) {
            letter = 'D';
        }
        else {
            letter = 'F';
        }

        System.out.println("\nYour letter grade is "+letter);
    }
}