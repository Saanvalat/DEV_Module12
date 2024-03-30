INSERT INTO Client (name) VALUES
('Luke Skywalker'),
('Leia Organa'),
('Han Solo'),
('Obi-Wan Kenobi'),
('Padme Amidala'),
('Anakin Skywalker'),
('Yoda'),
('Darth Vader'),
('Chewbacca'),
('Mace Windu');

INSERT INTO Planet (id, name) VALUES
('MARS', 'Mars'),
('VEN', 'Venus'),
('EAR', 'Earth'),
('JUP', 'Jupiter'),
('SAT', 'Saturn');

INSERT INTO Ticket (client_id, from_planet_id, to_planet_id, created_at) VALUES
(1, 'MARS', 'VEN', CURRENT_TIMESTAMP),
(2, 'VEN', 'MARS', CURRENT_TIMESTAMP),
(3, 'EAR', 'MARS', CURRENT_TIMESTAMP),
(4, 'JUP', 'SAT', CURRENT_TIMESTAMP),
(5, 'SAT', 'MARS', CURRENT_TIMESTAMP),
(6, 'EAR', 'VEN', CURRENT_TIMESTAMP),
(7, 'MARS', 'JUP', CURRENT_TIMESTAMP),
(8, 'VEN', 'JUP', CURRENT_TIMESTAMP),
(9, 'MARS', 'SAT', CURRENT_TIMESTAMP),
(10, 'JUP', 'VEN', CURRENT_TIMESTAMP);