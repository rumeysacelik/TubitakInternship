package TubitakNew.newtubitak.controllers.requests;

import TubitakNew.newtubitak.entities.concretes.Admin;

public record AddAdminRequests(

        String userName,
        String password


) {

    public Admin toDomainEntity() {
        return new Admin(userName, password);

    }


}