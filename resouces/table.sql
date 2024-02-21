CREATE TABLE contact_message(
    id INT AOTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    company VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    comment TEXT NOT NULL,
    UNIQUE key 'unique_email' (email)
);