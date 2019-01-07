--
-- File generated with SQLiteStudio v3.1.1 on Sat Jan 5 00:11:44 2019
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: BillData
CREATE TABLE BillData (mbid STRING (10) PRIMARY KEY, cid STRING (10) REFERENCES Customer (cid), nic STRING (10), NewMeter INTEGER, Sramadhana BOOLEAN, AbsentCharge BOOLEAN, Month STRING NOT NULL, OldMeter INTEGER, MonthlyUsageUnit INTEGER);

-- Table: chargingType
CREATE TABLE chargingType (
    chId     INTEGER       PRIMARY KEY ASC ON CONFLICT ROLLBACK,
    chName   STRING (20),
    chAmount DOUBLE (4, 2),
    chDesc   STRING (20) 
);

-- Table: Customer
CREATE TABLE Customer (cid STRING (10) PRIMARY KEY NOT NULL, nic STRING (10) UNIQUE NOT NULL, address_1 STRING (30), address_2 STRING (30), address_3 STRING (30), gid INTEGER, preMeter INTEGER, currentMeter INTEGER, TotalOutstandingAmount DOUBLE (5, 2), MeterNo INTEGER, lastPayment DOUBLE (5, 2), cname STRING (60));
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname) VALUES (1, '883512847v', '"Sinha Sevana"', 'Pananwala', 'Thalatuoya', 1, 0, 10, 100, 1212121, 100, NULL);
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname) VALUES (2, '343434456v', 'retret', 'ertret', 'ertrt', 4, 2, 44, 454, 54545, 45, NULL);
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname) VALUES (3, '454354343v', 'fdgfdgfd', 'fdgfdg', 'dfgdfgfdg', 1, NULL, NULL, NULL, 0, NULL, 'sam dissa');

-- Table: group
CREATE TABLE "group" (gid INTEGER PRIMARY KEY, gname STRING (20) NOT NULL, location STRING (20), description STRING (30));
INSERT INTO "group" (gid, gname, location, description) VALUES (1, 'up', 'up', 'desc1');
INSERT INTO "group" (gid, gname, location, description) VALUES (2, 'down', 'dpwn', 'desc2');
INSERT INTO "group" (gid, gname, location, description) VALUES (3, 'right', 'right', 'desc3');
INSERT INTO "group" (gid, gname, location, description) VALUES (4, 'left', 'lect', 'desc4');

-- Table: MonthlyBillDetails
CREATE TABLE MonthlyBillDetails (InvoiceNo INTEGER PRIMARY KEY, cid STRING (10) REFERENCES Customer (cid), nic STRING (10), "Group" STRING (20), OldMeter INTEGER, NewMeter INTEGER, MonthlyConsumption DOUBLE (5, 2), CurrentTotalAmount DOUBLE (5, 2), FixedCharge DOUBLE (4, 2), Sramadhana DOUBLE (3, 2), AbsentCharge DOUBLE (3, 2), TotalMonthlyAmount DOUBLE (5, 2), Month STRING (8) NOT NULL, TotalOutstandingMonthly DOUBLE (5, 2), MonthlyUsageUnit INTEGER);

-- Table: payment
CREATE TABLE payment (pyid STRING (10) PRIMARY KEY, cid STRING (10) REFERENCES Customer (cid), nic STRING (10) REFERENCES customer (nic), amount DOUBLE (5, 2) NOT NULL, Date STRING (8), oldOutStandingTotal DOUBLE (5, 2), NewOutStandingTotal DOUBLE (5, 2));

-- Table: unit_price
CREATE TABLE unit_price (
    uid   INTEGER       PRIMARY KEY ASC ON CONFLICT ROLLBACK AUTOINCREMENT,
    lower INTEGER,
    upper INTEGER,
    price DOUBLE (4, 2) 
);
INSERT INTO unit_price (uid, lower, upper, price) VALUES (1, 0, 10, 50);
INSERT INTO unit_price (uid, lower, upper, price) VALUES (2, 10, 15, 75);
INSERT INTO unit_price (uid, lower, upper, price) VALUES (3, 15, 100, 100);

-- Trigger: validate_cid_before_insert_customer
CREATE TRIGGER validate_cid_before_insert_customer BEFORE INSERT ON customer FOR EACH ROW BEGIN SELECT CASE WHEN ((SELECT count(cid) FROM customer WHERE cid = NEW.cid) > 0 or (SELECT count(nic) FROM customer WHERE nic = NEW.nic) > 0) THEN RAISE (ABORT, 'Customer Id or NIC already exist') END; END;

-- Trigger: validate_gid_before_insert_group
CREATE TRIGGER validate_gid_before_insert_group 
BEFORE INSERT
ON [group]
FOR EACH ROW
BEGIN
SELECT CASE WHEN ( (
SELECT count(gid) FROM [group]
WHERE gid = NEW.gid)>0) 
THEN RAISE(ABORT, "Group Id already exist") END;
END;

-- Trigger: validate_mbid_before_insert_BillData
CREATE TRIGGER validate_mbid_before_insert_BillData BEFORE INSERT ON BillData FOR EACH ROW BEGIN SELECT CASE WHEN ((SELECT count(mbid) FROM BillData WHERE mbid = NEW.mbid) > 0) THEN RAISE (ABORT, 'Bill data Id already exist') END; END;

-- Trigger: validate_pyid_before_insert_payment
CREATE TRIGGER validate_pyid_before_insert_payment BEFORE INSERT ON payment FOR EACH ROW BEGIN SELECT CASE WHEN ((SELECT count(pyid) FROM payment WHERE pyid = NEW.pyid) > 0) THEN RAISE (ABORT, 'Payment id already exist') END; END;

-- Trigger: validate_uid_before_insert_unit_price
CREATE TRIGGER validate_uid_before_insert_unit_price BEFORE INSERT ON unit_price FOR EACH ROW BEGIN     SELECT CASE WHEN (
                       (
                           SELECT count(uid) 
                             FROM BillData
                            WHERE uid = NEW.uid
                       )
						>0) THEN RAISE(ABORT, "Unit charge Id already exist") END; END;

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
