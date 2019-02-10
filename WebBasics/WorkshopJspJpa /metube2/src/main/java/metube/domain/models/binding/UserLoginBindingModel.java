package metube.domain.models.binding;

import metube.domain.entities.enums.UserRole;

public class UserLoginBindingModel {

    private String username;
    private String password;
    

    public UserLoginBindingModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
	
	
}
