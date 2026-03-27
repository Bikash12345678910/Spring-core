package com.ty;

public class Person {
    private Mobile mob;

    public Mobile getMob() {
        return mob;
    }

    public void setMob(Mobile mob) {
        this.mob = mob;
    }
    public void use(){
        mob.ring();
    }
}
