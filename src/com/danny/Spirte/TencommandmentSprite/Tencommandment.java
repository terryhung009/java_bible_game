package com.danny.Spirte.TencommandmentSprite;

import com.danny.GameView.TencommandmentsView;
import com.danny.Spirte.Sprite;

import javax.swing.*;

public class Tencommandment extends Sprite {

    public Tencommandment(int x ,int y){
        setPosition(x , y);
        img = new ImageIcon("stone.png");


    }

    @Override
    public String overlap(int x, int y) {
        return null;
    }
}
