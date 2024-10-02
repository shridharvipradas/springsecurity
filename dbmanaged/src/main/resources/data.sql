INSERT INTO APP_USER (username, password, role) VALUES ('user1', '$2a$10$12345abcd', 'USER');  -- password: userpass
INSERT INTO APP_USER (username, password, role) VALUES ('admin1', '$2a$10$67890efgh', 'ADMIN');  -- password: adminpass

INSERT INTO account (username, balance) VALUES ('user1', 1000.00);
