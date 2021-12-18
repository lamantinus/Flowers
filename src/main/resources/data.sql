INSERT INTO country (name)
VALUES ('Belarus'),
       ('Russia'),
       ('Ukraine'),
       ('Poland'),
       ('Kazakhstan');

INSERT INTO user_role (name)
VALUES ('CUSTOMER'),
       ('ADMIN');

INSERT INTO product_material (name)
VALUES ('WOOD'),
       ('EPOXY'),
       ('WOOD_EPOXY');

INSERT INTO product_category (name)
VALUES ('PENDANT'),
       ('RING'),
       ('OTHER');

INSERT INTO user (id, username, password, phone, role_name)
VALUES (DEFAULT, 'admin', '$2a$10$bfhMOcaGids7iiuTZl1E/Op10N/sGekq9wTjQL5iSNuOa7ZKia8g2', '+375290000000', 'ADMIN'),
       (DEFAULT, 'customer', '$2a$10$bfhMOcaGids7iiuTZl1E/Op10N/sGekq9wTjQL5iSNuOa7ZKia8g2', '+375330000000',
        'CUSTOMER');

INSERT INTO address (id, zip_code, country, region, city, address, user_id)
VALUES (DEFAULT, '220000', 'Belarus', 'Minskiy', 'Minsk', 'Nemiga st. 130', '1');

INSERT INTO product (id, name, care, filling, image_url, price, delivery_days, category_name, material_name)
VALUES (DEFAULT, 'Розы', 'Not necessary', 'Wood', 'https://instrument33.ru/wp/wp-content/uploads/2021/10/rozy.jpg', 52,
        2, 'RING', 'EPOXY'),
       (DEFAULT, 'Хризантемы', 'Not necessary', '-',
        'https://phonoteka.org/uploads/posts/2021-03/1616990510_30-p-khrizantemi-buket-fon-pozdravlenie-43.jpg', 90, 1,
        'PENDANT', 'WOOD_EPOXY'),
       (DEFAULT, 'Лилии', 'Not necessary', 'Moss',
        'https://mobimg.b-cdn.net/v3/fetch/96/96fe038c4e39d77b284b3390c20e5c6d.jpeg', 50, 1, 'OTHER', 'WOOD_EPOXY'),
       (DEFAULT, 'Тюльпаны', 'Do not wash', '-',
        'https://phonoteka.org/uploads/posts/2021-03/1617008097_40-p-ogromnii-buket-tyulpanov-fon-pozdravlenie-53.jpg',
        67, 1, 'OTHER', 'WOOD');

INSERT INTO basket (id, completed, date, user_id)
VALUES (DEFAULT, true, '2021-09-20', '1');

INSERT INTO basket_item (id, quantity, basket_id, product_id)
VALUES (DEFAULT, '2', '1', '2'),
       (DEFAULT, '1', '1', '3');
