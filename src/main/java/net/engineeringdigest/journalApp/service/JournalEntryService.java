package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.entity.journalEntry;
import net.engineeringdigest.journalApp.repository.journalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {
@Autowired
private journalEntryRepository journalEntryRepository ;
@Autowired
private UserService userService;

@Transactional
public void saveEntry(journalEntry journalEntry, String userName){
    try{
        User user = userService.findByUserName(userName);
        journalEntry.setDate(LocalDateTime.now());

        journalEntry saved =  journalEntryRepository.save(journalEntry);

        user.getJournalEntries().add(saved);
        userService.saveUser(user);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }

}

    public void saveEntry(journalEntry journalEntry){

        journalEntryRepository.save(journalEntry);
    }

public List<journalEntry> getAll(){
    return journalEntryRepository.findAll();
}
public Optional<journalEntry> findById(ObjectId id){
    return journalEntryRepository.findById(id);
}

@Transactional
public boolean deleteById(ObjectId id, String userName){
    boolean removed = false;
    try {
        User user = userService.findByUserName(userName);
        removed = user.getJournalEntries().removeIf(x -> x.getId().equals(id));
        if (removed) {
            userService.saveUser(user);
            journalEntryRepository.deleteById(id);
        }
    } catch (Exception e) {
        System.out.println(e);
        throw new RuntimeException("an error occured while deleting the entry",e);
    }
    return removed;
}

//public List<journalEntry> findByUserName(String userName){
//    return
//}

}
