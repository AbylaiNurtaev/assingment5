public class Main {
    public static void main(String[] args) {
        // Create a character
        Character hero = new Character("Hero");

        // Use Strategy and State Patterns
        hero.performAttack(); // Normal Melee attack

        hero.setStrategy(new MagicStrategy()); // Switch to Magic Strategy
        hero.performAttack(); // Normal Magic attack

        hero.setState(new PoweredUpState()); // Change to PoweredUp state
        hero.performAttack(); // Powered-up Magic attack

        // Template Pattern
        GameAction attackAction = new AttackAction();
        attackAction.executeAction(hero);

        // Visitor Pattern
        EffectVisitor effectVisitor = new ConcreteEffectVisitor();
        effectVisitor.applyDamage(hero); // Hero takes damage and is defeated
        effectVisitor.applyBoost(hero); // Hero gets powered-up again
    }
}
