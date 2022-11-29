package com.danny.Spirte;

import com.danny.GameView.DisasterView;
import com.danny.GameView.RedSeaGameView;
import com.danny.GameView.TencommandmentsView;
import com.danny.Main;
import com.danny.Spirte.DisasterView.Bug;
import com.danny.Spirte.DisasterView.Frog;
import com.danny.Spirte.DisasterView.Ice;
import com.danny.Spirte.DisasterView.Tombstone;
import com.danny.Spirte.RedSeaViewSprite.Anubis;
import com.danny.Spirte.RedSeaViewSprite.Cat;
import com.danny.Spirte.RedSeaViewSprite.Pharoah;
import com.danny.Spirte.TencommandmentSprite.Tencommandment;

import javax.swing.*;
import java.util.ArrayList;

public class Moses extends Sprite{

    public Moses(int x, int y){
        setPosition(x , y);
        img = new ImageIcon("Moses.png");
    }


    @Override
    public String overlap(int x, int y) {
        if(Main.gameView instanceof DisasterView){
            //check for bugs and frogs
            ArrayList<Frog> frogs = ((DisasterView) Main.gameView).getFrogs();
            ArrayList<Bug> bugs = ((DisasterView) Main.gameView).getBugs();
            for( Frog f : frogs ){
                if(f.getRelativePosition() != null
                        &&  f.getRelativePosition().x == x
                        &&  f.getRelativePosition().y == y){

                    return "Die";
                }
            }
            for( Bug b : bugs ){
                if(b.getRelativePosition() != null
                        &&  b.getRelativePosition().x == x
                        &&  b.getRelativePosition().y == y){
                    return "Die";
                }
            }

            //check ice and tombstone
            ArrayList<Ice> ices = ((DisasterView) Main.gameView).getIceCubes();
            ArrayList<Tombstone> stones = ((DisasterView) Main.gameView).getStones();
            for(Tombstone s : stones){
                if(s.getRelativePosition() != null
                        &&  s.getRelativePosition().x == x
                        &&  s.getRelativePosition().y == y){
                    return "Cannot move";
                }
            }
            for(Ice i : ices){
                if(i.getRelativePosition() != null
                        &&  i.getRelativePosition().x == x
                        &&  i.getRelativePosition().y == y){
                    return "Cannot move";
                }
            }
            //check for door
            Door door = Main.gameView.getDoor();
            if (x == door.getRelativePosition().x && y == door.getRelativePosition().y){

                return "Next level";
            }






        }else if(Main.gameView instanceof RedSeaGameView){
            //check for cats
            ArrayList<Cat> cats = ((RedSeaGameView) Main.gameView).getCats();
            for(Cat c : cats){
                if(c.getRelativePosition() != null
                        &&  c.getRelativePosition().x == x
                        &&  c.getRelativePosition().y == y){
                    return "Cannot move";
                }
            }
            //check for pharaoh and anubis
            ArrayList<Pharoah> pharoahs = ((RedSeaGameView) Main.gameView).getPharoahs();
            ArrayList<Anubis> anubis = ((RedSeaGameView) Main.gameView).getAnubis();
            for( Anubis b :  anubis ){
                if(b.getRelativePosition() != null
                        &&  b.getRelativePosition().x == x
                        &&  b.getRelativePosition().y == y){
                    return "Die";
                }
            }
            for( Pharoah b :  pharoahs ){
                if(b.getRelativePosition() != null
                        &&  b.getRelativePosition().x == x
                        &&  b.getRelativePosition().y == y){
                    return "Die";
                }
            }
            //check for door
            Door door = Main.gameView.getDoor();
            if (x == door.getRelativePosition().x && y == door.getRelativePosition().y){

                return "Next level";
            }






        }else if (Main.gameView instanceof TencommandmentsView){
//            Tencommandment stone = ((TencommandmentsView) Main.gameView).getStone();
//            if(x == stone.relativePosition.x && y == stone.relativePosition.y){
//                return  "Game over";
//            }
            ArrayList<Tencommandment> stones = ((TencommandmentsView) Main.gameView).getStones();
            for(Tencommandment stone : stones){
                if(stone.getRelativePosition() != null
                        && stone.getRelativePosition().x == x
                        && stone.getRelativePosition().y == y){
                    stone.setNullPosition();
                    ((TencommandmentsView) Main.gameView).setCount(1);
                    if(((TencommandmentsView) Main.gameView).getCount() ==10){
                        return  "Game over";
                    }else{
                        return "none";
                    }
                }
            }







        }




        return "none";
    }
}
