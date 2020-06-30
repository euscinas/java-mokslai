import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int counter = 0;
        for (int i = 1; i <= a && counter < a; i++){
            for(int j = 0; j < i && counter < a; j++){
                System.out.print(i+" ");
                counter++;
            }
        }
    }
}
