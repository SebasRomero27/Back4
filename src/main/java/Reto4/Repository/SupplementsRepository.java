package Reto4.Repository;

import Reto4.Interface.SupplementsInterface;
import Reto4.Model.Supplements;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SupplementsRepository
{
    @Autowired
    private SupplementsInterface supplementsCrudRepository;
    
    public List<Supplements> getAll()
    {
        return supplementsCrudRepository.findAll();
    }
    
    public Optional<Supplements> getSupplement(String reference)
    {
        return supplementsCrudRepository.findById(reference);
    }
    
    public Supplements create(Supplements supplements)
    {
        return supplementsCrudRepository.save(supplements);
    }
    
    public void update(Supplements supplements)
    {
        supplementsCrudRepository.save(supplements);
    }
    
    public void delete(Supplements supplements)
    {
        supplementsCrudRepository.delete(supplements);
    }
}
