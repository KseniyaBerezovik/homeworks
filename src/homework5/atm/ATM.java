package homework5.atm;

public class ATM {

    public static int[] nominals = new int[] {100, 50, 20};
    public static int[] values = new int[] {1, 5, 5};

    public void getCash(int expectedMoney) {

        int[] resultsNominals = new int[] {0, 0, 0};
        int countResultsNominals = -1;

        int[] resultsValues = new int[] {0, 0, 0};
        int countResultsValues = -1;

        for (int nominal : nominals) {
            int index = getIndexInArray(nominals, nominal);
            int value = values[index];
            while (true) {
                if (expectedMoney < nominal || value <= 0) {
                    break;
                }

                expectedMoney -= nominal;
                value--;

                if (getIndexInArray(resultsNominals, nominal) != -1) {
                    resultsNominals[countResultsNominals] = nominal;
                    int i = getIndexInArray(resultsNominals, nominal);
                    resultsValues[i] = resultsValues[i] + 1;
                }
                else {
                    resultsNominals[++countResultsNominals] = nominal;
                    resultsValues[++countResultsValues] = 1;
                }
            }
        }

        if (expectedMoney > 0)
            System.out.println("Недостаточно денег");
        else
        {
            for (int i = 0; i <= countResultsNominals; i++) {
                System.out.println(resultsNominals[i] + " - " + resultsValues[i]);
            }
        }
    }

    public int getIndexInArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}