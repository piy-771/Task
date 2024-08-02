public class FirstFiftyPrime {
    public static void main(String[] args) {
        int count1 = 0;

        int i = 2;
        while (count1 < 50){
            int count = 0;
            for(int j = 2;j<i;j++){
                if(i % j == 0){
                    count++;

                }
            }
            if(count == 0){
                System.out.println(i);
                count1++;
            }
            i++;
        }
    }
}
