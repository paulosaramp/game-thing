import java.util.Objects;

public class Character {
    private String name;
    private int strength;
    private int agility;
    private int technique;
    private int abilityPoints;
    private String readiedAttack;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return name.equals(character.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Character(String aName) {
        name = aName;
        strength=5;
        agility=5;
        technique=5;
        abilityPoints=5;
    }

    public int getAbilityPoints() {
        return abilityPoints;
    }

    public void setAbilityPoints(int abilityPoints) {
        this.abilityPoints = abilityPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getTechnique() {
        return technique;
    }

    public void setTechnique(int technique) {
        this.technique = technique;
    }

    public String getReadiedAttack() {
        return readiedAttack;
    }

    public void setReadiedAttack(String readiedAttack) {
        this.readiedAttack = readiedAttack;
    }

    public boolean strengthIncrease(){
        if(abilityPoints>0){
            strength++;
            abilityPoints--;
            return true;
        }
        return false;
    }

    public boolean agilityIncrease(){
        if(abilityPoints>0){
            agility++;
            abilityPoints--;
            return true;
        }
        return false;
    }

    public boolean techniqueIncrease(){
        if(abilityPoints>0){
            technique++;
            abilityPoints--;
            return true;
        }
        return false;
    }

    public boolean strengthDecrease(){
        if(strength>5){
            strength--;
            abilityPoints++;
            return true;
        }
        return false;
    }

    public boolean agilityDecrease(){
        if(agility>5){
            agility--;
            abilityPoints++;
            return true;
        }
        return false;
    }

    public boolean techniqueDecrease(){
        if(technique>5){
            technique--;
            abilityPoints++;
            return true;
        }
        return false;
    }


}
