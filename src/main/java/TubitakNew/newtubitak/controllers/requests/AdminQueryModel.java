package TubitakNew.newtubitak.controllers.requests;

import TubitakNew.newtubitak.entities.concretes.Admin;

public record AdminQueryModel(
        Long id,
        String userName,
        String password
) {
    public AdminQueryModel(Admin admin) {
        this(
                admin.getAdminId(),
                admin.getUserName(),
                admin.getPassword()

        );
    }
}
