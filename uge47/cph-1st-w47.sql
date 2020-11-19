USE sakila;

SELECT * FROM actor;

SELECT * FROM actor WHERE last_name = "CAGE";

SELECT * FROM actor WHERE first_name != "ZERO" OR "NICK";

SELECT * FROM actor WHERE first_name = "NICK" OR "JOHNNY" OR "JAMES" OR "MORGAN" OR "WHOOPI";