import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int liczba, ilosc_dzielnikow = 0;
    Scanner odczyt = new Scanner(System.in);
    System.out.println("Podaj liczbe naturalną");
    liczba = odczyt.nextInt();
    if (liczba <= 0) {
      System.out.println("Złe dane");
      System.exit(0);
    } else if (liczba == 1) {
      System.out.println(liczba + " nie jest liczbą pierwszą");
      return;
    } else if (liczba == 2) {
      System.out.println(liczba + " jest liczbą pierwszą");
      return;
    } else
      for (int i = 1; i <= liczba; i++) {
        if (liczba % i == 0)
          ilosc_dzielnikow++;
      }
    if (ilosc_dzielnikow == 2)
      System.out.println(liczba + " jest liczbą pierwszą");
    else
      System.out.println(liczba + " nie jest liczbą pierwszą");
    return;
  }
}