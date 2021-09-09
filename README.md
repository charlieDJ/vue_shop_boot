### 基于 https://github.com/xdwangwei/vue_shop 的代码，稍做修改。

### 前端代码地址：https://github.com/charlieDJ/vue_shop

### 启动前的操作
此项目已经将前端工程打包，不需要额外打包前端工程。
同时将数据库更换为H2，不需要用户安装mysql。但需要配置H2数据库的位置，即修改 spring.datasource.url 的值。
比如，spring.datasource.url=jdbc:h2:~/test，即把数据库放置在家目录下，对应文件名称为 test.mv.db。
test.mv.db 文件已经放在 resources/db/ 目录下。