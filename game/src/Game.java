
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
                return 111;//go into clash
            }
            else if(c2.getReadiedAttack().equals("feintAttack")){
                return 112;//c1 deals damage to c2
            }
            else if(c2.getReadiedAttack().equals("counterAttack")){
                return 113;//c2 deals damage to c1
            }
        }
        else if(c1.getReadiedAttack().equals("feintAttack")){//agility based
            if(c2.getReadiedAttack().equals("powerAttack")){
                return 121;//c2 deals damage to c1
            }
            else if(c2.getReadiedAttack().equals("feintAttack")){
                return 122;//no one takes damage
            }
            else if(c2.getReadiedAttack().equals("counterAttack")){
                return 123;//c1 deals damage to c2
            }
        }
        else if(c1.getReadiedAttack().equals("counterAttack")){//technique based
            if(c2.getReadiedAttack().equals("powerAttack")){
                return 131;//c1 deals damage to c2
            }
            else if(c2.getReadiedAttack().equals("feintAttack")){
                return 132;//c2 deals damage to c1
            }
            else if(c2.getReadiedAttack().equals("counterAttack")){
                return 133;//to be decided
            }
        }
        return 0;
    }

    public int clashRound(){
        if(c1.getReadiedAttack().equals("push")){
            if(c2.getReadiedAttack().equals("push")){
                return 211;//clash continues
            }
            else if(c2.getReadiedAttack().equals("redirect")){
                return 212;//c2 deals damage to c1, go to normal round
            }
            else if(c2.getReadiedAttack().equals("backwardsAttack")){
                return 213;//c1 deals damage to c2, clash continues
            }
        }
        else if(c1.getReadiedAttack().equals("redirect")){
            if(c2.getReadiedAttack().equals("push")){
                return 221;//c1 deals damage to c2, go to normal round
            }
            else if(c2.getReadiedAttack().equals("redirect")){
                return 222;//no damage, go to normal round
            }
            else if(c2.getReadiedAttack().equals("backwardsAttack")){
                return 223;//c2 deals damage to c1, go to normal round
            }
        }
        else if(c1.getReadiedAttack().equals("backwardsAttack")){
            if(c2.getReadiedAttack().equals("push")){
                return 231;//c2 deals damage to c1, clash continues
            }
            else if(c2.getReadiedAttack().equals("redirect")){
                return 232;//c1 deals damage to c2, go to normal round
            }
            else if(c2.getReadiedAttack().equals("backwardsAttack")){
                return 233;//both take damage, go to normal round
            }
        }
        return 0;
    }
}
