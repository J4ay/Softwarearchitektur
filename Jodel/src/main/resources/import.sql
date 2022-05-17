INSERT INTO `swa`.`customers`
(`custID`,
`address`,
`department`,
`name`)
VALUES
(1,
"Esslingen am Neckar, Main Street 12",
"Sales",
"IT Designers");

INSERT INTO `swa`.`customers`
(`custID`,
`address`,
`department`,
`name`)
VALUES
(2,
"Stuttgart, Back Street 5",
"Logistik",
"LogiComp");

INSERT INTO `swa`.`contracts`
(`contID`,
`contractEndDate`,
`contractIp1`,
`contractIp2`,
`contractIp3`,
`contractLicenseKey`,
`contractNumFeature1`,
`contractNumFeature2`,
`contractNumFeature3`,
`contractStartDate`,
`contractVersion`)
VALUES
(1,
"2022-01-01",
"1.1.1.1",
null,
null,
"9mawd8ha0mdawdulhaknwdumaop298",
1,
2,
3,
"2022-12-31",
"0.1.0");

INSERT INTO `swa`.`contracts`
(`contID`,
`contractEndDate`,
`contractIp1`,
`contractIp2`,
`contractIp3`,
`contractLicenseKey`,
`contractNumFeature1`,
`contractNumFeature2`,
`contractNumFeature3`,
`contractStartDate`,
`contractVersion`)
VALUES
(2,
"2022-04-01",
"1.1.1.1",
null,
null,
"jsbdnasdqo89289n1ö23h1p23812woejqöpoi",
20,
40,
10,
"2022-05-05",
"1.3.2");

INSERT INTO `swa`.`User`
(
`USER_ID`,
`userLoginName`,
`userPassword`,
`userFirstName`,
`userLastName`,
`userMail`,
`userPhoneNumber1`,
`userPhoneNumber2`,
`isAdmin`)
VALUES
(
1,
"admin",
"123",
"Jay",
"Import",
"admin@email.com",
"0123456789",
"9876543210",
1);


INSERT INTO `swa`.`User`
(
`USER_ID`,
`userLoginName`,
`userPassword`,
`userFirstName`,
`userLastName`,
`userMail`,
`userPhoneNumber1`,
`userPhoneNumber2`,
`isAdmin`)
VALUES
(
2,
"root",
"root",
"Kyle",
"Mezger",
"root@email.de",
"133742069",
"694201337",
1);