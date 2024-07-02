package ex;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        /*
        Nhập số dòng và số cột mảng 2 chiều số nguyên và khởi tạo mảng 2 chiều
        In menu và thực hiên các chức năng theo menu:
        **MENU**
        Nhập giá trị các phần tử
        In giá trị các phần tử theo ma trận
        In giá trị các phần tử nằm trên đường biên của ma trận
        Tính tổng các phần tử chia hết cho 3 trong mảng
        In ra các phần tử trên đường chéo chính và chéo phụ của mảng và tính tổng
        Sắp xếp các dòng giảm dần
        Thoát
        Lựa chọn của bạn:
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số dòng của mảng 2 chiều: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số cột của mảng 2 chiều: ");
        int y = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[x][y];
        do {
            System.out.println("********** MENU **********");
            System.out.println("1. Nhập giá trị các phần tử.");
            System.out.println("2. In giá trị các phần tử theo ma trận.");
            System.out.println("3. In giá trị các phần tử nằm trên đường biên của ma trận.");
            System.out.println("4. Tính tổng các phần tử chia hết cho 3 trong mảng.");
            System.out.println("5. In ra các phần tử trên đường chéo chính và chéo phụ của mảng và tính tổng.");
            System.out.println("6. Sắp xếp các dòng giảm dần.");
            System.out.println("7. Thoát.");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    for (int i = 0; i < x; i++) {
                        for (int j = 0; j < y; j++) {
                            System.out.printf("Nhập giá trị phần tử [%d][%d]: ",i,j);
                            arr[i][j] = Integer.parseInt(sc.nextLine());
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < x; i++) {
                        for (int j = 0; j < y; j++) {
                            System.out.printf("%d\t",arr[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < x; i++) {
                        for (int j = 0; j < y; j++) {
                            if (i == 0 || j==0 || i == x-1 || j == y-1){
                                System.out.printf("%d\t",arr[i][j]);
                            }
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    int sum =0;
                    for (int i = 0; i < x; i++) {
                        for (int j = 0; j < y; j++) {
                            if (arr[i][j]%3==0){
                                sum+=arr[i][j];
                            }
                        }
                    }
                    System.out.println("Tổng các phần tử chia hết cho 3 trong mảng: "+sum);
                    break;
                case 5:
                    int mainsum =0, secsum =0;
                    System.out.println("Các phần tử trên đường chéo chính:");
                    for (int i = 0; i < x; i++) {
                        System.out.printf("%d\t",arr[i][i]);
                        mainsum+=arr[i][i];
                    }
                    System.out.println();
                    System.out.println("Các phần tử trên đường chéo phụ:");
                    for (int i = 0; i <x ; i++) {
                        System.out.printf("%d\t",arr[i][y-1-i]);
                        secsum+=arr[i][y-1-i];
                    }
                    System.out.println();
                    System.out.printf("Tổng các phần tử trên đường chéo chính: %d\n",mainsum);
                    System.out.printf("Tổng các phần tử trên đường chéo phụ: %d\n",secsum);
                    break;
                case 6:
                    // Sắp xếp từng dòng của mảng
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length - 1; j++) {
                            for (int k = j+1; k < arr[i].length; k++) {
                                if (arr[i][j] < arr[i][k]) {
                                    // Hoán đổi array[i][k] và array[i][k + 1]
                                    int temp = arr[i][k];
                                    arr[i][k] = arr[i][j];
                                    arr[i][j] = temp;
                                }
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp mảng giảm dần theo dòng!");
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng nhập từ 1 đến 7!!");
            }
        }while (true);
    }
}
