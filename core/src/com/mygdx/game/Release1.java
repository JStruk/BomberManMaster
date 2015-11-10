package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;

public class Release1 extends ApplicationAdapter {
    Map map;
    Thumbstick thumbstick;
    Character character;

    @Override
    public void create() {
        thumbstick = new Thumbstick();
        map = new Map();
        thumbstick.create();
        map.ThumbstickHeight(thumbstick.fTouchPadHeight);
        map.create();
        character = new Character();
        character.setMap(map);
        character.create();
        thumbstick.setCharacter(character, character.arbDirection, character.bStop);
    }

    @Override
    public void render() {
        map.render();
        thumbstick.render();
        character.render();
    }
}
