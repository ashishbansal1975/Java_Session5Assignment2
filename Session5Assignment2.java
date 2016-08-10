class Building
{  
      String printDetails()
      {
          return null;
      }  
}  
  
class FirstBuilding extends Building
{  
    String printName()
      {
          return "Bharat Heavy Electricals Limited";
      } 

    int printNumOfFloors()
      {
          return 5;
      }   

    String printLocation()
      {
          return "New Rajdhani Enclave";
      } 
}  
  
class SecondBuilding extends Building
{  
    String printName()
      {
          return "Software Technology Limited";
      } 

    int printNumOfFloors()
      {
          return 3;
      }   

    String printLocation()
      {
          return "South Extension";
      } 
}  

class ThirdBuilding extends Building
{  
    String printName()
      {
          return "Municipal Corporation";
      } 

    int printNumOfFloors()
      {
          return 10;
      }   

    String printLocation()
      {
          return "Central Secretariat";
      } 
}  


public class Session5Assignment2
{
    public static void main(String [] args) 
    {
          FirstBuilding bldg1 = new FirstBuilding();  
          SecondBuilding bldg2 = new SecondBuilding();  
          ThirdBuilding bldg3 = new ThirdBuilding();  

          System.out.println("The name of the first building is : "+bldg1.printName());  
          System.out.println("The first building is at location: "+bldg1.printLocation());  
          System.out.println("The no. of floors in first building is : "+bldg1.printNumOfFloors());  

          System.out.println("The name of the second building is : "+bldg2.printName());  
          System.out.println("The second building is at location: "+bldg2.printLocation());  
          System.out.println("The no. of floors in second building is : "+bldg2.printNumOfFloors()); 

          System.out.println("The name of the third building is : "+bldg2.printName());  
          System.out.println("The third building is at location: "+bldg2.printLocation());  
          System.out.println("The no. of floors in third building is : "+bldg2.printNumOfFloors()); 
   }
}