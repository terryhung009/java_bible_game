package com.danny.GameView;

import com.danny.Spirte.TencommandmentSprite.Tencommandment;

import javax.swing.*;
import java.util.ArrayList;

public class TencommandmentsView extends GameView{



    //    private Tencommandment stone;
    private ArrayList<Tencommandment> stones = new ArrayList<>();



    private int count = 0 ;

    public TencommandmentsView(){
        img = new ImageIcon("mountain.jpg");
        elements = new ArrayList<>();
//        stone = new Tencommandment(5, 5 );
//        elements.add(stone);
    }
    public ArrayList<Tencommandment> getStones() {
        return stones;
    }

    public void setStones(ArrayList<Tencommandment> stones) {
        this.stones = stones;
    }
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
    }



}
