package jp.ac.uryukyu.ie.e195710;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;
    String teki;


    public LivingThing(String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public LivingThing() {

    }


    public boolean isDead() {
        return dead;
    }

    public String getName() {
        return name;
    }

    /**
     * Enemyへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param  攻撃対象
     */

    public void attack(String teki) {
        int damage = (int) (Math.random() * attack);
        if (dead == false) {
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, this.teki, damage);
                teki.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}