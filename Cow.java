class Cow implements Animal {     
     protected String myType;     
     protected String mySound;      
     public Cow(String type, String name, String sound)     {         
         myType = type;         
         mySound = sound;
         myName = name;
     }     
     
     public Cow()     
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