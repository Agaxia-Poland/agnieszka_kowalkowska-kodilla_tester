public class RandomNumbers {
    public int getCountOfRandomNumber(int max) {

        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max = 5000) {
            int temp = random.nextInt(30);
            sum = sum + temp;
            result++;
        }
        return result;
    }
}
