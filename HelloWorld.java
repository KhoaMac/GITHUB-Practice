import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

}
    public static void main(String[] args{
        int count = 0;
        //Input Student list from file
        Scanner sc = new Scanner(System.in);
        System.out.print("Input student list: ");
        File file = new File(sc.nextLine()); 
        sc = new Scanner(file); // Read file
        
        System.out.println("Hello World This is TDTU");
        while(sc.hasNextLine()){
            System.out.print("Hello World I am " + sc.nextLine()+ "\n");
            count++;
        }
        System.out.print("Total student: " + count + " Students");
    }
}

