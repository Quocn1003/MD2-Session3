package ex;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        /*
        Nhập số phần tử (n) của mảng và khai báo mảng số nguyên gồm n phần tử
        In menu và thực hiện các chức năng theo menu:
        **MENU**
        Nhập giá trị các phần tử
        In giá trị các phần tử
        Tính tổng các phân tử
        In các phần tử có giá trị lẻ trong mảng
        In các phần tử có chỉ số chẵn trong mảng
        Sắp xếp mảng tăng dần
        Thoát
        Lựa chọn của bạn:
        */
        Scanner sc = new Scanner(System.in);
        //Nhập các phần tử của mảng
        System.out.print("Nhập vào số phần tử của mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập lần lượt các phần tử của mảng:");
        int[] numbers = new int[size];
        //Menu
        do {
            System.out.println("********** MENU **********");
            System.out.println("1. Nhập giá trị các phần tử.");
            System.out.println("2. Hiển thị giá trị các phần tử.");
            System.out.println("3. Tính tổng các phần tử.");
            System.out.println("4. Hiển thị các phần tử có giá trị lẻ trong mảng.");
            System.out.println("5. Hiển thị các phần tử có chỉ số chẵn trong mảng.");
            System.out.println("6. Sắp xếp mảng tăng dần.");
            System.out.println("7. Thoát.");
            System.out.println("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.printf("numbers[%d] = ",i);
                        numbers[i] = Integer.parseInt(sc.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử trong mảng: ");
                    for(int element:numbers) {
                        System.out.printf("%d\t",element);
                    }
                    System.out.println();
                    break;
                case 3:
                    int sum =0 ;
                    for(int element: numbers){
                        sum+=element;
                    }
                    System.out.println("Tổng các phần tử trong mảng = " + sum);
                    break;
                case 4:
                    System.out.println("Các phần tử có giá trị lẻ trong mảng: ");
                    for(int element:numbers) {
                        if (element%2!=0)
                        {
                            System.out.printf("%d\t",element);
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Các phần tử có chỉ số chẵn trong mảng: ");
                    for (int i = 0; i < numbers.length; i++) {
                        if(i%2==0){
                            System.out.printf("%d\t",numbers[i]);
                        }
                    }
                    System.out.println();
                    break;
                case 6:
                    for (int i = 0; i <numbers.length-1; i++) {
                        for (int j = i+1; j < numbers.length ; j++) {
                            if(numbers[i]>numbers[j]){
                                //đổi chỗ phần tử i và j
                                int temp = numbers[i];
                                numbers[i]=numbers[j];
                                numbers[j]=temp;
                            }
                        }
                    }
                    System.out.println("Mảng đã được sắp xếp tăng dần.");
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.print("Vui lòng nhập từ 1 đến 7!!!");
            }
        }while(true);

    }
}
