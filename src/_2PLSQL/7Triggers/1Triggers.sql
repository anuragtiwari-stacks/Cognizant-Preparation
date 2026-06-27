/*
========================================================
TOPIC : BEFORE INSERT TRIGGER
========================================================

BEFORE Trigger

Runs Before Data Is Inserted.

========================================================
*/

SET SERVEROUTPUT ON;

CREATE OR REPLACE TRIGGER trg_before_insert
BEFORE INSERT
ON LIBRARY_BOOKS
FOR EACH ROW

BEGIN

    DBMS_OUTPUT.PUT_LINE(
        'Book Is Going To Be Inserted'
    );

END;
/

/*
========================================================
TEST
========================================================
*/

INSERT INTO LIBRARY_BOOKS
VALUES
(
    102,
    'Python Basics',
    'Guido Van Rossum',
    700
);

COMMIT;

/*
========================================================
OUTPUT
========================================================

Book Is Going To Be Inserted

1 Row Inserted

========================================================
*/



/*
========================================================
TOPIC : AFTER INSERT TRIGGER
========================================================

AFTER Trigger

Runs After Data Is Inserted.

========================================================
*/

CREATE OR REPLACE TRIGGER trg_after_insert
AFTER INSERT
ON LIBRARY_BOOKS
FOR EACH ROW

BEGIN

    DBMS_OUTPUT.PUT_LINE(
        'Book Inserted Successfully'
    );

END;
/

/*
========================================================
TEST
========================================================
*/

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
OUTPUT
========================================================

Book Inserted Successfully

========================================================
*/



/*
========================================================
TOPIC : AFTER UPDATE TRIGGER
========================================================

Runs After Record Is Updated.

========================================================
*/

CREATE OR REPLACE TRIGGER trg_after_update
AFTER UPDATE
ON LIBRARY_BOOKS
FOR EACH ROW

BEGIN

    DBMS_OUTPUT.PUT_LINE(
        'Book Information Updated'
    );

END;
/

/*
========================================================
TEST
========================================================
*/

UPDATE LIBRARY_BOOKS
SET PRICE = 1000
WHERE BOOK_ID = 101;

COMMIT;

/*
========================================================
OUTPUT
========================================================

Book Information Updated

========================================================
*/


/*
========================================================
TOPIC : AFTER DELETE TRIGGER
========================================================

Runs After Record Is Deleted.

========================================================
*/

CREATE OR REPLACE TRIGGER trg_after_delete
AFTER DELETE
ON LIBRARY_BOOKS
FOR EACH ROW

BEGIN

    DBMS_OUTPUT.PUT_LINE(
        'Book Deleted Successfully'
    );

END;
/

/*
========================================================
TEST
========================================================
*/

DELETE FROM LIBRARY_BOOKS
WHERE BOOK_ID = 103;

COMMIT;

/*
========================================================
OUTPUT
========================================================

Book Deleted Successfully

========================================================
*/


/*
========================================================
TOPIC : OLD AND NEW VALUES
========================================================

:OLD -> Previous Value

:NEW -> New Value

========================================================
*/

CREATE OR REPLACE TRIGGER trg_price_change
BEFORE UPDATE
ON LIBRARY_BOOKS
FOR EACH ROW

BEGIN

    DBMS_OUTPUT.PUT_LINE(
        'Old Price : ' ||
        :OLD.PRICE
    );

    DBMS_OUTPUT.PUT_LINE(
        'New Price : ' ||
        :NEW.PRICE
    );

END;
/

/*
========================================================
TEST
========================================================
*/

UPDATE LIBRARY_BOOKS
SET PRICE = 1500
WHERE BOOK_ID = 101;

COMMIT;

/*
========================================================
OUTPUT
========================================================

Old Price : 1000

New Price : 1500

========================================================
*/


/*
========================================================
TOPIC : VALIDATION TRIGGER
========================================================

Price Cannot Be Less Than Or Equal To Zero

========================================================
*/

CREATE OR REPLACE TRIGGER trg_validate_price
BEFORE INSERT OR UPDATE
ON LIBRARY_BOOKS
FOR EACH ROW

BEGIN

    IF :NEW.PRICE <= 0 THEN

        RAISE_APPLICATION_ERROR(
            -20001,
            'Price Must Be Greater Than Zero'
        );

    END IF;

END;
/

/*
========================================================
TEST
========================================================
*/

INSERT INTO LIBRARY_BOOKS
VALUES
(
    104,
    'Oracle',
    'Oracle Team',
    -500
);

/*
========================================================
OUTPUT
========================================================

ORA-20001:
Price Must Be Greater Than Zero

========================================================
*/