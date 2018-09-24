import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
}
    public static void main(String[] args{
         Scanner sc = new Scanner(System.in);
        System.out.print("Input student list: ");
        File file = new File(sc.nextLine());
        sc = new Scanner(file);
        System.out.println("Hello World This is TDTU");
    }
}

