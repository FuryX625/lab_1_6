import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int liczba;
    Scanner odczyt=new Scanner(System.in);
    System.out.println("Podaj liczbe naturalną");
    liczba=odczyt.nextInt();
    if (liczba<=0){
      System.out.println("Zle dane");
      return;
    }
    
  }
}