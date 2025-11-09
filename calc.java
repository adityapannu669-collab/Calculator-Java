import java.util.Scanner;
public class calc {
    public static void main(String args[]){
        System.out.println("(1-4):1 for add,2 for sub,3 for mul,4 for div ::");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int r1,r2;

        switch (n) {
            case 1:
                System.out.println("enter no 1:");
                //Scanner s=new Scanner(System.in);
                r1=scan.nextInt();

                System.out.println("enter no 2:");
                r2=scan.nextInt();

                int add=r1+r2;
                System.out.println(add);
                break;

            case 2:
                System.out.println("enter no 1:");
                //Scanner s=new Scanner(System.in);
                r1=scan.nextInt();

                System.out.println("enter no 2:");
                r2=scan.nextInt();

                int sub=r1-r2;
                System.out.println(sub);
                break;

            case 3:
                System.out.println("enter no 1:");
                //Scanner s=new Scanner(System.in);
                r1=scan.nextInt();

                System.out.println("enter no 2:");
                r2=scan.nextInt();

                int mul=r1*r2;
                System.out.println(mul);
                break;

            case 4:
                System.out.println("enter no 1:");
                //Scanner s=new Scanner(System.in);
                r1=scan.nextInt();

                System.out.println("enter no 2:");
                r2=scan.nextInt();

                if(r2>0){
                    int div=r1/r2;
                    System.out.println(div);
                    break;
                }else{
                    System.out.println("not supported");
                    break;
                }

            default:
                System.out.println("choose between (1-4)");
                break;
        }
        

    }
    
}
