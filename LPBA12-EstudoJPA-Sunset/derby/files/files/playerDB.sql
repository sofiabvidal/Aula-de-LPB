CREATE TABLE PLAYER (
        ID INTEGER NOT NULL,
        LASTNAME  VARCHAR(15),
	FIRSTNAME VARCHAR(255),
        JERSEYNUMBER INTEGER,
        LASTSPOKENWORDS VARCHAR(255),
        PRIMARY KEY (ID)
);

CREATE TABLE TEAM(

    TEAM_ID INTEGER NOT NULL,  
    TEAMNAME VARCHAR(15),
    LEAGUE VARCHAR(15),
    PRIMARY KEY (TEAM_ID)

);

INSERT INTO PLAYER VALUES (1, 'Michael', 'Jordan', 30, 'I will be back');
INSERT INTO PLAYER  VALUES (2, 'David', 'Becks', 20, 'I will make it to the team');
INSERT INTO PLAYER  VALUES (3, 'Sachin', 'Tendulkar', 10, 'My best is yet to come');



INSERT INTO TEAM VALUES (1, 'Chicago Bulls', 'club');
INSERT INTO TEAM VALUES (2,'Real Madrid', 'club');
INSERT INTO TEAM VALUES (3,'Mumbai Indians', 'IPl');

