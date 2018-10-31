class Chicken implements Animal {     
     private String myType;     
     private String mySound;      
     public Chicken(String type, String name, String sound1, String sound2)     {         
         myType = type;         
         mySound = sound; 
         myName = name;
         if(Math.random() < 0.5)
         mySound sound1;
         else
         mySound = sound2;
     } 
     
     public Chicken()     {         
         myType = "unknown";         
         mySound = "unknown"; 
         myName = "unknown";
     }
     
     public String getSound()
     {
       return mySound;
     }  
     
     public String getType()
     {
       return myType;
     } 
     
     public String getName()
     {
       return myName;
     }
}