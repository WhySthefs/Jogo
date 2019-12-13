import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarroMovendo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarroMovendo extends Actor
{
    /**
     * Act - do whatever the CarroMovendo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(Greenfoot.getRandomNumber(30));
        
        if(isAtEdge() == true){
         getWorld().addObject(new CarroMovendo(),50,Greenfoot.getRandomNumber(591));
         getWorld().removeObject(this);
        }
       
        
        }
    }    

