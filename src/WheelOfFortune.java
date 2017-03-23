class Wheel {
    
    int[] numbers;
    int wheelLength;

    Wheel(int[] numbers) {
        this.numbers = numbers;
        wheelLength = this.numbers.length;
    }

    public void spin(int rotation) {
        rotation = rotation % this.numbers.length;
        for (int i = wheelLength - rotation; i < wheelLength; i++) {
            System.out.print(this.numbers[i] + " ");
        }
        for (int i = 0; i < wheelLength - rotation; i++) {
            System.out.print(this.numbers[i] + " ");
        }
        System.out.println();
    }
    
    void getMax() {
        // code
    }
    void getMin() {
        // code
    }
}

public class CollectionAndThread {

    public static void main(String[] args) throws InterruptedException {
        
        int[] numbers = {2, 1, 5, 3};
        
        Wheel wheel = new Wheel(numbers);
        wheel.spin(5);
        
    }
}
