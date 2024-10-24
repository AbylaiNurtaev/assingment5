// State interface
interface CharacterState {
    void attack(Character character, FightingStrategy strategy);
}

// Normal state
class NormalState implements CharacterState {
    @Override
    public void attack(Character character, FightingStrategy strategy) {
        System.out.println(character.getName() + " attacks normally.");
        strategy.fight();
    }
}

// Powered-up state
class PoweredUpState implements CharacterState {
    @Override
    public void attack(Character character, FightingStrategy strategy) {
        System.out.println(character.getName() + " attacks with extra power!");
        strategy.fight();
    }
}

// Defeated state
class DefeatedState implements CharacterState {
    @Override
    public void attack(Character character, FightingStrategy strategy) {
        System.out.println(character.getName() + " is defeated and cannot attack.");
    }
}
