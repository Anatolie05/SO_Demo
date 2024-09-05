// Clasa pentru operația de adunare
class Addition {
    public double add(double a, double b) {
        return a + b;
    }
}

// Clasa pentru operația de scădere
class Subtraction {
    public double subtract(double a, double b) {
        return a - b;
    }
}

// Clasa pentru operația de înmulțire
class Multiplication {
    public double multiply(double a, double b) {
        return a * b;
    }
}

// Clasa pentru operația de împărțire
class Division {
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Nu se poate împărți la zero!");
        }
        return a / b;
    }
}

// Clasa pentru operația de exponențiere
class Exponentiation {
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}

// Clasa pentru operația de extracție a rădăcinii
class Root {
    public double root(double number, double degree) {
        return Math.pow(number, 1.0 / degree);
    }
}

// Clasa principală care gestionează interacțiunea între operațiile aritmetice
public class ArithmeticOperations {
    public static void main(String[] args) {
        // Instanțierea claselor
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();
        Exponentiation exponentiation = new Exponentiation();
        Root root = new Root();

        // Exemple de utilizare a operațiilor aritmetice
        double a = 10;
        double b = 5;

        System.out.println("Adunare: " + addition.add(a, b));
        System.out.println("Scădere: " + subtraction.subtract(a, b));
        System.out.println("Înmulțire: " + multiplication.multiply(a, b));
        try {
            System.out.println("Împărțire: " + division.divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Exponențiere: " + exponentiation.power(a, b));
        System.out.println("Rădăcină: " + root.root(a, 2)); // Rădăcina pătrată a lui a
    }
}
