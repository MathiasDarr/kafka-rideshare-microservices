package org.mddarr.userrequestservice.user;


import org.mddarr.userrequestservice.jpa.AbstractEntityId;

import java.util.UUID;

public class UserId extends AbstractEntityId<UUID> {

    protected UserId() { //<1>

    }

    public UserId(UUID id) { //<2>
        super(id);
    }
}
