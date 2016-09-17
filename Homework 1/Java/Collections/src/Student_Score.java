import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by maitrayshah on 09/09/16.
 */
public class Student_Score {

    static Map<String , String> studentGrades = new HashMap<String, String>();
    static String studentName , studentScore;
    static Scanner x = new Scanner(System.in);

    public static void main(String[] args)
    {

        System.out.println("Students Score Management System - \n");
        System.out.println("Start from 1 :\n");
        System.out.println("1. Enter Student Record\n");
        System.out.println("2. Show all records\n");
        System.out.println("3. Delete a record\n");
        System.out.println("4. Show a specific record\n");

        int menu_option = x.nextInt();

        switch (menu_option)
        {
            case 1 : add_record();
                     break;
            case 2 : show_all_records();
                     break;
            case 3 : delete_record();
                     break;
            case 4 : show_specific_record();
                     break;
            default :
                System.out.println("Invalid option");

        }


    }

    public static void add_record()
    {
         Scanner a = new Scanner(System.in);
         Scanner b = new Scanner(System.in);
        int user_entry = 0;
        do
        {
            System.out.println("Enter student's name : ");
            studentName = a.next();
            System.out.println("Enter student's score");
            studentScore = b.next();
            studentGrades.put(studentName,studentScore);
            System.out.println("Student record added \n");
            System.out.println("Press 1 to continue");
            user_entry = x.nextInt();
        }while(user_entry == 1);
        show_all_records();
        

    }

    public static void show_all_records()
    {
        System.out.println("Showing all records - \n");
        System.out.println(Arrays.asList(studentGrades));
        delete_record();

    }

    public static void delete_record()
    {
        System.out.println("Deleting a record \n");
        System.out.println("Enter the name to delete a record - \n");
        String name = x.next();
        studentGrades.remove(name);
        System.out.println("Updates List - \n");
        System.out.println(Arrays.asList(studentGrades));
        show_specific_record();

    }

    public static void show_specific_record()
    {
        System.out.println("Display Specific Records - \n");
        System.out.println("Enter the name of student to see his grade - \n");
        String name = x.next();
        if(studentGrades.containsKey(name))
        {
            System.out.println(" Grade of "+ name + " is " + studentGrades.get(name));
        }
        else
        {
            System.out.println("No record found");
        }
    }
}
