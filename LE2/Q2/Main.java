public class Main {
    public static void main(String[] args) {
        // Create Voice object and prepare the voices of animals
        Voice voice = new Voice();
        voice.prepareVoice();  // This also calls hear() to display the sounds
    }
}
