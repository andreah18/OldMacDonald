 class Farm  {     
    private Animal[] aBunchOfAnimals = new Animal[3];    
    public Farm()     {       
       aBunchOfAnimals[0] = new Cow("cow","Chris","moo");          
       aBunchOfAnimals[1] = new Chicken("chick","Chelsea","cluck");
       aBunchOfAnimals[2] = new Pig("pig","Peter", "oink");    
    }  
    
    public void animalSounds()    {
      for (int nI=0; nI < aBunchOfAnimals.length; nI++) {             
         System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound() );       
      }       
      System.out.println( "The cow is known as " + ((Cow)aBunchOfAnimals[0]).getName() ); 
      Sytem.out.println( "The chick is known as" + ((Chicken)aBunchofAnimals[1]).getName() );
      System.out.println( "The pig is known as " + ((Pig)aBunchOfAnimals[2]).getName() );
    } 
}