import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fase2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fase2 extends World
{

    /**
     * Constructor for objects of class Fase2.
     * 
     */
    public Fase2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 730, 1); 
        addObject(new CarroA(), 50, 300);
        criarobstaculo();
        criarobstaculo();
        criarobstaculo();
        criarobstaculo();
        criarobstaculo();
        criarobstaculo();
    }
    
    public void criarobstaculo() {
     addObject(new Obstaculo(), Greenfoot.getRandomNumber(951),Greenfoot.getRandomNumber(715));
   
    }
}
