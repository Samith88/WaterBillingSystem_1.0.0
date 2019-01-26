-- Table: group
CREATE TABLE groups (gid STRING (10) PRIMARY KEY, gname STRING (20) NOT NULL, location STRING (20), description STRING (30));
INSERT INTO groups (gid, gname, location, description) VALUES (1, 'up', 'down', 'down');
INSERT INTO groups (gid, gname, location, description) VALUES (2, 'down', 'up', 'up');
INSERT INTO groups (gid, gname, location, description) VALUES (3, 'right', 'right', 'desc3');
INSERT INTO groups (gid, gname, location, description) VALUES (4, 'left', 'lect', 'desc4');
INSERT INTO groups (gid, gname, location, description) VALUES (5, 'NewGroup', 'NewLocation', 'test');

-- Table: unit_price
CREATE TABLE unit_price (uid STRING (4) PRIMARY KEY ASC, lower INTEGER, upper INTEGER, price DOUBLE (4, 2));
INSERT INTO unit_price (uid, lower, upper, price) VALUES (1, 0, 10, 50.0);
INSERT INTO unit_price (uid, lower, upper, price) VALUES (2, 10, 15, 75.0);
INSERT INTO unit_price (uid, lower, upper, price) VALUES (3, 15, 100, 100.0);

-- Table: Customer
CREATE TABLE Customer (cid STRING (10) NOT NULL UNIQUE, nic STRING (10) UNIQUE, address_1 STRING (30), address_2 STRING (30), address_3 STRING (30), gid STRING (10) REFERENCES groups (gid), preMeter INTEGER, currentMeter INTEGER, TotalOutstandingAmount DOUBLE (5, 2), MeterNo INTEGER, lastPayment DOUBLE (5, 2), cname STRING (60), CFirstName STRING (15), lastPaymentDate STRING (10), InitialFeeTotal DOUBLE (5, 2), InitialReceived DOUBLE (5, 2));
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (1, '883512847v', 'ertert', 'ertert', 'ertret', '1', 0, 17, 300.0, 5646456, 1100.0, 'ffg', 'Samith', '2019/01/22', 10000.0, 700.0);
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (2, '883512848v', 'sdfdf', 'sdf', 'dsfd', '1', 0, 0, 0.0, 5435, 0.0, 'sdfds', 'sdfds', NULL, 10000.0, 10000.0);
INSERT INTO Customer (cid, nic, address_1, address_2, address_3, gid, preMeter, currentMeter, TotalOutstandingAmount, MeterNo, lastPayment, cname, CFirstName, lastPaymentDate, InitialFeeTotal, InitialReceived) VALUES (3, '882311333v', 'cfdgdf', 'dfgd', 'fgdf', '1', 0, 0, 0.0, 334443, 0.0, 'erter', 'ertret', NULL, 1000.0, 1000.0);

-- Table: BillData
CREATE TABLE BillData (mbid STRING (10) PRIMARY KEY, cid STRING (10) REFERENCES Customer (cid), nic STRING (10), NewMeter INTEGER, Sramadhana INTEGER, AbsentCharge INTEGER, Month STRING NOT NULL, OldMeter INTEGER, MonthlyUsageUnit INTEGER);
INSERT INTO BillData (mbid, cid, nic, NewMeter, Sramadhana, AbsentCharge, Month, OldMeter, MonthlyUsageUnit) VALUES (201901001, 1, NULL, 17, 0, 1, 201901, 0, 0);

-- Table: chargingType
CREATE TABLE chargingType (
    chId     INTEGER       PRIMARY KEY ASC ON CONFLICT ROLLBACK,
    chName   STRING (20),
    chAmount DOUBLE (4, 2),
    chDesc   STRING (20) 
);


-- Table: MonthlyBillDetails
CREATE TABLE MonthlyBillDetails (InvoiceNo STRING (10) PRIMARY KEY, cid STRING (10) REFERENCES Customer (cid), nic STRING (10), GroupId STRING (10), OldMeter INTEGER, NewMeter INTEGER, MonthlyConsumption DOUBLE (5, 2), CurrentTotalAmount DOUBLE (5, 2), FixedCharge DOUBLE (4, 2), Sramadhana DOUBLE (3, 2), AbsentCharge DOUBLE (3, 2), TotalMonthlyAmount DOUBLE (5, 2), Month STRING (8) NOT NULL, TotalOutstandingMonthly DOUBLE (5, 2), MonthlyUsageUnit INTEGER, LastPaymentDay STRING (8));
INSERT INTO MonthlyBillDetails (InvoiceNo, cid, nic, GroupId, OldMeter, NewMeter, MonthlyConsumption, CurrentTotalAmount, FixedCharge, Sramadhana, AbsentCharge, TotalMonthlyAmount, Month, TotalOutstandingMonthly, MonthlyUsageUnit, LastPaymentDay) VALUES (201901001, 1, NULL, 'up', 0, 17, 1075.0, 0.0, 300.0, 0.0, 25.0, 1400.0, 201901, 1400.0, 17, '02/2019');

-- Table: BackupMonthlyBillDetails
CREATE TABLE BackupMonthlyBillDetails (InvoiceNo STRING (10), cid STRING (10), nic STRING (10), GroupId STRING (10), OldMeter INTEGER, NewMeter INTEGER, MonthlyConsumption DOUBLE (5, 2), CurrentTotalAmount DOUBLE (5, 2), FixedCharge DOUBLE (4, 2), Sramadhana DOUBLE (3, 2), AbsentCharge DOUBLE (3, 2), TotalMonthlyAmount DOUBLE (5, 2), Month STRING (8) NOT NULL, TotalOutstandingMonthly DOUBLE (5, 2), MonthlyUsageUnit INTEGER, LastPaymentDay STRING (8));
INSERT INTO BackupMonthlyBillDetails (InvoiceNo, cid, nic, GroupId, OldMeter, NewMeter, MonthlyConsumption, CurrentTotalAmount, FixedCharge, Sramadhana, AbsentCharge, TotalMonthlyAmount, Month, TotalOutstandingMonthly, MonthlyUsageUnit, LastPaymentDay) VALUES (201901001, 1, NULL, '', 0, 15, 875.0, 100.0, 300.0, 25.0, 25.0, 1225.0, '01/2019', 1325.0, 15, '02/2019');
INSERT INTO BackupMonthlyBillDetails (InvoiceNo, cid, nic, GroupId, OldMeter, NewMeter, MonthlyConsumption, CurrentTotalAmount, FixedCharge, Sramadhana, AbsentCharge, TotalMonthlyAmount, Month, TotalOutstandingMonthly, MonthlyUsageUnit, LastPaymentDay) VALUES (201801002, 2, NULL, 'up', 0, 19, 1275.0, 454.0, 300.0, 25.0, 0.0, 1600.0, '01/2019', 2054.0, 19, '02/2019');
INSERT INTO BackupMonthlyBillDetails (InvoiceNo, cid, nic, GroupId, OldMeter, NewMeter, MonthlyConsumption, CurrentTotalAmount, FixedCharge, Sramadhana, AbsentCharge, TotalMonthlyAmount, Month, TotalOutstandingMonthly, MonthlyUsageUnit, LastPaymentDay) VALUES (201901003, 3, NULL, 'up', 0, 21, 1475.0, 343.0, 300.0, 25.0, 0.0, 1800.0, 12019, 2143.0, 21, '02/2019');
INSERT INTO BackupMonthlyBillDetails (InvoiceNo, cid, nic, GroupId, OldMeter, NewMeter, MonthlyConsumption, CurrentTotalAmount, FixedCharge, Sramadhana, AbsentCharge, TotalMonthlyAmount, Month, TotalOutstandingMonthly, MonthlyUsageUnit, LastPaymentDay) VALUES (201901001, 1, NULL, 'up', 0, 15, 875.0, 0.0, 300.0, 25.0, 25.0, 1225.0, 201901, 1225.0, 15, '02/2019');


-- Table: payment
CREATE TABLE payment (pyid STRING (20) PRIMARY KEY, cid STRING (10) REFERENCES Customer (cid), nic STRING (10) REFERENCES customer (nic), amount DOUBLE (5, 2) NOT NULL, Date STRING (8), oldOutStandingTotal DOUBLE (5, 2), NewOutStandingTotal DOUBLE (5, 2));
INSERT INTO payment (pyid, cid, nic, amount, Date, oldOutStandingTotal, NewOutStandingTotal) VALUES (201901220228001, '1', 'null', 1100.0, '2019/01/22', 1400.0, 300.0);

-- Trigger: backupOnUpdateMonthlyBillDetails
CREATE TRIGGER backupOnUpdateMonthlyBillDetails BEFORE UPDATE ON MonthlyBillDetails BEGIN insert into BackupMonthlyBillDetails select * from MonthlyBillDetails where InvoiceNo = NEW.InvoiceNo
; END;

-- Trigger: validate_cid_before_insert_customer
CREATE TRIGGER validate_cid_before_insert_customer BEFORE INSERT ON customer FOR EACH ROW BEGIN SELECT CASE WHEN ((SELECT count(cid) FROM customer WHERE cid = NEW.cid) > 0 or (SELECT count(nic) FROM customer WHERE nic = NEW.nic) > 0) THEN RAISE (ABORT, 'Customer Id or NIC already exist') END; END;

-- Trigger: validate_gid_before_insert_group
CREATE TRIGGER validate_gid_before_insert_group BEFORE INSERT ON "group" FOR EACH ROW BEGIN SELECT CASE WHEN ((SELECT count(gid) FROM "group" WHERE gid = NEW.gid) > 0) THEN RAISE (ABORT, 'Group Id already exist') END; END;

-- Trigger: validate_mbid_before_insert_BillData
CREATE TRIGGER validate_mbid_before_insert_BillData BEFORE INSERT ON BillData FOR EACH ROW BEGIN SELECT CASE WHEN ((SELECT count(mbid) FROM BillData WHERE mbid = NEW.mbid) > 0) THEN RAISE (ABORT, 'Bill data Id already exist') END; END;

-- Trigger: validate_pyid_before_insert_payment
CREATE TRIGGER validate_pyid_before_insert_payment BEFORE INSERT ON payment FOR EACH ROW BEGIN SELECT CASE WHEN ((SELECT count(pyid) FROM payment WHERE pyid = NEW.pyid) > 0) THEN RAISE (ABORT, 'Payment id already exist') END; END;

-- Trigger: validate_uid_before_insert_unit_price
CREATE TRIGGER validate_uid_before_insert_unit_price BEFORE INSERT ON unit_price FOR EACH ROW BEGIN SELECT CASE WHEN ((SELECT count(uid) FROM BillData WHERE uid = NEW.uid) > 0) THEN RAISE (ABORT, 'Unit charge Id already exist') END; END;
