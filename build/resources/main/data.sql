CREATE TABLE virtualpet (id INTEGER NOT NULL AUTO_INCREMENT, pet_name TEXT NOT NULL, pet_description TEXT NOT NULL, pet_hunger INTEGER NOT NULL, pet_thirst INTEGER NOT NULL, pet_boredom INTEGER NOT NULL, PRIMARY KEY (id));
CREATE TABLE virtualPetShelter (id INTEGER NOT NULL AUTO_INCREMENT, shelter_name TEXT NOT NULL, shelter_state TEXT NOT NULL, PRIMARY KEY (id));

CREATE SEQUENCE SHELTER_SEQ START WITH 2 INCREMENT BY 1;
CREATE SEQUENCE VIRTUALPET_SEQ START WITH 5 INCREMENT BY 1;

INSERT INTO virtualPetShelter (id, shelter_name, shelter_state) VALUES (1, 'Paw Haven Adoption Center', 'Wisconsin');

INSERT INTO virtualpet (id, pet_name, pet_description, pet_hunger, pet_thirst, pet_boredom) VALUES (1, 'Shady', 'A sweet old Pit bull with shiny black fur and a heart full of love.', 47, 15, 68);
INSERT INTO virtualpet (id, pet_name, pet_description, pet_hunger, pet_thirst, pet_boredom) VALUES (2, 'Nugget', 'A tiny mischief-maker with caramel fur who cant resist cuddles.', 32, 84, 9);
INSERT INTO virtualpet (id, pet_name, pet_description, pet_hunger, pet_thirst, pet_boredom) VALUES (3, 'Mars', 'A lovable giant puppy who is always chasing his own tail.', 53, 76, 21);
INSERT INTO virtualpet (id, pet_name, pet_description, pet_hunger, pet_thirst, pet_boredom) VALUES (4, 'Midnight', 'A mysterious cat who prowls through the shadows with elegance.', 64, 37, 90);