CREATE TABLE IF NOT EXISTS category (
    id SERIAL,
    description VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
    );

CREATE TABLE IF NOT EXISTS expense (
    id SERIAL,
    description VARCHAR(100) NOT NULL,
    value DECIMAL(10, 2) NOT NULL,
    category_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (category_id) REFERENCES category(id)
    );
