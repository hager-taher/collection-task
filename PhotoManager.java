import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PhotoManager {
    private List<Photo> photos = new ArrayList<>();

    public void uploadPhoto(Photo photo) {
        photos.add(photo);
    }
    public List<Photo> searchByTag(String tag){
        List<Photo> result = new ArrayList<>();
        for(Photo item : photos){
            if(item.tags.contains(tag)){
                result.add(item);
            }
        }
        return result ;
    }

    public List<Photo> searchByMultipleTags(Set<String> multipleTags){
        List<Photo> result = new ArrayList<>();
         for(Photo item : photos){
            boolean f = true ;
        for(String tag : multipleTags){
            if(item.tags.contains(tag) == false){
             f = false ;
            }
        }
        if(f == true)
        result.add(item);
    }
        return result ;
    }
    public List<Photo> searchByDate(LocalDate photoDate){
        List<Photo> result = new ArrayList<>();
        for(Photo item : photos){
            if(item.date.equals(photoDate)){
                result.add(item);
            }
        }
        return result ;
    }
     public List<Photo> searchByLocation(String city){
        List<Photo> result = new ArrayList<>();
        for(Photo item : photos){
            if(item.location.equals(city)){
                result.add(item);
            }
        }
        return result ;
    }
    public static double distance(double x1, double y1, double x2, double y2) {
    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));}

    public List<Photo> searchByLocationWithDetails(String city , double cityLatitude, double cityLongitude ){
        List<Photo> result = new ArrayList<>();
        for(Photo item : photos){
            if(item.location.equals(city) && distance(cityLatitude , cityLongitude , item.latitude , item.longitude) <= item.radius){
                result.add(item);
            }
        }
        return result ;
    }

    
}

