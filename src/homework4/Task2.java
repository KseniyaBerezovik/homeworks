package homework4;

public class Task2 {
    public static char [] romanValues = new char [] {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
    public static int [] arabicValues = new int [] {1000, 500, 100, 50, 10, 5, 1};

    public static void main(String[] args) {
        String romanNumber = "DCCXLVII";
        char[] romanArray = romanNumber.toCharArray();

        int arabicNumber = 0;
        for (int i = 0; i < romanArray.length; i++) {
            if (i != romanArray.length - 1 && isActualSubtraction(romanArray[i], romanArray[i + 1])) {
                arabicNumber += getArabicValueByRomanValue(romanArray[i + 1]) - getArabicValueByRomanValue(romanArray[i]);
                i++;
            } else {
                arabicNumber += getArabicValueByRomanValue(romanArray[i]);
            }
        }
        System.out.println(arabicNumber);
    }

    public static int getArabicValueByRomanValue(char romanChar) {
        for (int i = 0; i < romanValues.length; i++) {
            if (romanChar == romanValues[i]) {
                return arabicValues[i];
            }
        }
        return -1;
    }

    public static boolean isActualSubtraction (char current, char next) {
        if (current == 'I' && (next == 'V' || next == 'X')) return true;
        if (current == 'X' && (next == 'L' || next == 'C')) return true;
        if (current == 'C' && (next == 'D' || next == 'M')) return true;
        return false;
    }
}