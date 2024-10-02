-- Create USER table
CREATE TABLE IF NOT EXISTS APP_USER (
                                      ID BIGINT AUTO_INCREMENT PRIMARY KEY,
                                      USERNAME VARCHAR(50) NOT NULL,
                                      PASSWORD VARCHAR(100) NOT NULL,
                                      ROLE VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS account (
                                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                       username VARCHAR(50),
                                       balance DOUBLE
);