// Visitor interface
interface EffectVisitor {
    void applyBoost(Character character);
    void applyDamage(Character character);
}

// Concrete visitor class for effects
class ConcreteEffectVisitor implements EffectVisitor {
    @Override
    public void applyBoost(Character character) {
        System.out.println(character.getName() + " receives a power boost!");
        character.setState(new PoweredUpState());
    }

    @Override
    public void applyDamage(Character character) {
        System.out.println(character.getName() + " takes damage!");
        character.setState(new DefeatedState());
    }
}
