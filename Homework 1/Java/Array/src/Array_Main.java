

/**
 * Created by maitrayshah on 06/09/16.
 */
public class Array_Main {

    public static void main(String[] args)
    {
        char kids[] = {'B','R','Y','G','P'};
        char houses[] = {'R','P','G','B','Y'};

        System.out.println("Initial kids and houses are - ");
        print_data(kids);
        print_data(houses);

        System.out.println("\n");
        System.out.println("After sorting \n");
        match_kids_to_houses(kids,houses,0,4);

        System.out.println("Matched kids and houses are - ");
        print_data(kids);
        print_data(houses);

    }

    public static char[] print_data(char[] arr) {
        for (char ch : arr){
            System.out.print(ch + " ");
        }
        System.out.print("\n");
        return arr;
    }

    public static void match_kids_to_houses(char kids_data[], char houses_data[] , int low , int high)
    {
        if(low < high)
        {
            int pivot = sort_data(kids_data , low, high, houses_data[high]);
            sort_data(houses_data , low , high , kids_data[pivot]);

            match_kids_to_houses(kids_data , houses_data , low , pivot-1);
            match_kids_to_houses(kids_data , houses_data , pivot+1, high);
        }

    }

    //This sorting is based on quick sort
    private static int sort_data(char[] input , int low , int high , char pivot)
    {
        int i = low;
        char temp1, temp2;
        for (int j = low ; j < high ; j++)
        {
            if (input[j] < pivot)
            {
                temp1 = input[i];
                input[i] = input[j];
                input[j] = temp1;
                i++;
            }
            else if(input[j] == pivot)
            {
                temp1 = input[j];
                input[j] = input[high];
                input[high] = temp1;
                j--;
            }
        }
        temp2 = input[i];
        input[i] = input[high];
        input[high] = temp2;

        return i;
    }
}
