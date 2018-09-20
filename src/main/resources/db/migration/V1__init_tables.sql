CREATE TABLE IF NOT EXISTS `aluno` (
  `id` bigint(20) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `serie` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `reposanvel_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKlkuimq8s8wjtry3gq54fdg9yc` (`reposanvel_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS `comunicado` (
  `id` bigint(20) NOT NULL,
  `texto` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


CREATE TABLE IF NOT EXISTS `nota` (
  `id` bigint(20) NOT NULL,
  `nota` decimal(19,2) DEFAULT NULL,
  `aluno_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK7ntsgem4ql46uy34ile14rg74` (`aluno_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS `responsavel` (
  `id` bigint(20) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

