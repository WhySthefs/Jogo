import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarroParado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarroParado extends Actor
{
    /**
     * Act - do whatever the CarroParado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(Pessoa.class)){
         Greenfoot.setWorld(new Fase2());
        }
    }    
}
