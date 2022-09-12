package TubitakNew.newtubitak.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TubitakNew.newtubitak.core.utilities.result.Result;
import TubitakNew.newtubitak.core.utilities.result.SuccessDataResult;
import TubitakNew.newtubitak.entities.concretes.Admin;
import TubitakNew.newtubitak.repositories.AdminRepository;

@Service


public class AdminService {
	
	private final AdminRepository adminRepository;
	
	@Autowired
	public AdminService(AdminRepository adminRepository) {
		super();
		
		this.adminRepository = adminRepository;
	}

    public Result addAdmin(Admin admin) {
        adminRepository.save(admin);
        return new SuccessDataResult<List<Admin>>(this.adminRepository.findAll(), "Data listelendi");
    }
    
    public List<Admin> getAllAdmin(){
        return adminRepository.findAll();
    }

    
    

}
