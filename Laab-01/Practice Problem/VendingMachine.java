public class VendingMachine {
    enum Coin{
        ONE(1),
        TWO(2),
        FIVE(5),
        TEN(10);
        private int value;

        Coin(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0,change = 0;
        While(sum<15){
            System.out.println("Enter Coin (ONE, TWO, FIVE, TEN): ");
        String str = scanner.next().toUpperCase();
        sum += Coin.valueOf(str).getValue();
        if(sum > 15){
            System.out.println("Sum exceeds 15");
            change = sum - 15;
            System.out.println("Change: " + change);
        }
        System.out.println("Sum: " + sum);
    }
   
}