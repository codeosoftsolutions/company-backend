package com.codeo.company.admin.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.codeo.company.admin.entity.AdminUser;
import com.codeo.company.admin.repository.AdminUserRepository;
import com.codeo.company.security.JwtUtil;

@Service
public class AdminService {

    private final AdminUserRepository repository;
    public AdminService(AdminUserRepository repository, BCryptPasswordEncoder encoder, JwtUtil jwtUtil) {
		super();
		this.repository = repository;
		this.encoder = encoder;
		this.jwtUtil = jwtUtil;
	}

	private final BCryptPasswordEncoder encoder;
    private final JwtUtil jwtUtil;

   /* public AdminService(AdminUserRepository repository,
                        BCryptPasswordEncoder encoder) {
        this.repository = repository;
        this.encoder = encoder;
    }*/

    // create admin (run once)
    public AdminUser createAdmin(String email, String password) {

        AdminUser admin = new AdminUser();
        admin.setEmail(email);
        admin.setPassword(encoder.encode(password));

        return repository.save(admin);
    }

    // login check
    public boolean login(String email, String password) {

        AdminUser admin = repository.findByEmail(email)
                .orElse(null);

        if (admin == null) return false;

        return encoder.matches(password, admin.getPassword());
    }
    
    
    public String loginAndGenerateToken(String email, String password) {

        AdminUser admin = repository.findByEmail(email)
                .orElse(null);

        if (admin == null) return null;

        if (!encoder.matches(password, admin.getPassword())) {
            return null;
        }

        return jwtUtil.generateToken(email);
    }
    
    
    
    
    
    
    
    
}