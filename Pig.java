class Pig implements Animal {     
     private String myType;     
     private String mySound;      
     public Pig(String type, String sound, String name)     {         
         myType = type;         
         mySound = sound; 
         myName = name;
     } 
     
     public Pig()     
     {         
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