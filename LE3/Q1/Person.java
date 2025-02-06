
abstract class Person {
   
    public abstract void obey();

   
    public String kind() {
        return this.getClass().getSimpleName() + " is kind in their own way.";
    }
}
