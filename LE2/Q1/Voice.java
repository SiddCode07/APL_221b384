class Voice {
    private Animal[] animals = new Animal[5];

    void prepareVoice() {
        System.out.println("Setting up the Voice Machine...");
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
        System.out.println("Voice Machine is ready!\n");
    }

    void hear() {
        System.out.println("Playing animal sounds...\n");
        for (Animal animal : animals) {
            animal.makeVoice();
        }
        System.out.println("\nAll animals have spoken!");
    }
}