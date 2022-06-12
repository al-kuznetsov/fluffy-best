-- MIT License
-- Copyright (c) 2021 Alexander Kuznetsov alkuznetsov@aol.com
-- -------------------------

-- Create global Id sequence
CREATE SEQUENCE global_id_sequence START 1 INCREMENT 5;

-- Location description
-- ---------------------
CREATE TABLE ${mySchema}.country
(
    id integer PRIMARY KEY DEFAULT nextval('global_id_sequence'),
    alpha_two_code VARCHAR(2) NOT NULL, -- ISO 3166-1 alpha-2 codes
    short_name VARCHAR(128)  NOT NULL,
    name VARCHAR(256) NOT NULL
)