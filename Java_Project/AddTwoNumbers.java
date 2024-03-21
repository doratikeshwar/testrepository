import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddTwoNumbers {

    public static void main(String[] args){
        System.out.println("Enter the value:");
        Scanner sc = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();

        for(int i =1; i<=10; i++){
            int num = sc.nextInt();
            numberList.add(num);
        }
        // code to be pushed to GitHub. ----

        for(int n:numberList){
            if(n%2==0){
            System.out.println("Value entered is:" + n);
            }
        }


    }

}
