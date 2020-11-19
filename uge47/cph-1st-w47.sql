USE sakila;

SELECT * FROM actor;

SELECT * FROM actor WHERE last_name = "CAGE";

SELECT * FROM actor WHERE first_name NOT IN  ("ZERO", "NICK");

SELECT * FROM actor WHERE first_name IN ('NICK', 'JOHNNY', 'JAMES', 'MORGAN', 'WHOOPI');

SELECT * FROM actor WHERE actor_id BETWEEN 50 AND 150;

SELECT * FROM actor WHERE first_name LIKE 'C%';

SELECT * FROM actor ORDER BY first_name;

SELECT * FROM actor ORDER BY last_name DESC;

SELECT COUNT(*) FROM actor;

SELECT COUNT(DISTINCT first_name) FROM actor;
/*
SELECT * from film_category WHERE category_id IN(11);

SELECT * FROM film_category;
*/


INSERT INTO actor(first_name,last_name) VALUES ("Nicolai","Martini");
SELECT * FROM actor;

INSERT INTO film_actor(actor_id,film_id) VALUES (201,7);
INSERT INTO film_actor(actor_id,film_id) VALUES (201,2);
INSERT INTO film_actor(actor_id,film_id) VALUES (201,3);
INSERT INTO film_actor(actor_id,film_id) VALUES (201,4);
INSERT INTO film_actor(actor_id,film_id) VALUES (201,5);
SELECT * FROM film_actor WHERE actor_id LIKE 201;

SELECT * FROM film_actor WHERE actor_id = 201;
UPDATE actor SET first_name = "Anders", last_name = "And" WHERE actor_id = 201;

DELETE FROM film_actor WHERE actor_id = 201;
DELETE FROM actor WHERE actor_id = 201;


SELECT * FROM category;

SELECT title FROM film
JOIN film_category ON film.title = film_category.film_id;

