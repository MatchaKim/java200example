package p28to80;

public class p43 {
    public static void showOddnEvenw(int n) {
        int temp=n;
        while(temp != 1){
            if (temp%2 ==1){
                temp = temp*3+1;
            }else{
                temp/=2;
            }
            System.out.println(temp);
        }
        System.out.println("\n");

    }

    public static void main(String[] args) {
        showOddnEvenw(122);
    }
}
