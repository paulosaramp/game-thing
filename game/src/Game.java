
public class Game {
    private Character c1;
    private Character c2;
    private String gameState;//normal or clash

    public Game(Character a, Character b){
        c1=a;
        c2=b;
        gameState="normal";
    }

    public Character getC1() {
        return c1;
    }

    public void setC1(Character c1) {
        this.c1 = c1;
    }

    public Character getC2() {
        return c2;
    }

    public void setC2(Character c2) {
        this.c2 = c2;
    }

    public int normalRound(){
        if(c1.getReadiedAttack().equals("powerAttack")){//strength based
            if(c2.getReadiedAttack().equals("powerAttack")){
                return 11;//go into clash
            }
            if(c2.getReadiedAttack().equals("feintAttack")){
                return 12;//c1 deals damage to c2
            }
            if(c2.getReadiedAttack().equals("counterAttack")){
                return 13;//c2 deals damage to c1
            }
        }
        if(c1.getReadiedAttack().equals("feintAttack")){//agility based
            if(c2.getReadiedAttack().equals("powerAttack")){
                return 21;//c2 deals damage to c1
            }
            if(c2.getReadiedAttack().equals("feintAttack")){
                return 22;//no one takes damage
            }
            if(c2.getReadiedAttack().equals("counterAttack")){
                return 23;//c1 deals damage to c2
            }
        }
        if(c1.getReadiedAttack().equals("counterAttack")){//technique based
            if(c2.getReadiedAttack().equals("powerAttack")){
                return 31;//c1 deals damage to c2
            }
            if(c2.getReadiedAttack().equals("feintAttack")){
                return 32;//c2 deals damage to c1
            }
            if(c2.getReadiedAttack().equals("counterAttack")){
                return 33;//to be decided
            }
        }
        return 0;
    }

    //public int clashRound(){
    //    if(c1.getReadiedAttack().equals("push")){}//todo:finish
    //}
}
