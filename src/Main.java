public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println();
        int[] count1 = new int[3];
        for (int i = 0; i < count1.length; i++)
            count1[i] = i + 1;
        double[] count2 = {1.570, 7.654, 9.986};
        boolean[] count3 = {true, false};
        System.out.println();

        //task2
        System.out.println();
        for (int i = 0; i < count1.length; i++) {
            System.out.print(count1[i]);
            if (i != count1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < count2.length; i++) {
            System.out.print(count2[i]);
            if (i != count2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < count3.length; i++) {
            System.out.print(count3[i]);
            if (i != count3.length - 1) {
                System.out.print(", ");
            }
        }

        //task 3
        System.out.println();
        for (int i = count1.length - 1; i >= 0; i--) {
            System.out.print(count1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = count2.length - 1; i >= 0; i--) {
            System.out.print(count2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = count3.length - 1; i >= 0; i--) {
            System.out.print(count3[i]);
            if (i != count3.length - 1) {
                System.out.print(", ");
            }
        }

        //task 4
        System.out.println();
        for (int i = 0; i < count1.length; i++) {
            if (count1[i] % 2 == 1) {
                count1[i]++;
                System.out.print(count1[i]);
                if (i != count1.length - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}