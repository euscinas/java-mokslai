import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int[] nums = new int[len];
        int prev = 0;
        boolean result = true;
        for (int i = 0; i < len; i++){
            nums[i] = s.nextInt();
            if (i==0){prev = nums[i];}
        }
        for (int num:nums){
            if (num<prev){
                result = false;
                break;
            }
            prev = num;
        }
        System.out.println(result);
    }
}