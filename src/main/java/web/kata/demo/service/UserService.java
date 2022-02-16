package web.kata.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.kata.demo.models.User;
import web.kata.demo.repository.UserRepository;


import java.util.List;
    @Service
    public class UserService {
        private final UserRepository userRepository;
        @Autowired
        public UserService(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        public User findByID(long id){
            return userRepository.getOne(id);

        }
        public List<User> findAll(){
            return userRepository.findAll();
        }
        public User saveUser(User user){
            return userRepository.save(user);
        }
        public void deleteById(long id){
            userRepository.deleteById(id);

        }
    }