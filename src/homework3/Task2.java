package homework3;

public class Task2 {

    public static void main(String[] args) {
        int [] array = new int [] {7, 1, 2, 5, 7, 5, 0, 7};
        int [] newArray = new int [array.length];
        int count = 0;
        boolean flag;
        for(int i = 0; i < array.length; i++) {
            flag = true;
            for(int j = 0; j < count; j++) {
                if (array[i] == newArray[j]) {
                    flag = false;
                }
            }
            if (flag) {
                newArray[count] = array[i];
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
