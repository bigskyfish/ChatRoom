CREATE TABLE `t_user` (
  `id` int(9) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` int(9) NOT NULL COMMENT '用户id',
  `username` varchar(50) NOT NULL DEFAULT '' COMMENT '用户昵称',
  `loginname` varchar(50) NOT NULL DEFAULT '' COMMENT '登录账号',
  `password` varchar(50) NOT NULL DEFAULT '' COMMENT '密码（加密处理）',
  `email` varchar(50) NOT NULL DEFAULT '' COMMENT '邮箱',
  `phone` varchar(11) DEFAULT '' COMMENT '手机号',
  PRIMARY KEY (`id`),
  UNIQUE KEY `fk_loginname` (`loginname`) USING HASH,
  KEY `fk_userid` (`userid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;