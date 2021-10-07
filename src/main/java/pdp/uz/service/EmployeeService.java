package pdp.uz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pdp.uz.repository.EmployeeRepository;
import pdp.uz.security.JwtFilter;

@Service
public class EmployeeService implements UserDetailsService {

    @Autowired
    JwtFilter jwtFilter;

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return employeeRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException(email + " not found"));
    }


}
