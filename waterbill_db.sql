--
-- File generated with SQLiteStudio v3.1.1 on Sun Dec 30 08:50:19 2018
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: chargingType
DROP TABLE IF EXISTS chargingType;

CREATE TABLE chargingType (
    chId     INTEGER       PRIMARY KEY ASC ON CONFLICT ROLLBACK,
    chName   STRING (20),
    chAmount DOUBLE (4, 2),
    chDesc   STRING (20) 
);


-- Table: customer
DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
    cid                    INTEGER       PRIMARY KEY
                                         NOT NULL,
    nic                    STRING (10)   UNIQUE
                                         NOT NULL,
    address_1              STRING (30),
    address_2              STRING (30),
    address_3              STRING (30),
    gid                    INTEGER,
    preMeter               INTEGER,
    currentMeter           INTEGER,
    TotalOutstandingAmount DOUBLE (5, 2),
    MeterNo                INTEGER,
	lastPayment			   DOUBLE (5, 2)
);


-- Table: group
DROP TABLE IF EXISTS [group];

CREATE TABLE [group] (
    gid         INTEGER     PRIMARY KEY
                            NOT NULL,
    gname       STRING (20) NOT NULL,
    location    STRING (20),
    description STRING (30) 
);


-- Table: monthlyBill
DROP TABLE IF EXISTS monthlyBill;

CREATE TABLE monthlyBill (
    mbid                    INTEGER       PRIMARY KEY,
    cid                     INTEGER       REFERENCES customer (cid),
    nic                     STRING (10),
    OldMeter                INTEGER,
    NewMeter                INTEGER,
    MonthlyConsumption      DOUBLE (5, 2),
    CurrentTotalAmount      DOUBLE (5, 2),
    FixedCharge             DOUBLE (4, 2),
    Sramadhana              DOUBLE (3, 2),
    AbsentCharge            DOUBLE (3, 2),
    TotalMonthlyAmount      DOUBLE (5, 2),
    Month                   STRING        NOT NULL,
    TotalOutstandingMonthly DOUBLE (5, 2) 
);


-- Table: payment
DROP TABLE IF EXISTS payment;

CREATE TABLE payment (
    pyid                INTEGER       PRIMARY KEY,
    cid                 INTEGER       REFERENCES customer (cid),
    amount              DOUBLE (5, 2) NOT NULL,
    Date                DATE,
    oldOutStandingTotal DOUBLE (5, 2),
    NewOutStandingTotal DOUBLE (5, 2) 
);


-- Table: unit_price
DROP TABLE IF EXISTS unit_price;

CREATE TABLE unit_price (
    uid   INTEGER       PRIMARY KEY ASC ON CONFLICT ROLLBACK AUTOINCREMENT,
    lower INTEGER,
    upper INTEGER,
    price DOUBLE (4, 2) 
);


COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
