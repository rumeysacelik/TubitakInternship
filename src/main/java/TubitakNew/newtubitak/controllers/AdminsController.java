package TubitakNew.newtubitak.controllers;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TubitakNew.newtubitak.controllers.requests.AddAdminRequests;
import TubitakNew.newtubitak.controllers.requests.AdminQueryModel;
import TubitakNew.newtubitak.core.utilities.result.Result;
import TubitakNew.newtubitak.services.AdminService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
@Validated
public class AdminsController {
	

    private final AdminService adminService;

    @PostMapping("/add")
    public Result addAdmin(@RequestBody AddAdminRequests addAdminRequest) {
        return adminService.addAdmin(addAdminRequest.toDomainEntity());

    }
    
    @GetMapping("/getall")
    public List<AdminQueryModel> getAllAdmins() {

        return adminService.getAllAdmin()
                .stream()
                .map(admin -> new AdminQueryModel(admin))
                .toList();
    }

}
