public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");

    Character myCharacter = new Character("daniel", 100);
    myCharacter.modifyHealth(-10);
    myCharacter.printInfo();
    Character myCharacter2 = new Character();
    myCharacter2.printInfo();
  }
}
