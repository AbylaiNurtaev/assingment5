// Character class
class Character {
    private CharacterState state;
    private FightingStrategy strategy;
    private String name;

    public Character(String name) {
        this.name = name;
        this.state = new NormalState(); // Default state
        this.strategy = new MeleeStrategy(); // Default strategy
    }

    // Change character state
    public void setState(CharacterState state) {
        this.state = state;
        System.out.println(name + " is now in " + state.getClass().getSimpleName());
    }

    // Change fighting strategy
    public void setStrategy(FightingStrategy strategy) {
        this.strategy = strategy;
        System.out.println(name + " switched to " + strategy.getClass().getSimpleName());
    }

    public void performAttack() {
        state.attack(this, strategy);
    }

    public String getName() {
        return name;
    }
}
