package com.gamingroom.gameauth.auth;

import io.dropwizard.auth.Authorizer;

public class GameAuthorizer implements Authorizer<GameUser> 
{
    @Override
    public boolean authorize(GameUser user, String role) {
    	
        // Is there a role for this user?
        return user.getRoles() != null && user.getRoles().contains(role);
    	
    }
}