CREATE EXTENSION IF NOT EXISTS plpgsql;
CREATE EXTENSION postgis;

CREATE TABLE IF NOT EXISTS customer (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    first_name VARCHAR(100) NOT NULL,
    middle_name VARCHAR(100),
    surname VARCHAR(100) NOT NULL,
    title VARCHAR(50),
    nationality VARCHAR(50) NOT NULL,
    dob DATE,
    occupation VARCHAR(50),
    identity_number VARCHAR(10) UNIQUE NOT NULL,
    marital_status VARCHAR(30),
    pin VARCHAR(15)
);

CREATE TABLE IF NOT EXISTS contact_info (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    mobile_no VARCHAR(15) NOT NULL UNIQUE,
    email_address VARCHAR(255) UNIQUE,
    box_no VARCHAR(60),
    postal_code VARCHAR(10),
    residence GEOGRAPHY(POINT, 4326) NOT NULL,
    customer_uuid UUID;
    UNIQUE(mobile_no, email_address)
);

CREATE TABLE IF NOT EXISTS referees (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    mobile_no VARCHAR(15) NOT NULL UNIQUE,
    email_address VARCHAR(255) UNIQUE,
    box_no VARCHAR(60),
    postal_code VARCHAR(10),
    occupation VARCHAR(50),
    relationship VARCHAR(50) NOT NULL,
    customer_uuid UUID;
    UNIQUE(mobile_no, email_address)
);


CREATE TABLE IF NOT EXISTS kins (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    mobile_no VARCHAR(15) UNIQUE,
    email_address VARCHAR(255) UNIQUE,
    box_no VARCHAR(60),
    postal_code VARCHAR(10),
    occupation VARCHAR(50),
    relationship VARCHAR(50) NOT NuLL,
    customer_uuid UUID;
    UNIQUE(mobile_no, email_address)
);

CREATE TABLE IF NOT EXISTS biashara (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    mobile_no VARCHAR(15) UNIQUE,
    email_address VARCHAR(255) UNIQUE,
    box_no VARCHAR(60),
    postal_code VARCHAR(10),
    location GEOGRAPHY(POINT, 4326),
    isRegistered BOOLEAN NOT NULL DEFAULT false;
    business_name VARCHAR(255) NOT NULL,
    business_type VARCHAR(255) NOT NULL,
    registration_date DATE,
    registration_no VARCHAR(100) UNIQUE,
    customer_uuid UUID;
    UNIQUE(mobile_no, email_address, registration_no)
);