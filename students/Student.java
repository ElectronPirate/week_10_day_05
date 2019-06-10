import java.util.*;

public class Student {

  private ArrayList<IPet> myPets;
  private String myName;

private String name;

//constructor
public Student(String name){
  this.name = name;
  this.myPets = new ArrayList<IPet>();
}

public void addPet(IPet pet){
  this.myPets.add(pet);
}

public String getName(){
  return this.name;
}

public ArrayList<IPet> getPets(){
  return this.myPets;
}

public static void main(String[] args) {

  Student emily = new Student("Emily");

  Dog d = new Dog("Toto");
  Cat c = new Cat("Julius");

  emily.addPet(d);
  emily.addPet(c);

  for (int i=0; i<emily.getPets().size(); i++){
    System.out.println(emily.getPets().get(i).makeNoise());
  }


}

}
