import java.util.Random;

public class RandomNumbers {

    private int min = 31;
    private int max = -1;

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.process();

        System.out.println(randomNumbers.getMaxNumber());
        System.out.println(randomNumbers.getMinNumber());
    }

    public void process() {
        Random random = new Random();
        int sum = 0;
        int temp = 0;
        while (sum < 5000) {
            temp = random.nextInt(31);
            sum = sum + temp;

            if (temp > max) { max = temp; }
            if (temp < min) { min = temp; }
        }
    }

    public int getMaxNumber() {
        return max;
    }

    public int getMinNumber() {
        return min;
    }

}





