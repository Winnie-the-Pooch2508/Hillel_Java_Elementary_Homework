package com.company.hm7;

public class JumpingWall implements Obstacle {

    private int heightWall;

    public JumpingWall(int heightWall) {
        this.heightWall = heightWall;
    }

    public JumpingWall() {

    }

    @Override
    public boolean overcome(Participant p) {
        return p.jump(heightWall, this.getClass().getSimpleName());
    }

}