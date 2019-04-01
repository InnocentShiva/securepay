package mybatis.generate.mapper;

import java.util.List;
import mybatis.generate.model.Usersecure;
import mybatis.generate.model.UsersecureExample;
import org.apache.ibatis.annotations.Param;

public interface UsersecureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usersecure
     *
     * @mbg.generated
     */
    long countByExample(UsersecureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usersecure
     *
     * @mbg.generated
     */
    int deleteByExample(UsersecureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usersecure
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usersecure
     *
     * @mbg.generated
     */
    int insert(Usersecure record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usersecure
     *
     * @mbg.generated
     */
    int insertSelective(Usersecure record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usersecure
     *
     * @mbg.generated
     */
    List<Usersecure> selectByExample(UsersecureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usersecure
     *
     * @mbg.generated
     */
    Usersecure selectByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usersecure
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Usersecure record, @Param("example") UsersecureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usersecure
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Usersecure record, @Param("example") UsersecureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usersecure
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Usersecure record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usersecure
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Usersecure record);
}