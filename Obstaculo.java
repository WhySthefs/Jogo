import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstaculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstaculo extends Actor
{
    /**
     * Act - do whatever the Obstaculo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
      int x = getX(); 
      int y = getY();
      setLocation(x- Greenfoot.getRandomNumber(15), y);
        if (isAtEdge() == true) {
           getWorld().addObject(new Obstaculo(),Greenfoot.getRandomNumber(951),Greenfoot.getRandomNumber(716));
           getWorld().removeObject(this);
      }
        
        
    }    
}
