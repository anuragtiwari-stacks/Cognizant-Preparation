/*
========================================================
TOPIC : LIBRARY_BOOKS TABLE
========================================================

This Table Stores Book Information

========================================================
*/

CREATE TABLE LIBRARY_BOOKS
(
    BOOK_ID NUMBER PRIMARY KEY,
    BOOK_NAME VARCHAR2(100),
    AUTHOR_NAME VARCHAR2(100),
    PRICE NUMBER
);

/*
========================================================
INSERT SAMPLE DATA
========================================================
*/

INSERT INTO LIBRARY_BOOKS
VALUES
(
    101,
    'Java Programming',
    'James Gosling',
    500
);

INSERT INTO LIBRARY_BOOKS
VALUES
(
    102,
    'Python Basics',
    'Guido Van Rossum',
    700
);

INSERT INTO LIBRARY_BOOKS
VALUES
(
    103,
    'AWS Cloud',
    'Amazon Team',
    1200
);

COMMIT;

/*
========================================================
DISPLAY DATA
========================================================
*/

SELECT *
FROM LIBRARY_BOOKS;

/*
========================================================
OUTPUT
========================================================

BOOK_ID  BOOK_NAME          AUTHOR_NAME         PRICE

101      Java Programming   James Gosling       500

102      Python Basics      Guido Van Rossum    700

103      AWS Cloud          Amazon Team         1200

========================================================
*/


/*
========================================================
TABLE USED FOR TRIGGERS
========================================================

Operations We Will Perform:

1. INSERT

2. UPDATE

3. DELETE

4. BEFORE INSERT Trigger

5. AFTER UPDATE Trigger

6. AFTER DELETE Trigger

7. :OLD And :NEW

8. Validation Trigger

========================================================
*/


/*
========================================================
Q1. What Is Trigger?

A Trigger Is A PL/SQL Block That
Automatically Executes When An Event Occurs.

--------------------------------------------------------

Q2. Types Of Triggers?

1. BEFORE

2. AFTER

3. INSTEAD OF

--------------------------------------------------------

Q3. Difference Between :OLD And :NEW?

:OLD -> Previous Value

:NEW -> Current Value

--------------------------------------------------------

Q4. How To Disable Trigger?

ALTER TRIGGER trigger_name DISABLE;

--------------------------------------------------------

Q5. How To Enable Trigger?

ALTER TRIGGER trigger_name ENABLE;

========================================================
*/