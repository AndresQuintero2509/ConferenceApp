import com.conference.repository.HibernateSpeakerRepositoryImplementation;
import com.conference.repository.SpeakerRepository;
import com.conference.service.SpeakerService;
import com.conference.service.SpeakerServiceImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImplementation service = new SpeakerServiceImplementation();
        service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImplementation();
    }
}
