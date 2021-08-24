import com.conference.service.SpeakerService;
import com.conference.service.SpeakerServiceImplementation;

public class Application {
    public static void main(String[] args) {
        SpeakerService service = new SpeakerServiceImplementation();
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
