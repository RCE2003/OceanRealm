package oceanrealm.oceanrealm.combat;

public class DamageCalculator {

    public static double calculateDamage(double baseDamage,
                                         double strength,
                                         double critDamage,
                                         boolean critical) {

        double damage = baseDamage * (1 + (strength / 100));

        if (critical) {
            damage *= (1 + (critDamage / 100));
        }

        return damage;
    }
}