package com.danny.Spirte.DisasterView;

import com.danny.Spirte.Sprite;

import javax.swing.*;

public class Ice extends Sprite {

    public Ice(int x, int y){
        setPosition(x, y);
        img = new ImageIcon("ice.png");
    }




    @Override
    public String overlap(int x, int y) {
        return null;
    }

}
