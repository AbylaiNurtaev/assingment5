// Strategy interface
interface FightingStrategy {
    void fight();
}

// Melee strategy
class MeleeStrategy implements FightingStrategy {
    @Override
    public void fight() {
        System.out.println("Using melee combat!");
    }
}

// Ranged strategy
class RangedStrategy implements FightingStrategy {
    @Override
    public void fight() {
        System.out.println("Using ranged combat!");
    }
}

// Magic strategy
class MagicStrategy implements FightingStrategy {
    @Override
    public void fight() {
        System.out.println("Using magic combat!");
    }
}
