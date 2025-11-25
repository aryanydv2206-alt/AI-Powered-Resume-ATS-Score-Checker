-- db/schema.sql
CREATE DATABASE IF NOT EXISTS review1_db;
USE review1_db;

CREATE TABLE IF NOT EXISTS users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(100) NOT NULL UNIQUE,
  password VARCHAR(255) NOT NULL,
  role VARCHAR(50) NOT NULL,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- sample user (password is plaintext here for demo only; use hashed passwords in real apps)
INSERT INTO users (username, password, role) VALUES ('student1', 'password123', 'student');
