package com.devsenior.module2.java.model.security;

/**
 * Esta clase describe la informacion del usurio que ingresara al sistema.
 */
public class User {
    private String name;
    private String email;
    private String password;
    private Boolean active;
    private UserRole role;


    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.active = true;
        this.role = UserRole.USER; 
    }

    /**
     * Crea un nuevo objeto de tipo usuario
     * 
     * @param name Nombre del usuario
     * @param email Correo electronico 
     * @param password Contraseña
     * @param active Identifica si el usuario permanece activo o no. Para decir que el usurio esta activo, se tendra el valor <pre>true</pre> en el campo.
     * @param role Identidfica el rol que tiene el usurario. Puede ser ADMIN, CLIENT, PROVIDER, EMPLOYEE o USER que estan definidos en el num UserRole. 
     */
    public User(String name, String email, String password, Boolean active, UserRole role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.active = active;
        this.role = role;
    }

    /**
     * Retorna el nombre del usuario 
     * @return Cadena que contiene el nombre del usuario
     */

    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }


    public String getPassword() {
        return password;
    }


    public Boolean getActive() {
        return active;
    }


    public UserRole getRole() {
        return role;
    }


public void setPassword(String password) {
    this.password = password;

}

/**
 * Activa el usuario
 */
public void activateUser() {
    this.active = true;
}

/**
 * Desactiva el usuario. Esto lo deja no disponible para iniciar sesion.
 */
public void deactivateUser() {
    this.active = false;
}

public void setRole(UserRole role) {
    this.role = role;
}

@Override
public String toString() {
    
    return getName();
}
    
}
