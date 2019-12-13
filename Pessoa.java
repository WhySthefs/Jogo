
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pessoa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pessoa extends Actor
{
    
    /**
     * Act - do whatever the Pessoa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
        if (Greenfoot.isKeyDown("up")){
         int x = getX();
         int y = getY();
         setLocation(x, y-5);
       }
        
        if (Greenfoot.isKeyDown("down")){
        int x = getX();
        int y = getY();
        setLocation(x, y+5);
       }
       
       if (Greenfoot.isKeyDown("left")){
        int x = getX();
        int y = getY();
        setLocation(x-5, y);
       }
       
       if (Greenfoot.isKeyDown("right")){
        int x = getX();
        int y = getY();
        setLocation(x+5, y);
       }
       
       if (isTouching(CarroMovendo.class)) {
       getWorld().addObject(new GameOver(), 500, 356);
        Greenfoot.stop();
       }
    }    
}
