START TRANSACTION;
USE `patientregsys`;

INSERT INTO `patientregsys`.`Patient`(`Patientcol_ID`, `Patientcol_name`, `Patientcol_surname`, `Patientcol_otchestvo`, `Patientcol_sex`, `Patientcol_dateOfBirth`, `Patientcol_post`, `Patientcol_pasportData`, `Patientcol_numberMedPolis`, `Patientcol_dateOutPolis`, `Patientcol_address`, `Patientcol_phone`, `Patientcol_email`, `Patientcol_alergies`, `Patientcol_discription`) 
VALUES (DEFAULT, 'Гарри', 'Поттер', 'Book', 'man', '1981-08-31', 'ученик школы', 'SF 546522522', '25613531533135', '2017-10-14', 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Tenetur, sapiente!', '380669371161', 'potter@rouling.com', 'Воландеморт', 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Blanditiis repellat adipisci corrupti asperiores soluta laborum beatae! Praesentium doloribus animi rerum quos qui tempora ex aliquid porro. Voluptatem quidem, dignissimos rem ex cumque vitae perferendis doloremque unde nulla? Labore, cupiditate odio!'),
(DEFAULT, 'Альбус', 'Дамблдор', 'Book', 'man', '1882-05-20', 'директор школы', 'КР 256699942', NULL, NULL, 'Lorem ipsum dolor sit, amet consectetur adipisicing elit. Reiciendis, architecto?', NULL, NULL, 'Воландеморт', 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Blanditiis repellat adipisci corrupti asperiores soluta laborum beatae! Praesentium doloribus animi rerum quos qui tempora ex aliquid porro. Voluptatem quidem, dignissimos rem ex cumque vitae perferendis doloremque unde nulla? Labore, cupiditate odio!'),
(DEFAULT, 'Римус', 'Люпин', 'Book', 'man', '1962-10-12', 'безработный', 'КР 955422531', NULL, NULL, 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Tenetur, sapiente!', '380664585225', NULL, 'полная луна', 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Blanditiis repellat adipisci corrupti asperiores soluta laborum beatae! Praesentium doloribus animi rerum quos qui tempora ex aliquid porro. Voluptatem quidem, dignissimos rem ex cumque vitae perferendis doloremque unde nulla? Labore, cupiditate odio!'),
(DEFAULT, 'Лаванда', ' Браун', 'Book', 'woman', '1980-11-21', 'ученик школы', 'RH 585582455', '31531531331531', '2019-10-10', 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Tenetur, sapiente!', NULL, NULL, NULL, 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Blanditiis repellat adipisci corrupti asperiores soluta laborum beatae! Praesentium doloribus animi rerum quos qui tempora ex aliquid porro. Voluptatem quidem, dignissimos rem ex cumque vitae perferendis doloremque unde nulla? Labore, cupiditate odio!'),
(DEFAULT, 'Годрик', 'Гриффиндор', 'BookBookBook', 'man', '1000-05-10', 'рыцарь', NULL, NULL, NULL, 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Tenetur, sapiente!', NULL, NULL, NULL, 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Blanditiis repellat adipisci corrupti asperiores soluta laborum beatae! Praesentium doloribus animi rerum quos qui tempora ex aliquid porro. Voluptatem quidem, dignissimos rem ex cumque vitae perferendis doloremque unde nulla? Labore, cupiditate odio!'),
(DEFAULT, 'Анджелина', 'Джонсон', 'Book', 'woman', '1978-10-24', 'ученик школы', NULL, '53153153131535', '2020-02-21', 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Tenetur, sapiente!', NULL, NULL, NULL, 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Blanditiis repellat adipisci corrupti asperiores soluta laborum beatae! Praesentium doloribus animi rerum quos qui tempora ex aliquid porro. Voluptatem quidem, dignissimos rem ex cumque vitae perferendis doloremque unde nulla? Labore, cupiditate odio!'),
(DEFAULT, 'Найджел', 'Уолперт', 'Book', 'man', '1980-10-07', 'ученик школы', NULL, '15315315313153', '2021-10-15', 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Tenetur, sapiente!', NULL, NULL, NULL, 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Blanditiis repellat adipisci corrupti asperiores soluta laborum beatae! Praesentium doloribus animi rerum quos qui tempora ex aliquid porro. Voluptatem quidem, dignissimos rem ex cumque vitae perferendis doloremque unde nulla? Labore, cupiditate odio!'),
(DEFAULT, 'Минерва', 'Макгонагалл', 'Book', 'woman', '1955-01-01', 'зам. директора школы', 'КР 86515412', '51315315313538', '2000-05-17', 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Tenetur, sapiente!', NULL, NULL, 'шерсть', 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Blanditiis repellat adipisci corrupti asperiores soluta laborum beatae! Praesentium doloribus animi rerum quos qui tempora ex aliquid porro. Voluptatem quidem, dignissimos rem ex cumque vitae perferendis doloremque unde nulla? Labore, cupiditate odio!');

INSERT INTO `patientregsys`.`PositionBuild` (`PositionBuildcol_Id`, `PositionBuildcol_name`) 
VALUES (DEFAULT, 'Корпус А'), (DEFAULT, 'Корпус Б'), (DEFAULT, 'Корпус С');

INSERT INTO `patientregsys`.`Doctor` (`Doctorcol_ID`, `Doctorcol_name`, `Doctorcol_surname`, `Doctorcol_otchestvo`, `Doctorcol_dateOfBirth`, `Doctorcol_discription`, `Doctorcol_specialnost`, `Doctorcol_university`, `Doctorcol_address`, `Doctorcol_phone`, `login`, `password`, `type`)VALUES (DEFAULT, 'Михаил', 'Шегда', 'Михайлович', '1990-09-15', '1978-05-10', 'none', 'БДПУ', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque bibendum euismod sodales. Curabitur id mauris arcu. Aliquam eu nisi vitae. ', '308966951894', 'nurseadmin', '0000', 'admin'),
(DEFAULT, 'Артем', 'Дубинский', 'Александрович', '1982-10-30', 'інфо інфо', 'терапевт', 'КМДУ', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur eu ex sit amet augue congue placerat vitae at magna. Nam. ', '380669595864', 'nurse', '0000', DEFAULT),
(DEFAULT, 'Some', 'Some', 'Some', '1978-05-10', 'some', 'хирург', 'АЦПК', 'Lorem ipsum, dolor sit amet consectetur adipisicing elit. Dignissimos corporis totam aliquam.', '380664758116', 'some', '0000', 'doctor');

INSERT INTO `patientregsys`.`status` (`statuscol_ID`, `statuscol_name`, `statuscol_description`)
VALUES (DEFAULT, 'запись на обследование', NULL),
(DEFAULT, 'обследование', NULL),
(DEFAULT, 'лечение', NULL),
(DEFAULT, 'прервано лечение', NULL),
(DEFAULT, 'завершено лечение', NULL),
(DEFAULT, 'не излечимо', NULL),
(DEFAULT, 'смерть', NULL);


INSERT INTO `patientregsys`.`medicalsession` (`Patient_Patientcol_ID`, `MedicalSessioncol_dateRegistration`,`MedicalSessioncol_dateRegistrationDown` , `MedicalSessioncol_diagnoz`, `MedicalSessioncol_medicaments`, `MedicalSessioncol_discriptions`, `MedicalSessioncol_positionfloor`, `MedicalSessioncol_possitionward`, `MedicalSessioncol__possitionbad`, `PositionBuild_PositionBuildcol_Id`, `Doctor_Doctorcol_ID`, `status_statuscol_ID`)
VALUES(2, '2020-04-12', null, 'сахарный диабет', 'Амапирид, Амарил, Аторвакор', 'осложнение возрастом', 2, 5, 2, 2, 2, 3),
(1, '2020-03-15', '2020-05-17', 'грифиндор головного мозга', null, 'буйный нрав', 2, 5, 3, 2, 2, 6),
(8, '2020-02-01', '2020-04-20', 'ГРИП', 'Грипобор, ингаляции, антибиотик "Валортон-Екстра"', 'запущеное состояние', 1, 6, 1, 1, 3, 5),
(5, '2020-02-02', '2020-04-20', 'ГРИП', 'Грипобор, ингаляции, антибиотик "Валортон-Екстра"', 'запущеное состояние', 3, 1, 1, 2, 2, 4),
(2, '2020-01-20', null, 'ГРИП', 'Грипобор, ингаляции, антибиотик "Валортон-Екстра"', 'запущеное состояние', 2, 8, 3, 3, 1, 7),
(8, '2020-03-01', null, 'ГРИП', 'Грипобор, ингаляции, антибиотик "Валортон-Екстра"', 'запущеное состояние', 4, 3, 6, 1, 2, 1);


COMMIT;