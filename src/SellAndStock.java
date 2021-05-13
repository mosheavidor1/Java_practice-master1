public class SellAndStock {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5};

        int profit = getMax(a) - getMin(a);

        System.out.println(profit);


    }


    public static int getMax(int num[]) {

        int max = num[0];


        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }

        }
        return max;
    }

    public static int getMin(int num[]) {
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
min=num[i];

            }
        }
        return min;
    }
}