import java.util.Scanner;

public class Bai7 {
  public static void main(String[] args) {
    //Viết chương trình nhập hai số nguyên n, m và in
    // ra hình chữ nhật đặc các dấu * kích thước n*m. Ví dụ với n=5, m=4:
    System.out.println(" Nhập vào m : ");
    int m = new Scanner(System.in).nextInt();
    System.out.println(" Nhập vào n : ");
    int n = new Scanner(System.in).nextInt();
    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
