package enums;

import util.Selectable;

public enum FightingStyle implements Selectable {

    Archery("You gain a +2 bonus to attack rolls you make with ranged weapons."),
    Defense("While you are wearing armor, you gain a +1 bonus to AC."),
    Dueling("When you are wielding a melee weapon in one hand and no other weapons, you gain a +2 bonus to damage rolls with that weapon."),
    Great_Weapon_Fighting("When you roll a 1 or 2 on a damage die for an attack you make with a melee weapon that you are wielding with two hands, "
            + "you can reroll the die and must use the new roll, even if the new roll is a 1 or a 2. "
            + "The weapon must have the two-handed or versatile property for you to gain this benefit."),
    Protection("When a creature you can see attacks a target other than you that is within 5 feet of you, you can use your reaction to impose "
            + "disadvantage on the attack roll. You must be wielding a shield."),
    Two__Weapon_Fighting("When you engage in two-weapon fighting, you can add your ability modifier to the damage of the second attack.");

    private final String desc;

    private FightingStyle(String desc) {
        this.desc = desc;
    }

    @Override
    public String getDescription() {
        return desc;
    }

    @Override
    public String getName() {
        return name().replaceAll("__", "-").replaceAll("_", " ");
    }
}
