/**
 * Author:  Hasan
 * Created: Sep 24, 2016
 */

CREATE TABLE pjbank.portfolio
(FundName VARCHAR(255) NOT NULL,
shares INTEGER,
PurchasePrice VARCHAR(255),
CurrentPrice VARCHAR(255),
currentValue VARCHAR(255),
PRIMARY KEY (FundName));