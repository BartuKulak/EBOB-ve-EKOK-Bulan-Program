import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        int b= input.nextInt();
        int ebob=1;
        int min=0,counter=1;
        if(a>b)
            min=b;
        else if(b>a)
            min=a;
        else
            ebob=a;
        while(counter<=min){
            if(a%counter==0 && b%counter==0){
                ebob=counter;
                counter++;
            }
            else
                counter++;
        }
        System.out.println("EBOB: "+ebob);
        int ekok=(a*b)/ebob;
        System.out.println("EKOK: "+ekok);
    }
}
