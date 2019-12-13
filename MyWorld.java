import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 730, 1); 
        addObject(new CarroMovendo(), 50, 250);
        addObject(new CarroMovendo(), 50, 350);
        addObject(new CarroMovendo(), 50, 470);
        addObject(new CarroMovendo(), 50, 580);
        addObject(new CarroParado(),476,715);
        addObject(new Pessoa(),476,87);
        addObject(new Pessoa(),433,87);
    }
     
    
    
    
}
