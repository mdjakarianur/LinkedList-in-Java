import java.util.LinkedList;

class Main {
  public static void main(String[] args){
    LinkedList<String> languages = new LinkedList<>();
    languages.add("C");
    languages.add("C++");
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    languages.add("TypeScript");
    languages.add("C#");
    languages.add("PHP");
    System.out.println("ArrayList of Programming Language: "+"\n" + languages + "\n");
    languages.set(1,"R");
    System.out.println("Update ArrayList of Programming Language: "+"\n" + languages);
  }
}
