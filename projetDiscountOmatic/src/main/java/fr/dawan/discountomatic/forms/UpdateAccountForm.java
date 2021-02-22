package fr.dawan.discountomatic.forms;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UpdateAccountForm {
    @NotEmpty
    @Size(min = 2, max = 50)
    private String prenom;
    
    @NotEmpty
    @Size(min = 2, max = 50)
    private String nom;
    
    @NotEmpty(message="{login.email.notempty}")
    @Email
    private String email;
    
    @NotEmpty(message="{login.email.notempty}")
    @Email
    private String confirm_email;

    @NotEmpty
    @Size(min = 6, max = 40)
    private String password;
    
    @NotEmpty
    @Size(min = 2, max = 40)
    private String confim_password;
    
    @NotEmpty
    @Size(min = 2, max = 40)
    private String phone_number;
    
    public UpdateAccountForm() {
        
    }

    public UpdateAccountForm(@NotEmpty @Size(min = 2, max = 50) String prenom,
            @NotEmpty @Size(min = 2, max = 50) String nom,
            @NotEmpty(message = "{login.email.notempty}") @Email String email,
            @NotEmpty(message = "{login.email.notempty}") @Email String confirm_email,
            @NotEmpty @Size(min = 6, max = 40) String password,
            @NotEmpty @Size(min = 2, max = 40) String confim_password,
            @NotEmpty @Size(min = 2, max = 40) String phone_number) {
        super();
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.confirm_email = confirm_email;
        this.password = password;
        this.confim_password = confim_password;
        this.phone_number = phone_number;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfirm_email() {
        return confirm_email;
    }

    public void setConfirm_email(String confirm_email) {
        this.confirm_email = confirm_email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfim_password() {
        return confim_password;
    }

    public void setConfim_password(String confim_password) {
        this.confim_password = confim_password;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    
    
}
