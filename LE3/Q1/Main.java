
public class Main {
    public static void main(String[] args) {

        Pandav arjun = new Pandav();
        Pandav bheem = new Pandav();
        Kaurav duryodhan = new Kaurav();
        Vikarn vikarn = new Vikarn();

        
        System.out.println("Testing Arjun:");
        arjun.fight();
        arjun.obey();
        System.out.println(arjun.kind());

        
        System.out.println("\nTesting Bheem:");
        bheem.fight();
        bheem.obey();
        System.out.println(bheem.kind());

        
        System.out.println("\nTesting Duryodhan:");
        duryodhan.fight();
        duryodhan.obey();
        System.out.println(duryodhan.kind());

       
        System.out.println("\nTesting Vikarn:");
        vikarn.fight();
        vikarn.obey();
        System.out.println(vikarn.kind());
    }
}
