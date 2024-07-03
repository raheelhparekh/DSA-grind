package Basic;

public class hierarchy {
    public static void main(String[] args) {
    
        Eagle eagle = new Eagle("Eagle", true, 320);
        System.out.println("Species: " + eagle.getSpecies());
        System.out.println("Can fly: " + eagle.get_fly_ability());
    }
}

class Animal {
    String species;

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }
}

class Bird extends Animal {
    boolean can_fly;

    public Bird(String species, boolean can_fly) {
        super(species);
        this.can_fly = can_fly;
    }

    public boolean get_fly_ability() {
        return can_fly;
    }
}

class Eagle extends Bird {
    int speed;

    public Eagle(String species, boolean can_fly, int speed) {
        super(species, can_fly);
        this.speed = speed;
    }

    @Override
    public boolean get_fly_ability() {
        System.out.println(species + " can fly at a speed of " + speed);
        return can_fly;
    }
}