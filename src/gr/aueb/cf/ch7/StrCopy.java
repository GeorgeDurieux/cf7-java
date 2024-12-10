package gr.aueb.cf.ch7;

/**
 * Τα strings ειναι immutable και δεν
 * επηρρεαζει το αντιγραφο της αναφορας.
 * Οποτε εχουμε εγκυρο copy
 * με αντιγραφη της αναφορας.
 */
public class StrCopy {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = s1;
    }
}