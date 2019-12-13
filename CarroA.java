import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarroA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarroA extends Actor
{
   /**
     * Act - do whatever the CarroA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mover();
        if(isTouching(Obstaculo.class)) {
          getWorld().addObject(new GameOver(), 500,365);  
          Greenfoot.stop();
         }
        venceu();
        
    } 
    
    
    
    
    
   
    
    
    
   
   public void venceu(){
     if (isAtEdge() == true){
        Greenfoot.setWorld(new YouWin());
        Greenfoot.stop();
     }
    }
    
    
    
   public void mover() {
     
        
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
       
       
   }

}
