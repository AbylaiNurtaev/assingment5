// Template pattern: GameAction class
abstract class GameAction {
    // Template method
    public final void executeAction(Character character) {
        prepare();
        performAction(character);
        conclude();
    }

    protected void prepare() {
        System.out.println("Preparing action...");
    }

    protected abstract void performAction(Character character);

    protected void conclude() {
        System.out.println("Action completed.");
    }
}

// Attack action
class AttackAction extends GameAction {
    @Override
    protected void performAction(Character character) {
        System.out.println(character.getName() + " attacks!");
        character.performAttack();
    }
}

// Defend action
class DefendAction extends GameAction {
    @Override
    protected void performAction(Character character) {
        System.out.println(character.getName() + " defends.");
    }
}

// Heal action
class HealAction extends GameAction {
    @Override
    protected void performAction(Character character) {
        System.out.println(character.getName() + " heals.");
    }
}
