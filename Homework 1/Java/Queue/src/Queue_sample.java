/**
 * Created by maitrayshah on 05/09/16.
 */

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Queue_sample {

    static Queue<Customer_Complaint> complaint_priority_queue;
    public static void main(String[] args)
    {
        Scanner x  = new Scanner(System.in);
        System.out.println("Welcome to complaint registering system\n\n");
        System.out.println("Choose your option - \n");
        System.out.println("1. Register your complaint\n");
        System.out.println("2. Look up your position\n");
        int menu_option = x.nextInt();

        complaint_priority_queue = new PriorityQueue<>(7, id_comparator);
        if(menu_option == 1)
        {
            System.out.println("You chose to register a complaint");
            add_complaint(id_comparator);
        }
        else if(menu_option == 2)
        {
            System.out.println("You chose to view waiting list");
            show_waitlist(id_comparator);
        }
        else
        {
            System.out.println("Enter a correct number and try again");
        }



    }

    public static void add_complaint(Comparator<Customer_Complaint> id_comparator)
    {
        String name;
        int id , input;
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        System.out.println("ADD A COMPLAINT \n");

        do {
            System.out.println("Enter your id");
            id = a.nextInt();

            System.out.println("Enter your name");
            name = b.nextLine();

            complaint_priority_queue.add(new Customer_Complaint(id,name));
            System.out.println("Complaint added");

            System.out.println("Enter 1 to add complaint and 2 to see waitlist");
            input = c.nextInt();


            if(input == 2)
            {
                //SEE WAITLIST
                show_waitlist(id_comparator);
            }

        }
        while(input == 1);
    }



    public static void show_waitlist(Comparator<Customer_Complaint> id_comparator)
    {
        while(true){
            Customer_Complaint customer_complaint = complaint_priority_queue.poll();
            if(customer_complaint == null) break;
            System.out.println("Sorted complaint list with Customer ID = "+customer_complaint.getId());
        }

    }


    public static Comparator<Customer_Complaint> id_comparator = new Comparator<Customer_Complaint>(){

        @Override
        public int compare(Customer_Complaint c1, Customer_Complaint c2) {
            return (int) (c1.getId() - c2.getId());
        }
    };


}