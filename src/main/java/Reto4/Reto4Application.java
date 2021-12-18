package Reto4;

import Reto4.Interface.OrderInterface;
import Reto4.Interface.SupplementsInterface;
import Reto4.Interface.UserInterface;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Reto4Application implements CommandLineRunner
{
    @Autowired
    private SupplementsInterface SuppCrudRepository;
    @Autowired
    private UserInterface userCrudRepository;
    @Autowired
    private OrderInterface orderCrudRepository;
	public static void main(String[] args)
        {
		SpringApplication.run(Reto4Application.class, args);
	}

        public void run(String... args) throws Exception 
        {
            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            SuppCrudRepository.deleteAll();
            userCrudRepository.deleteAll();
            orderCrudRepository.deleteAll();
        }
        
}
