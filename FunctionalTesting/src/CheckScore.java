import java.util.Scanner;

public class CheckScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double math = 0.0;
        Double literature = 0.0;

        try{
            System.out.println("Nhap diem Toan: ");
            math = Double.valueOf(scanner.nextLine());
            System.out.println("Nhap diem Van: ");
            literature = Double.valueOf(scanner.nextLine());
        } catch (Exception e){
            System.out.println("Diem khong hop le");
            return;
        }

        if(math > 4){
            if(literature > 4){
                if(math + literature > 9){
                    System.out.println("Dat");
                } else {
                    System.out.println("Khong dat");
                }
            } else {
                System.out.println("Khong dat");
            }
        } else {
            System.out.println("Khong dat");
        }

    }
}
