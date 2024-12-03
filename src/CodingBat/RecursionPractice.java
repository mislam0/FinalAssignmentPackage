package CodingBat;

public class RecursionPractice {
    public String displayString(String str, int n) {
        if (n == 0) {
            return "";
        }
        return str + displayString(str, n - 1);
    }

    public String displayStringLoop(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str);
        }
        return result.toString();
    }

    public String getMultiChar(char ch, int n) {
        if (n == 0) {
            return String.valueOf(ch);
        }
        return ch + getMultiChar(ch, n - 1);
    }

    public String getMultiCharLoop(char ch, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= n; i++) {  // Note: <= to include n
            result.append(ch);
        }
        return result.toString();
    }
    public long getPowerOfTen(int n) {
        if (n == 0) {
            return 1;
        }
        return 10 * getPowerOfTen(n - 1);
    }

    public long getPowerOfTenLoop(int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= 10;
        }
        return result;
    }

    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public int factorialLoop(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public int numberOfGloves(int peopleOfPlanetU101InARoom) {
        if (peopleOfPlanetU101InARoom == 0) {
            return 0;
        }
        return 3 + numberOfGloves(peopleOfPlanetU101InARoom - 1);
    }

    public int numberOfGlovesLoop(int peopleOfPlanetU101InARoom) {
        int totalGloves = 0;
        for (int i = 0; i < peopleOfPlanetU101InARoom; i++) {
            totalGloves += 3;
        }
        return totalGloves;
    }

    public long getPowerOfTen(int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= 10;
        }
        return result;
    }

    public int numberOfGloves(int peopleOfPlanetU101InARoom) {
        return peopleOfPlanetU101InARoom * 3;
    }

    public int getNumberOfZerosLoop(int n) {
        int count = 0;
        n = Math.abs(n);
        if (n == 0) {
            return 1;
        }
        while (n > 0) {
            if (n % 10 == 0) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public int getNumberOfZerosRecursion(int n) {
        n = Math.abs(n);
        if (n == 0) {
            return 1;
        }
        if (n < 10) {
            return 0;
        }
        if (n % 10 == 0) {
            return 1 + getNumberOfZerosRecursion(n / 10);
        }
        return getNumberOfZerosRecursion(n / 10);
    }
}
