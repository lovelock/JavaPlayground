package fun.happyhacker.spring.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.341+08:00", comments="Source Table: users")
    public static final User user = new User();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.342+08:00", comments="Source field: users.id")
    public static final SqlColumn<Long> id = user.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.342+08:00", comments="Source field: users.name")
    public static final SqlColumn<String> name = user.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.342+08:00", comments="Source field: users.mobile")
    public static final SqlColumn<String> mobile = user.mobile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.342+08:00", comments="Source field: users.address")
    public static final SqlColumn<String> address = user.address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.342+08:00", comments="Source field: users.age")
    public static final SqlColumn<Byte> age = user.age;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.341+08:00", comments="Source Table: users")
    public static final class User extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> mobile = column("mobile", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<Byte> age = column("age", JDBCType.TINYINT);

        public User() {
            super("users");
        }
    }
}