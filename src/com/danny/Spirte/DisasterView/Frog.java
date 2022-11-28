package com.danny.Spirte.DisasterView;

import com.danny.Spirte.Sprite;

import javax.swing.*;

public class Frog extends Sprite {

    public Frog(int x, int y){
        setPosition(x, y);
        img = new ImageIcon("frog.png");
    }




    @Override
    public String overlap(int x, int y) {
        return null;
    }
}
