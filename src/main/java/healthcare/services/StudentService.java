package healthcare.services;

import healthcare.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
        @Autowired
        private StudentRepository studentRepository;


}
