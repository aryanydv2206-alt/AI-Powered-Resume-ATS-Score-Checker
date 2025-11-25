
package com.example.app.model;

public class user {
    private int id;
    private String username;
    private String password; // NOTE: store hashed password in real apps
    private String role;

    public user() {}

    public user(int id, String username, String password, String role) {
        this.id = id; this.username = username; this.password = password; this.role = role;
    }

    // getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}
