package es1;

public class Main {
    public static void main(String[] args) {
        System.out.println(stringaPariDispari());
        System.out.println(annoBisestile());
    }

    public static boolean stringaPariDispari() {
        String stringa = "prova";
        if (stringa.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean annoBisestile() {
        int anno = 1900;

        if (anno % 400 == 0 || (anno % 4 == 0 && !(anno % 100 == 0))) {
            return true;
        } else {
            return false;
        }
    }
}
