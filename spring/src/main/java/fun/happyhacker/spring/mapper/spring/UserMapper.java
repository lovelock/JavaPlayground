package fun.happyhacker.spring.mapper.spring;

import static fun.happyhacker.spring.mapper.UserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import fun.happyhacker.spring.model.spring.User;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface UserMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.343+08:00", comments="Source Table: users")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, mobile, address, age);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.342+08:00", comments="Source Table: users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.342+08:00", comments="Source Table: users")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.342+08:00", comments="Source Table: users")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Long.class)
    int insert(InsertStatementProvider<User> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.342+08:00", comments="Source Table: users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserResult")
    Optional<User> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.342+08:00", comments="Source Table: users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="age", property="age", jdbcType=JdbcType.TINYINT)
    })
    List<User> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.342+08:00", comments="Source Table: users")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.342+08:00", comments="Source Table: users")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.343+08:00", comments="Source Table: users")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.343+08:00", comments="Source Table: users")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.343+08:00", comments="Source Table: users")
    default int insert(User record) {
        return MyBatis3Utils.insert(this::insert, record, user, c ->
            c.map(name).toProperty("name")
            .map(mobile).toProperty("mobile")
            .map(address).toProperty("address")
            .map(age).toProperty("age")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.343+08:00", comments="Source Table: users")
    default int insertSelective(User record) {
        return MyBatis3Utils.insert(this::insert, record, user, c ->
            c.map(name).toPropertyWhenPresent("name", record::getName)
            .map(mobile).toPropertyWhenPresent("mobile", record::getMobile)
            .map(address).toPropertyWhenPresent("address", record::getAddress)
            .map(age).toPropertyWhenPresent("age", record::getAge)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.343+08:00", comments="Source Table: users")
    default Optional<User> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.343+08:00", comments="Source Table: users")
    default List<User> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.343+08:00", comments="Source Table: users")
    default List<User> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.344+08:00", comments="Source Table: users")
    default Optional<User> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.344+08:00", comments="Source Table: users")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.344+08:00", comments="Source Table: users")
    static UpdateDSL<UpdateModel> updateAllColumns(User record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalTo(record::getName)
                .set(mobile).equalTo(record::getMobile)
                .set(address).equalTo(record::getAddress)
                .set(age).equalTo(record::getAge);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.344+08:00", comments="Source Table: users")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(User record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalToWhenPresent(record::getName)
                .set(mobile).equalToWhenPresent(record::getMobile)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(age).equalToWhenPresent(record::getAge);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.344+08:00", comments="Source Table: users")
    default int updateByPrimaryKey(User record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(mobile).equalTo(record::getMobile)
            .set(address).equalTo(record::getAddress)
            .set(age).equalTo(record::getAge)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-07T14:15:04.344+08:00", comments="Source Table: users")
    default int updateByPrimaryKeySelective(User record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(mobile).equalToWhenPresent(record::getMobile)
            .set(address).equalToWhenPresent(record::getAddress)
            .set(age).equalToWhenPresent(record::getAge)
            .where(id, isEqualTo(record::getId))
        );
    }
}