package Reto4.Interface;

import Reto4.Model.Supplements;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SupplementsInterface extends MongoRepository<Supplements, String>
{
   
}
