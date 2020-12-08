CREATE TABLE `trek_detail` (
  `id` bigint NOT NULL,
  `altitutde` varchar(255) DEFAULT NULL,
  `base_camp` varchar(255) DEFAULT NULL,
  `detailed_itenrary` varchar(255) DEFAULT NULL,
  `difficulty` varchar(255) DEFAULT NULL,
  `distance` varchar(255) DEFAULT NULL,
  `duration` varchar(255) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `services` varchar(255) DEFAULT NULL,
  `short_itenrary` varchar(255) DEFAULT NULL,
  `trek_description` varchar(255) DEFAULT NULL,
  `trek_name` varchar(255) DEFAULT NULL,
  `visitng_time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `trek_schedule` (
  `id` bigint NOT NULL,
  `from_date` varchar(255) DEFAULT NULL,
  `max_seat` varchar(255) DEFAULT NULL,
  `registered_seat` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `to_date` varchar(255) DEFAULT NULL,
  `trekdetail_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKrfylvf12qf7cchh94n13c87mp` (`trekdetail_id`),
  CONSTRAINT `FKrfylvf12qf7cchh94n13c87mp` FOREIGN KEY (`trekdetail_id`) REFERENCES `trek_detail` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `user_login` (
  `id` bigint NOT NULL,
  `email_id` varchar(255) DEFAULT NULL,
  `weight` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `contact_no` varchar(255) DEFAULT NULL,
  `created_on` varchar(255) DEFAULT NULL,
  `date_of_birth` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `height` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `pin_code` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `updated_on` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `user_booking_details` (
  `id` bigint NOT NULL,
  `weight` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `booking_status` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `contact_no` varchar(255) DEFAULT NULL,
  `created_on` varchar(255) DEFAULT NULL,
  `date_of_birth` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `height` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `pin_code` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `updated_on` varchar(255) DEFAULT NULL,
  `trekschedule_id` bigint DEFAULT NULL,
  `user_login_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6dthy43l0vnipnpwwculj7kke` (`trekschedule_id`),
  KEY `FKmsgb271ak27268b1prfym0gdo` (`user_login_id`),
  CONSTRAINT `FK6dthy43l0vnipnpwwculj7kke` FOREIGN KEY (`trekschedule_id`) REFERENCES `trek_schedule` (`id`),
  CONSTRAINT `FKmsgb271ak27268b1prfym0gdo` FOREIGN KEY (`user_login_id`) REFERENCES `user_login` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `group_member_details` (
  `id` bigint NOT NULL,
  `weight` varchar(255) DEFAULT NULL,
  `contact_no` varchar(255) DEFAULT NULL,
  `date_of_birth` varchar(255) DEFAULT NULL,
  `group_member_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `height` varchar(255) DEFAULT NULL,
  `user_booking_details_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1pqhswq4ndxoq4bvdfour6hgc` (`user_booking_details_id`),
  CONSTRAINT `FK1pqhswq4ndxoq4bvdfour6hgc` FOREIGN KEY (`user_booking_details_id`) REFERENCES `user_booking_details` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `booking_transaction_details` (
  `id` bigint NOT NULL,
  `amount` varchar(255) DEFAULT NULL,
  `date_of_birth` varchar(255) DEFAULT NULL,
  `gateway_setting_id` varchar(255) DEFAULT NULL,
  `refernce_transaction_id` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `transaction_id` varchar(255) DEFAULT NULL,
  `user_booking_detail_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKkusy1m53n4xsxldmaa4xuagkl` (`user_booking_detail_id`),
  CONSTRAINT `FKkusy1m53n4xsxldmaa4xuagkl` FOREIGN KEY (`user_booking_detail_id`) REFERENCES `user_booking_details` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `gateway_setting` (
  `id` bigint NOT NULL,
  `authrisation_code` varchar(255) DEFAULT NULL,
  `double_verfication_url` varchar(255) DEFAULT NULL,
  `encryption_key` varchar(255) DEFAULT NULL,
  `gateway_name` varchar(255) DEFAULT NULL,
  `merchant_code` varchar(255) DEFAULT NULL,
  `secret_id` varchar(255) DEFAULT NULL,
  `transaction_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


