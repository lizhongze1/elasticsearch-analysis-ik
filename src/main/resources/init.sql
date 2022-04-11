CREATE TABLE `ik_dynamic_dic`  (
  `lexicon_id` bigint(8) NOT NULL AUTO_INCREMENT COMMENT '词库id',
  `lexicon_text` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '词条关键词',
  `lexicon_type` int(1) NOT NULL DEFAULT 0 COMMENT '0扩展词库 1停用词库',
  `lexicon_status` int(1) NOT NULL DEFAULT 0 COMMENT '词条状态 0正常 1暂停使用',
  `del_flag` int(1) NOT NULL DEFAULT 0 COMMENT '作废标志 0正常 1作废',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`lexicon_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'ES远程扩展词库表' ROW_FORMAT = Dynamic;
