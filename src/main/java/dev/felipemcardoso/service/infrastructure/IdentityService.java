package dev.felipemcardoso.service.infrastructure;

import dev.felipemcardoso.webstarter.domain.model.identity.User;

public interface IdentityService {
    User login(String user, String password);
}
