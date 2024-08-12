--changeset stell:1
CREATE TABLE IF NOT EXISTS users
(
    id       BIGSERIAL PRIMARY KEY,
    name     VARCHAR(255) NOT NULL,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);
--rollback DROP TABLE users;

--changeset stell:2
CREATE TABLE IF NOT EXISTS tasks
(
    id              BIGSERIAL PRIMARY KEY,
    title           VARCHAR(255) NOT NULL,
    description     VARCHAR(255) NULL,
    status          VARCHAR(255) NOT NULL,
    expiration_date TIMESTAMP    NULL
);
--rollback DROP TABLE tasks;

--changeset stell:3
CREATE TABLE IF NOT EXISTS users_tasks
(
    user_id BIGINT NOT NULL,
    task_id BIGINT NOT NULL,
    PRIMARY KEY (user_id, task_id),
    CONSTRAINT fk_users_tasks_users FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE ON UPDATE NO ACTION,
    CONSTRAINT fk_users_tasks_tasks FOREIGN KEY (task_id) REFERENCES tasks (id) ON DELETE CASCADE ON UPDATE NO ACTION
);
--rollback DROP TABLE users_tasks;

--changeset stell:4
CREATE TABLE IF NOT EXISTS users_roles
(
    user_id BIGINT      NOT NULL,
    role    VARCHAR(50) NOT NULL,
    PRIMARY KEY (user_id, role),
    CONSTRAINT fk_users_roles_users FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE ON UPDATE NO ACTION
);
--rollback DROP TABLE users_roles;

--changeset stell:5
CREATE TABLE IF NOT EXISTS tasks_images
(
    task_id BIGINT       NOT NULL,
    image   VARCHAR(255) NOT NULL,
    CONSTRAINT fk_tasks_images_tasks FOREIGN KEY (task_id) REFERENCES tasks (id) ON DELETE CASCADE ON UPDATE NO ACTION
);
--rollback DROP TABLE tasks_images;