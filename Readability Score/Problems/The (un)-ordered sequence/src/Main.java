import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int curVal, nextVal;
        String result = "true";
        boolean negative = true;

        for (int i = 0;; i++){
            curVal = Integer.parseInt(inputArray[i]);
            nextVal = Integer.parseInt(inputArray[i+1]);
            if (nextVal == 0){
                break;
            }
            if (curVal == nextVal){
                continue;
            }
            //first iteration
            if (i == 0) {
                negative = (curVal - nextVal) < 0;
            }
            //compare condition if current pair's diff is < 0 with first pair's diff
            if (Boolean.compare(negative, (curVal - nextVal) < 0) != 0){
                result = "false";
                break;
            }

        }
    System.out.println(result);
    }
}