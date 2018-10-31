public void setup()
{
  Cow c = new Cow("cow", "moo");
  System.out.println(c.getType() + "goes" + c.getSound());
  
  Chicken d = new Chicken("chick", "cluck");
  System.out.println(d.getType() + "goes" + d.getSound());
  
  Pig e = new Pig("pig", "oink");
  System.out.println(e.getType() + "goes" + e.getSound());
  
}
