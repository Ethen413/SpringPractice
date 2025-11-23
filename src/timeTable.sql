CREATE TABLE task (
                      id BIGINT PRIMARY KEY AUTO_INCREMENT,
                      user_id BIGINT NOT NULL,
                      task_date DATE NOT NULL,
                      title VARCHAR(100) NOT NULL,
                      description TEXT,

    -- 可选计划时间
                      start_time TIME,
                      end_time TIME,

    -- 是否为每天固定任务
                      is_recurring TINYINT(1) DEFAULT 0,

    -- 任务结果
                      result_description TEXT,
                      result_value DOUBLE,
                      result_unit VARCHAR(20),

                      created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
                      updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,

                      FOREIGN KEY(user_id) REFERENCES user(id)
);