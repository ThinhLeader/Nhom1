import java.util.Scanner;

public class BT_THLTHDT {
    public static void Menu(){
        System.out.println("-------------MENU-------------");
        System.out.println("Moi chon: ");
        System.out.println("1.Bai 1.\n2.Bai 2.\n3.Bai 3.\n4.Bai 4.");
        System.out.println("Nhap lua chon cua ban: ");
    }
    public static void main(String[] args) {
        Menu();
        Scanner sc= new Scanner(System.in);
        int choose = sc.nextInt();

        while (choose != 0) {
            switch (choose) {
                case 1:

                    break;

                case 2:
                    String ten = "Le Van Thinh";
                    int tuoi = 18;
                    double chieucao = 1.76;
                    boolean bancothichlaptrinhkhong = true;
                    char kitudautien = 'L';
                    System.out.println("Ten: " + ten);
                    System.out.println("Tuoi: "+ tuoi);
                    System.out.println("Chieu cao: " + chieucao + 'm');
                    System.out.println("Ban co thich lap trinh khong: " + bancothichlaptrinhkhong);
                    System.out.println("Ki tu dau tien: " + kitudautien);
                    break;

                case 3:
                    System.out.print("Nhap 2 so nguyên: ");
                    int 
                    a=sc.nextInt(),
                    b=sc.nextInt(),
                    Tong=a+b,
                    Hieu=a-b,
                    Tich=a*b,
                    Du=a%b;
                    float Thuong=(float)a/b;
                    System.out.println("Tong= "+Tong);
                    System.out.println("Hieu= "+Hieu);
                    System.out.println("Tich= "+Tich);
                    System.out.println("Thuong= "+Thuong);
                    System.out.println("Phan du= "+Du);
                    break;

                case 4:

                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
                    System.out.println("Nhap lua chon cua ban: ");
                    choose = sc.nextInt();
                    break;
            }

            System.out.println("Ban co muon tiep tuc hay khong?(1/0)");
            choose = sc.nextInt();

            if(choose==0)
                break;
            else{
                Menu();
                System.out.println("Nhap lua chon cua ban:");
                choose = sc.nextInt();
            }
        }
        
        sc.close();
        System.out.println("Hoan thanh bai tap");
    }
}