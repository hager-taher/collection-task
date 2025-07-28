import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String []args){
    PhotoManager manager = new PhotoManager();
    // upload photos
    manager.uploadPhoto(new Photo(1, "Photo 1.jpg", LocalDate.of(2023, 1, 3), Set.of("pyramids" , "egypt" , "toursm" , "history"), "Cairo"));
    manager.uploadPhoto(new Photo(2, "Photo 2.jpg", LocalDate.of(2023, 1, 3), Set.of("nile" , "river" , "sunset" , "egypt"), "Giza"));
    manager.uploadPhoto(new Photo(3, "Photo 3.jpg", LocalDate.of(2023, 8, 9), Set.of("mosque" , "islamic" , "architcture" , "egypt"), "Cairo"));
       manager.uploadPhoto(new Photo(1, "Photo 4.jpg", LocalDate.of(2023, 9, 8), Set.of("museum" , "antiquities" , "pharaohs" , "egypt"), "Cairo" , 30 , 33 , 50));
       // search by date
       System.out.println("Photos with date 2023-1-3 :");
       manager.searchByDate(LocalDate.of(2023,1,3)).forEach(System.out::println);
       // saerch by location
       System.out.println("Photos taken in Cairo :");
       manager.searchByLocation("Cairo").forEach(System.out::println);
       // search by single tag
       System.out.println("Photos with tag 'egypt' :");
       manager.searchByTag("egypt").forEach(System.out::println);
       //search by multiple tags
       System.out.println("Photos with tags : [egypt , sunset]");
       manager.searchByMultipleTags(Set.of("egypt" , "sunset")).forEach(System.out::println);
       // search by location with longtude and latitude 
       System.out.println("Photos taken in cairo zone : ");
       manager.searchByLocationWithDetails("Cairo", 20.3, 10.1).forEach(System.out::println);




}
}
