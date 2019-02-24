--
-- File generated with SQLiteStudio v3.1.1 on Sun Feb 24 13:18:32 2019
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: BackupMonthlyBillDetails
DROP TABLE IF EXISTS BackupMonthlyBillDetails;

CREATE TABLE BackupMonthlyBillDetails (
    InvoiceNo               STRING (10),
    cid                     STRING (10),
    nic                     STRING (10),
    GroupId                 STRING (10),
    OldMeter                INTEGER,
    NewMeter                INTEGER,
    MonthlyConsumption      DOUBLE (5, 2),
    CurrentTotalAmount      DOUBLE (5, 2),
    FixedCharge             DOUBLE (4, 2),
    Sramadhana              DOUBLE (3, 2),
    AbsentCharge            DOUBLE (3, 2),
    TotalMonthlyAmount      DOUBLE (5, 2),
    Month                   STRING (8)    NOT NULL,
    TotalOutstandingMonthly DOUBLE (5, 2),
    MonthlyUsageUnit        INTEGER,
    LastPaymentDay          STRING (8) 
);


-- Table: backuppayment
DROP TABLE IF EXISTS backuppayment;

CREATE TABLE backuppayment (
    pyid                STRING (20),
    cid                 STRING (10),
    nic                 STRING (10),
    amount              DOUBLE (5, 2) NOT NULL,
    Date                STRING (8),
    oldOutStandingTotal DOUBLE (5, 2),
    NewOutStandingTotal DOUBLE (5, 2) 
);


-- Table: BillData
DROP TABLE IF EXISTS BillData;

CREATE TABLE BillData (
    mbid             STRING (10) PRIMARY KEY,
    cid              STRING (10) REFERENCES Customer (cid),
    nic              STRING (10),
    NewMeter         INTEGER,
    Sramadhana       INTEGER,
    AbsentCharge     INTEGER,
    Month            STRING      NOT NULL,
    OldMeter         INTEGER,
    MonthlyUsageUnit INTEGER
);


-- Table: Customer
DROP TABLE IF EXISTS Customer;

CREATE TABLE Customer (
    cid                    STRING (10)   NOT NULL
                                         UNIQUE,
    nic                    STRING (10),
    address_1              STRING (30),
    address_2              STRING (30),
    address_3              STRING (30),
    gid                    STRING (10)   REFERENCES [group] (gid),
    preMeter               INTEGER,
    currentMeter           INTEGER,
    TotalOutstandingAmount DOUBLE (5, 2),
    MeterNo                INTEGER,
    lastPayment            DOUBLE (5, 2),
    cname                  STRING (60),
    CFirstName             STRING (15),
    lastPaymentDate        STRING (10),
    InitialFeeTotal        DOUBLE (5, 2),
    InitialReceived        DOUBLE (5, 2) 
);

INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (1, '', '', '', '', 1, NULL, 0, 0, '', 0, 'E.M. Gunathilake', 'Gunathilake', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (2, '', '', '', '', 1, NULL, 0, 0, '', 0, 'E.M. Weerasinghe Banda', 'Weerasinghe Banda', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (3, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M. Mahinda Bandara', 'Mahinda Bandara', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (4, '', '', '', '', 1, NULL, 0, 0, '', 0, 'E.M. Anura Shantha', 'Anura Shantha', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (5, '', '', '', '', 1, NULL, 0, 0, '', 0, 'E.M. Ajith Bandara', 'Ajith Bandara', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (6, '', '', '', '', 1, NULL, 0, 0, '', 0, 'E.M. Ranmanike', 'Ranmanike', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (7, '', '', '', '', 1, NULL, 0, 0, '', 0, 'Weerakoon Banda', 'Weerakoon Banda', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (8, '', '', '', '', 1, NULL, 0, 0, '', 0, 'Lakshika Sakalasooriya', 'Lakshika', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (9, '', '', '', '', 1, NULL, 0, 0, '', 0, 'R.H.M. Senevirathne', 'Senevirathne', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (10, '', '', '', '', 1, NULL, 0, 0, '', 0, 'U.R.K. Walisundara', 'Walisundara', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (11, '', '', '', '', 1, NULL, 0, 0, '', 0, 'T.B. Sakalasooriya', 'Sakalasooriya', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (12, '', '', '', '', 1, NULL, 0, 0, '', 0, 'E.M. Nimal Edirisinghe', 'Nimal', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (13, '', '', '', '', 1, NULL, 0, 0, '', 0, 'A.G.S.G. Ambagaspitiya', 'Ambagaspitiya', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (14, '', '', '', '', 1, NULL, 0, 0, '', 0, 'E.M. Dayarathne', 'Dayarathne', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (15, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M. Nuwan Kahawatte', 'Nuwan', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (16, '', '', '', '', 1, NULL, 0, 0, '', 0, 'H.M. Gamini Herath', 'Gamini Herath', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (17, '', '', '', '', 1, NULL, 0, 0, '', 0, 'R. Kumarihami Kahawatte', 'Kumarihami Kahawatte', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (18, '', '', '', '', 1, NULL, 0, 0, '', 0, 'U.B. Kahawatte', 'Udaya Bandara', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (19, '', '', '', '', 1, NULL, 0, 0, '', 0, 'Bandula Kahawatte', 'Bandula', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (20, '', '', '', '', 1, NULL, 0, 0, '', 0, 'H.M. Rathnayake Banda', 'Rathnayake Banda', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (21, '', '', '', '', 1, NULL, 0, 0, '', 0, 'B.D.R. Gunathilake', 'Gunathilake', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (22, '', '', '', '', 1, NULL, 0, 0, '', 0, 'G.M. Sisil Bandara', 'Sisil Bandara', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (23, '', '', '', '', 1, NULL, 0, 0, '', 0, 'A.G. Sirisena', 'Sirisena', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (24, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M.Wijerathne(Agawatha)', 'Wijerathne(Agawatha)', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (25, '', '', '', '', 1, NULL, 0, 0, '', 0, 'A.G. Bodhipala', 'Bodhipala', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (26, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M. Anulawathi', 'Anulawathi', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (27, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M. Tikiri Manike (Mathalage)', 'Tikiri Manike (Mathalage)', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (28, '', '', '', '', 1, NULL, 0, 0, '', 0, 'Sarath', 'G.A. Sarath Gunasinghe', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (29, '', '', '', '', 1, NULL, 0, 0, '', 0, 'G.A. Lal Gunasinghe', 'Lal Gunasinghe', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (30, '', '', '', '', 1, NULL, 0, 0, '', 0, 'G.A. Hubert Gunasinghe', 'Hubert', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (31, '', '', '', '', 1, NULL, 0, 0, '', 0, 'W.R.D.M. Bisokumari', 'Bisokumari', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (32, '', '', '', '', 1, NULL, 0, 0, '', 0, 'E.M. Daluwatta', 'Daluwatta', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (33, '', '', '', '', 1, NULL, 0, 0, '', 0, 'H.M. Bandula Herath', 'Bandula Herath', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (34, '', '', '', '', 1, NULL, 0, 0, '', 0, 'Upathissa Pananwala', 'Upathissa', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (35, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M. Indrani Manike', 'Indrani Manike', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (36, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M. Dhammika Bandara', 'Dhammika', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (37, '', '', '', '', 1, NULL, 0, 0, '', 0, 'S. Nandha De Silva', 'Nandha', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (38, '', '', '', '', 1, NULL, 0, 0, '', 0, 'A.M. Susantha Kumari', 'Susantha Kumari', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (39, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M. Samarakoon Banda', 'Samarakoon Banda', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (40, '', '', '', '', 1, NULL, 0, 0, '', 0, 'H.M. Amila Herath', 'Amila Herath', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (41, '', '', '', '', 1, NULL, 0, 0, '', 0, 'H.M. Kiri Banda', 'Kiri Banda', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (42, '', '', '', '', 1, NULL, 0, 0, '', 0, 'H.M. Indrani Herath', 'Indrani Herath', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (43, '', '', '', '', 1, NULL, 0, 0, '', 0, 'H.M. Udhaya Bandara', 'Udhaya Bandara', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (44, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M. Karunawathi', 'Karunawathi', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (45, '', '', '', '', 1, NULL, 0, 0, '', 0, 'H.M. Heenkendha', 'Heenkendha', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (46, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M. Yasomanike', 'Yasomanike', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (47, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M. Heenmanike', 'Heenmanike', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (48, '', '', '', '', 1, NULL, 0, 0, '', 0, 'P.B. Herath', 'P.B. Herath', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (49, '', '', '', '', 1, NULL, 0, 0, '', 0, 'D.M. Kapilarathne', 'Kapilarathne', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (50, '', '', '', '', 1, NULL, 0, 0, '', 0, 'P.M. Alahakoon', 'Alahakoon', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (51, '', '', '', '', 1, NULL, 0, 0, '', 0, 'W.R.D.M. Senevirathne', 'Senevirathne', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (52, '', '', '', '', 1, NULL, 0, 0, '', 0, 'D.M. Rathnayake', 'Rathnayake', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (53, '', '', '', '', 1, NULL, 0, 0, '', 0, 'A.M. Kiri Banda', 'Kiri Banda', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (54, '', '', '', '', 1, NULL, 0, 0, '', 0, 'E.M. Punchi Banda', 'Punchi Banda', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (55, '', '', '', '', 1, NULL, 0, 0, '', 0, 'Upul Wickramasinghe', 'Upul', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (56, '', '', '', '', 1, NULL, 0, 0, '', 0, 'G.M. Samantha Dasanayake', 'Samantha', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (57, '', '', '', '', 1, NULL, 0, 0, '', 0, 'E.M. Ukku Banda', 'Ukku Banda', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (58, '', '', '', '', 1, NULL, 0, 0, '', 0, 'G.M. Ranasinghe Banda', 'Ranasinghe', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (59, '', '', '', '', 1, NULL, 0, 0, '', 0, 'H.M. Nawarathne Banda', 'Nawarathne', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (60, '', '', '', '', 1, NULL, 0, 0, '', 0, 'G.M. Abeyrathne', 'Abeyrathne', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (61, '', '', '', '', 1, NULL, 0, 0, '', 0, 'D.R. Anusha', 'Anusha', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (62, '', '', '', '', 1, NULL, 0, 0, '', 0, 'G.M. Sani Bandara', 'Sani', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (63, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M. Thilakarathne', 'Thilakarathne', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (64, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M. Tikiri Banda', 'Tikiri Banda', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (65, '', '', '', '', 1, NULL, 0, 0, '', 0, 'H.M. Karunathilake', 'Karunathilake', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (66, '', '', '', '', 1, NULL, 0, 0, '', 0, 'H.M. Ajith Bandara', 'Ajith', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (67, '', '', '', '', 1, NULL, 0, 0, '', 0, 'H.M. Abeyrathne Banda', 'Abeyrathne Banda', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (68, '', '', '', '', 1, NULL, 0, 0, '', 0, 'H.M. Gunarathne Banda', 'Gunarathne Banda', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (69, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M. Wijerathne', 'Wijerathne', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (70, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M. Dayarathne', 'Dayarathne', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (71, '', '', '', '', 1, NULL, 0, 0, '', 0, 'D.M. Seetha Manike', 'Seetha Manike', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (72, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M. Koinmanike', 'Koinmanike', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (73, '', '', '', '', 1, NULL, 0, 0, '', 0, 'A.M. Punchi Banda', 'Punchi Banda', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (74, '', '', '', '', 1, NULL, 0, 0, '', 0, 'H.M. Udhaya Bandara', 'Udhaya Bandara', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (75, '', '', '', '', 1, NULL, 0, 0, '', 0, 'C.K. Wickramasinghe', 'Wickramasinghe', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (76, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M.A. Konara', 'Konara', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (77, '', '', '', '', 1, NULL, 0, 0, '', 0, 'R.H.M. Tikiri Banda', 'Tikiri Banda', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (78, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M.S. Konara Bandara', 'Konara Bandara', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (79, '', '', '', '', 1, NULL, 0, 0, '', 0, 'D.M.N.B. Dissanayake', 'Dissanayake', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (80, '', '', '', '', 1, NULL, 0, 0, '', 0, 'J.C.B. Konara', 'Konara', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (81, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M. Sajeewa Konara', 'Sajeewa Konara', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (82, '', '', '', '', 1, NULL, 0, 0, '', 0, 'A.M. Abeyrathne (Welege)', 'Abeyrathne (Welege)', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (83, '', '', '', '', 1, NULL, 0, 0, '', 0, 'Nishanka Herath', 'Nishanka', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (84, '', '', '', '', 1, NULL, 0, 0, '', 0, 'Grameeya Bank (Pananwala)', 'Grameeya Bank', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (85, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M. Heenbanda', 'Heenbanda', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (86, '', '', '', '', 1, NULL, 0, 0, '', 0, 'Hemantha Rathnayake', 'Hemantha', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (87, '', '', '', '', 1, NULL, 0, 0, '', 0, 'Nimal Herath', 'Nimal Herath', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (88, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M.Senevirathne (KosgahamulaG)', 'Senevirathne', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (89, '', '', '', '', 1, NULL, 0, 0, '', 0, 'Indika Nuwan Bandara', 'Indika Nuwan', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (90, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M.S.Y. Karunarathne', 'Karunarathne', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (91, '', '', '', '', 1, NULL, 0, 0, '', 0, 'M.A. Withanaarachchi', 'Withanaarachchi', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (92, '', '', '', '', 1, NULL, 0, 0, '', 0, 'H.M.Wichramarathne', 'Wichramarathne', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (93, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M. Maddhuma Bandara', 'Maddhuma Bandara', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (94, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M. Nimalrathne Banda', 'Nimalrathne Banda', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (95, '', '', '', '', 1, NULL, 0, 0, '', 0, 'Kapila Nimal Bandara', 'Kapila Nimal', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (96, '', '', '', '', 1, NULL, 0, 0, '', 0, 'Udaya Bandara (New house)', 'Udaya Bandara', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (97, '', '', '', '', 1, NULL, 0, 0, '', 0, 'K.M. Senevirathne (Mabothalawa)', 'Senevirathne', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (98, '', '', '', '', 1, NULL, 0, 0, '', 0, 'Dulshantha Kahawatte', 'Dulshantha', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (99, '', '', '', '', 1, NULL, 0, 0, '', 0, 'G.M. Jayathilake', 'Jayathilake', NULL, '', '');
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (100, '', '', '', '', 1, NULL, 0, 0, '', 0, 'H.M.C.K.D. Bandara', 'Bandara', NULL, '', '');

-- Table: ExtraCharges
DROP TABLE IF EXISTS ExtraCharges;

CREATE TABLE ExtraCharges (
    SramadhanaCharge DOUBLE (4, 2),
    AbsentCharge     DOUBLE (4, 2),
    FixedCharge      DOUBLE (4, 2) 
);

INSERT INTO ExtraCharges (SramadhanaCharge, AbsentCharge, FixedCharge) VALUES (25, 50, 150);

-- Table: group
DROP TABLE IF EXISTS [group];

CREATE TABLE [group] (
    gid         STRING (10) PRIMARY KEY,
    gname       STRING (20) NOT NULL,
    location    STRING (20),
    description STRING (30) 
);

INSERT INTO "group" (gid, gname, location, description) VALUES (1, 'up', 'down', 'down');
INSERT INTO "group" (gid, gname, location, description) VALUES (2, 'down', 'up', 'up');
INSERT INTO "group" (gid, gname, location, description) VALUES (3, 'right', 'right', 'desc3');
INSERT INTO "group" (gid, gname, location, description) VALUES (4, 'left', 'lect', 'desc4');

-- Table: InitialPayment
DROP TABLE IF EXISTS InitialPayment;

CREATE TABLE InitialPayment (
    cid                     STRING (10)   REFERENCES Customer (cid) 
                                          NOT NULL,
    totalInitialPayment     DOUBLE (5, 2),
    newlyReceivedPyament    DOUBLE (5, 2),
    remainingInitialPayment DOUBLE (5, 2),
    Date                    STRING (8) 
);


-- Table: MonthlyBillDetails
DROP TABLE IF EXISTS MonthlyBillDetails;

CREATE TABLE MonthlyBillDetails (
    InvoiceNo               STRING (10)   PRIMARY KEY,
    cid                     STRING (10)   REFERENCES Customer (cid),
    nic                     STRING (10),
    GroupId                 STRING (10),
    OldMeter                INTEGER,
    NewMeter                INTEGER,
    MonthlyConsumption      DOUBLE (5, 2),
    CurrentTotalAmount      DOUBLE (5, 2),
    FixedCharge             DOUBLE (4, 2),
    Sramadhana              DOUBLE (3, 2),
    AbsentCharge            DOUBLE (3, 2),
    TotalMonthlyAmount      DOUBLE (5, 2),
    Month                   STRING (8)    NOT NULL,
    TotalOutstandingMonthly DOUBLE (5, 2),
    MonthlyUsageUnit        INTEGER,
    LastPaymentDay          STRING (8) 
);


-- Table: payment
DROP TABLE IF EXISTS payment;

CREATE TABLE payment (
    pyid                STRING (20)   PRIMARY KEY,
    cid                 STRING (10)   REFERENCES Customer (cid),
    nic                 STRING (10),
    amount              DOUBLE (5, 2) NOT NULL,
    Date                STRING (8),
    oldOutStandingTotal DOUBLE (5, 2),
    NewOutStandingTotal DOUBLE (5, 2) 
);


-- Table: unit_price
DROP TABLE IF EXISTS unit_price;

CREATE TABLE unit_price (
    uid   STRING (4)    PRIMARY KEY ASC,
    lower INTEGER,
    upper INTEGER,
    price DOUBLE (4, 2) 
);

INSERT INTO unit_price (uid, lower, upper, price) VALUES (1, 0, 10, 50);
INSERT INTO unit_price (uid, lower, upper, price) VALUES (2, 10, 15, 75);
INSERT INTO unit_price (uid, lower, upper, price) VALUES (3, 15, 100, 100);

-- Trigger: backupOnUpdateMonthlyBillDetails
DROP TRIGGER IF EXISTS backupOnUpdateMonthlyBillDetails;
CREATE TRIGGER backupOnUpdateMonthlyBillDetails
        BEFORE UPDATE
            ON MonthlyBillDetails
BEGIN
    INSERT INTO BackupMonthlyBillDetails SELECT *
                                           FROM MonthlyBillDetails
                                          WHERE InvoiceNo = NEW.InvoiceNo;
END;


-- Trigger: getBackupPayment
DROP TRIGGER IF EXISTS getBackupPayment;
CREATE TRIGGER getBackupPayment
        BEFORE UPDATE
            ON payment
      FOR EACH ROW
BEGIN
    INSERT INTO backuppayment SELECT *
                                FROM payment
                               WHERE pyid = NEW.pyid;
END;


-- Trigger: validate_cid_before_insert_customer
DROP TRIGGER IF EXISTS validate_cid_before_insert_customer;
CREATE TRIGGER validate_cid_before_insert_customer
        BEFORE INSERT
            ON customer
      FOR EACH ROW
BEGIN
    SELECT CASE WHEN ( (
                           SELECT count(cid) 
                             FROM customer
                            WHERE cid = NEW.cid
                       )
>              0) THEN RAISE(ABORT, "Customer Id already exist") END;
END;


-- Trigger: validate_gid_before_insert_group
DROP TRIGGER IF EXISTS validate_gid_before_insert_group;
CREATE TRIGGER validate_gid_before_insert_group
        BEFORE INSERT
            ON [group]
      FOR EACH ROW
BEGIN
    SELECT CASE WHEN ( (
                           SELECT count(gid) 
                             FROM [group]
                            WHERE gid = NEW.gid
                       )
>              0) THEN RAISE(ABORT, "Group Id already exist") END;
END;


-- Trigger: validate_mbid_before_insert_BillData
DROP TRIGGER IF EXISTS validate_mbid_before_insert_BillData;
CREATE TRIGGER validate_mbid_before_insert_BillData
        BEFORE INSERT
            ON BillData
      FOR EACH ROW
BEGIN
    SELECT CASE WHEN ( (
                           SELECT count(mbid) 
                             FROM BillData
                            WHERE mbid = NEW.mbid
                       )
>              0) THEN RAISE(ABORT, "Bill data Id already exist") END;
END;


-- Trigger: validate_pyid_before_insert_payment
DROP TRIGGER IF EXISTS validate_pyid_before_insert_payment;
CREATE TRIGGER validate_pyid_before_insert_payment
        BEFORE INSERT
            ON payment
      FOR EACH ROW
BEGIN
    SELECT CASE WHEN ( (
                           SELECT count(pyid) 
                             FROM payment
                            WHERE pyid = NEW.pyid
                       )
>              0) THEN RAISE(ABORT, "Payment id already exist") END;
END;


COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
