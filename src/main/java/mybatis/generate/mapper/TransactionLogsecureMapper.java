package mybatis.generate.mapper;

import java.util.List;
import mybatis.generate.model.TransactionLogsecure;
import mybatis.generate.model.TransactionLogsecureExample;
import org.apache.ibatis.annotations.Param;

public interface TransactionLogsecureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    long countByExample(TransactionLogsecureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    int deleteByExample(TransactionLogsecureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String transactionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    int insert(TransactionLogsecure record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    int insertSelective(TransactionLogsecure record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    List<TransactionLogsecure> selectByExample(TransactionLogsecureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    TransactionLogsecure selectByPrimaryKey(String transactionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TransactionLogsecure record, @Param("example") TransactionLogsecureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TransactionLogsecure record, @Param("example") TransactionLogsecureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TransactionLogsecure record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TransactionLogsecure record);
}