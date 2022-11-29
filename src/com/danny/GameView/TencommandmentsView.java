package com.danny.GameView;

import com.danny.Spirte.TencommandmentSprite.Tencommandment;

import javax.swing.*;
import java.util.ArrayList;

public class TencommandmentsView extends GameView{



    //    private Tencommandment stone;
    private ArrayList<Tencommandment> stones = new ArrayList<>();



    private int count ;

    public TencommandmentsView(){
        img = new ImageIcon("mountain.jpg");
        elements = new ArrayList<>();
//        stone = new Tencommandment(5, 5 );
//        elements.add(stone);
        count = 0;

        stones.add(new Tencommandment(5,5));
        stones.add(new Tencommandment(5,5));
        stones.add(new Tencommandment(3,4));
        stones.add(new Tencommandment(2,5));
        stones.add(new Tencommandment(3,5));
        stones.add(new Tencommandment(4,5));
        stones.add(new Tencommandment(5,7));
        stones.add(new Tencommandment(8,9));
        stones.add(new Tencommandment(1,10));
        stones.add(new Tencommandment(2,10));

        elements.addAll(stones);

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
