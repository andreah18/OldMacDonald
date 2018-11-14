class NamedCow extends Cow {
  public String myName;
  
  public NamedCow(String type, String name, String sound){
    myName = name;
    myType = type;
    mySound = sound;
  }
  public String getName(){
    return myName;
  }
  
}
