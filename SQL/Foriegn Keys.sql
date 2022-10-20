CREATE TABLE people(
	p_id serial PRIMARY KEY,
	p_username varchar(40) UNIQUE,
	p_password varchar(40),
	name varchar
);

CREATE TABLE status(
	s_id serial PRIMARY KEY,
	status varchar(40)
);


CREATE TABLE gift_list(
	g_id serial PRIMARY KEY,
	description TEXT,
	amount int,
	s_id int REFERENCES status(s_id),
	p_id int REFERENCES people(p_id)
);



