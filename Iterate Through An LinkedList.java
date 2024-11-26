import java.util.LinkedList;

class Main {
  public static void main(String[] args){
    LinkedList<String> languages = new LinkedList<>();
    languages.add("C");
    languages.add("C++");
    languages.add("C#");
    languages.add("Java");
    languages.add("PHP");
    languages.add("Python");
    languages.add("JavaScript");
    languages.add("TypeScript");
    
    System.out.println("ArrayList of Programming Language: "+"\n" + languages);
    System.out.println("Iterate through an ArrayList: "+"\n");
    for(String i: languages){
        System.out.println(i);
    }
  }
}
