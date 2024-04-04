public class August {
    public static void main(String[] args) {
        int daysInAugust = 31;
        int count = 0;

        for(int i = 1; i <= daysInAugust; i++) {
            if(i % 2 == 0){
                count++;
            }
        }

        System.out.print("Allowed: " + count +" days.");
    }    
}
