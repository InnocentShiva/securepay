package mybatis.generate.mapper;

import java.util.List;
import mybatis.generate.model.Clientsecure;
import mybatis.generate.model.ClientsecureExample;
import org.apache.ibatis.annotations.Param;

public interface ClientsecureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clientsecure
     *
     * @mbg.generated
     */
    long countByExample(ClientsecureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clientsecure
     *
     * @mbg.generated
     */
    int deleteByExample(ClientsecureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clientsecure
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer clientId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clientsecure
     *
     * @mbg.generated
     */
    int insert(Clientsecure record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clientsecure
     *
     * @mbg.generated
     */
    int insertSelective(Clientsecure record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clientsecure
     *
     * @mbg.generated
     */
    List<Clientsecure> selectByExample(ClientsecureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clientsecure
     *
     * @mbg.generated
     */
    Clientsecure selectByPrimaryKey(Integer clientId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clientsecure
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Clientsecure record, @Param("example") ClientsecureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clientsecure
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Clientsecure record, @Param("example") ClientsecureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clientsecure
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Clientsecure record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clientsecure
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Clientsecure record);
}