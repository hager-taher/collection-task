import java.time.LocalDate;
import java.util.Set;

public class Photo{
   int photo_id ;
   String name ;
   LocalDate date ;
   String location ;
   Set <String>tags ;
   double latitude ;
   double longitude ;
   double radius ;


   public Photo(int id , String name , LocalDate date , Set tags  , String location){
    this.photo_id = id ;
    this.tags = tags ;
    this.name = name ;
    this.date = date ;
    this.location = location ;
   }
   public Photo(int id , String name , LocalDate date , Set tags  , String location , double latitude , double longitude , double radius){
    this.photo_id = id ;
    this.tags = tags ;
    this.name = name ;
    this.date = date ;
    this.location = location ;
    this.latitude = latitude ;
     this.longitude = longitude ;
     this.radius = radius;
   }
  @Override
    public String toString() {
        return this.name;
    }

}