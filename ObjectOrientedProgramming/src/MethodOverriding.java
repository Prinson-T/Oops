class animalOne{
public void animalSound(){
    System.out.println("The animal makes a sound");
    }
}
class pig extends animalOne {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}
class horse extends animalOne {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        horse h=new horse();
        h.animalSound();
        animalOne a=new animalOne();
        a.animalSound();
        pig p=new pig();
        p.animalSound();
    }
}

