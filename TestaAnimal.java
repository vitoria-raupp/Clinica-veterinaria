public class TestaAnimal {
    public static void main(String[] args) {
        
        Animal a1 = new Animal(60,"Ovelha", 30, 20, "branca");
        Animal a2 = new Animal(60,"Ovelha", 30, 20, "branca");
       
        System.out.println(a1); 
        System.out.println();
        System.out.println(a2);
        System.out.println();
        if(a1.equals(a2)){
            System.out.println("Animais iguais ");
        }
        else{
            System.out.println("Animais Diferentes");
        } 
        System.out.println();
        a2.setAnimal(80,"Cavalo", 100, 90, "Marom");
        
        System.out.println(a1);
        System.out.println();
        System.out.println(a2);
        System.out.println();
        if(a1.equals(a2)){
            System.out.println("Animais iguais ");
        }
        else{
            System.out.println("Animais Diferentes");
        } 
    }
}